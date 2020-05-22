
package dao;

import model.Jogo;
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
public class JogoDAO {

    @Inject 
    private EntityManager manager;
    
    public JogoDAO() {
    }

    
    public Jogo create(Jogo entity) {
        try {
            manager.persist(entity);
        } catch (Exception e) {
            return null;
        }
        return entity;
    }

    public Jogo update(Jogo entity) {
        manager.merge(entity);
        return entity;
    }

    public Jogo find(Integer id) {
        return manager.find(Jogo.class, id);
    }

    public boolean delete(Jogo entity) {
        try {
            manager.remove(entity);
        } catch (Exception e) {
            return false;
        }
        return true;
    }
    
    public List<Jogo> findAllUsers() {
        try {
            List<Jogo> lista = manager.createQuery("from Jogo e where e.estado=1 order by e.id").getResultList();
            return lista;
        } catch (Exception e) {
            throw e;
        }
    }
    
    public List<Jogo> getByNome(String nome){
        Query q = manager.createQuery("SELECT u FROM Jogo u WHERE lower(u.nome) LIKE lower(:nome)");
        q.setParameter("nome", "%" + nome + "%");
        List<Jogo> u = q.getResultList();
        return u;
    }
}
