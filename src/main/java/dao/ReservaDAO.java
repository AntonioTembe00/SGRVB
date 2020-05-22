
package dao;

import model.Reserva;
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
public class ReservaDAO {

    @Inject 
    private EntityManager manager;
    
    public ReservaDAO() {
    }

    
    public Reserva create(Reserva entity) {
        try {
            manager.persist(entity);
        } catch (Exception e) {
            return null;
        }
        return entity;
    }

    public Reserva update(Reserva entity) {
        manager.merge(entity);
        return entity;
    }

    public Reserva find(Integer id) {
        return manager.find(Reserva.class, id);
    }

    public boolean delete(Reserva entity) {
        try {
            manager.remove(entity);
        } catch (Exception e) {
            return false;
        }
        return true;
    }
    
    public List<Reserva> findAllUsers() {
        try {
            List<Reserva> lista = manager.createQuery("from Reserva e where e.estado=1 order by e.id").getResultList();
            return lista;
        } catch (Exception e) {
            throw e;
        }
    }
    
    public List<Reserva> getByNome(String nome){
        Query q = manager.createQuery("SELECT u FROM Reserva u WHERE lower(u.nome) LIKE lower(:nome)");
        q.setParameter("nome", "%" + nome + "%");
        List<Reserva> u = q.getResultList();
        return u;
    }
}
