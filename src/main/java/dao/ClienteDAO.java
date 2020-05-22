
package dao;

import model.Cliente;
import java.util.List;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.enterprise.context.RequestScoped;

/**
 *
 * @author 
 */
@RequestScoped
public class ClienteDAO {

    @Inject 
    private EntityManager manager;
    
    public ClienteDAO() {
    }

    
    public Cliente create(Cliente entity) {
        try {
            entity.setId(null);
            manager.persist(entity);
        } catch (Exception e) {
            return null;
        }
        return entity;
    }

    public Cliente update(Cliente entity) {
        manager.merge(entity);
        return entity;
    }

    public Cliente find(Integer id) {
        return manager.find(Cliente.class, id);
    }

    public boolean delete(Cliente entity) {
        try {
            manager.remove(entity);
        } catch (Exception e) {
            return false;
        }
        return true;
    }
    
   public List<Cliente> findAllUsers() {
        try {
            List<Cliente> lista = manager.createQuery("from Cliente e where e.estado=1  order by e.id").getResultList();
            return lista;
        } catch (Exception e) {
            throw e;
        }
    }
 
     
      public List<Cliente> findAllUsers1(int uso) {
        try {
            
            List<Cliente> lista = manager.createQuery("from Cliente e where e.estado=1 and e.id="+uso).getResultList();
          
            return lista;
        } catch (Exception e) {
            throw e;
        }
    }

    
    public List<Cliente> getByNome(String nome){
        Query q = manager.createQuery("SELECT u FROM Cliente u WHERE lower(u.nome) LIKE lower(:nome)");
        q.setParameter("nome", "%" + nome + "%");
        List<Cliente> u = q.getResultList();
        return u;
    }
    
    public List<Cliente> coutList(){
        Query q = manager.createQuery("SELECT count(e.id) FROM Cliente e ");
        List<Cliente> u = q.getResultList();
        return u;
    }
}
