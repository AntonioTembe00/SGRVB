
package dao;

import model.Venda;
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
public class VendaDAO {

    @Inject 
    private EntityManager manager;
    
    public VendaDAO() {
    }

    
    public Venda create(Venda entity) {
        try {
            entity.setId(null);
            manager.persist(entity);
        } catch (Exception e) {
            return null;
        }
        return entity;
    }

    public Venda update(Venda entity) {
        manager.merge(entity);
        return entity;
    }

    public Venda find(Integer id) {
        return manager.find(Venda.class, id);
    }
     public List<Venda> findAllUsers1(int uso) {
        try {
            
            List<Venda> lista = manager.createQuery("from Venda e where e.estado=1 and e.funcionario="+uso).getResultList();
          
            return lista;
        } catch (Exception e) {
            throw e;
        }
    }

    public boolean delete(Venda entity) {
        try {
            manager.remove(entity);
        } catch (Exception e) {
            return false;
        }
        return true;
    }
    
    public List<Venda> findAllUsers() {
        try {
            List<Venda> lista = manager.createQuery("from Venda e where e.estado=1  order by e.id").getResultList();
            return lista;
        } catch (Exception e) {
            throw e;
        }
    }
    
    public List<Venda> getByNome(String nome){
        Query q = manager.createQuery("SELECT u FROM Venda u WHERE lower(u.nome) LIKE lower(:nome)");
        q.setParameter("nome", "%" + nome + "%");
        List<Venda> u = q.getResultList();
        return u;
    }
}
