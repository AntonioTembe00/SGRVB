
package dao;

import model.Mensagem;
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
public class MensagemDAO {

    @Inject 
    private EntityManager manager;
    
    public MensagemDAO() {
    }

    
    public Mensagem create(Mensagem entity) {
        try {
            entity.setId(null);
            manager.persist(entity);
        } catch (Exception e) {
            return null;
        }
        return entity;
    }

    public Mensagem update(Mensagem entity) {
        manager.merge(entity);
        return entity;
    }

    public Mensagem find(Integer id) {
        return manager.find(Mensagem.class, id);
    }
     public List<Mensagem> findAllUsers1(int uso) {
        try {
            
            List<Mensagem> lista = manager.createQuery("from Mensagem e where e.estado=1 and e.receptor="+uso).getResultList();
          
            return lista;
        } catch (Exception e) {
            throw e;
        }
    }

    public boolean delete(Mensagem entity) {
        try {
            manager.remove(entity);
        } catch (Exception e) {
            return false;
        }
        return true;
    }
    
    public List<Mensagem> findAllUsers() {
        try {
            List<Mensagem> lista = manager.createQuery("from Mensagem e where e.estado=1  order by e.id").getResultList();
            return lista;
        } catch (Exception e) {
            throw e;
        }
    }
    
    public List<Mensagem> getByNome(String nome){
        Query q = manager.createQuery("SELECT u FROM Mensagem u WHERE lower(u.nome) LIKE lower(:nome)");
        q.setParameter("nome", "%" + nome + "%");
        List<Mensagem> u = q.getResultList();
        return u;
    }
}
