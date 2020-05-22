
package dao;

import model.Evento;
import java.util.List;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.enterprise.context.RequestScoped;
import javax.swing.JOptionPane;

/**
 *
 * @author 
 */
@RequestScoped
public class EventoDAO {

    @Inject 
    private EntityManager manager;
    
    public EventoDAO() {
    }

    
    public Evento create(Evento entity) {
        try {
            manager.persist(entity);
        } catch (Exception e) {
            return null;
        }
        return entity;
    }

    public Evento update(Evento entity) {
        manager.merge(entity);
        return entity;
    }

    public Evento find(Integer id) {
        return manager.find(Evento.class, id);
    }

    public boolean delete(Evento entity) {
        try {
            manager.remove(entity);
        } catch (Exception e) {
            return false;
        }
        return true;
    }
    
    public List<Evento> findAllUsers() {
        try {
            List<Evento> lista = manager.createQuery("from Evento e where e.estado=1 order by e.id").getResultList();
            return lista;
        } catch (Exception e) {
            throw e;
        }
    }
    
    public List<Evento> getByNome(String nome){
        Query q = manager.createQuery("SELECT u FROM Evento u WHERE lower(u.nome) LIKE lower(:nome)");
        q.setParameter("nome", "%" + nome + "%");
        List<Evento> u = q.getResultList();
        return u;
    }
}
