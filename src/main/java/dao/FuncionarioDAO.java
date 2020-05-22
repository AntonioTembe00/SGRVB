
package dao;

import model.Funcionario;
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
public class FuncionarioDAO {

    @Inject 
    private EntityManager manager;
    
    public FuncionarioDAO() {
    }

    
    public Funcionario create(Funcionario entity) {
        try {
            entity.setId(null);
            manager.persist(entity);
        } catch (Exception e) {
            return null;
        }
        return entity;
    }

    public Funcionario update(Funcionario entity) {
        manager.merge(entity);
        return entity;
    }

    public Funcionario find(Integer id) {
        return manager.find(Funcionario.class, id);
    }

    public boolean delete(Funcionario entity) {
        try {
            manager.remove(entity);
        } catch (Exception e) {
            return false;
        }
        return true;
    }
    
    public List<Funcionario> findAllUsers() {
        try {
            List<Funcionario> lista = manager.createQuery("from Funcionario e where e.estado=1  order by e.id").getResultList();
            return lista;
        } catch (Exception e) {
            throw e;
        }
    }
     public List<Funcionario> findAllUsers1(int uso) {
        try {
            
            List<Funcionario> lista = manager.createQuery("from Funcionario e where e.estado=1 and e.id="+uso).getResultList();
          
            return lista;
        } catch (Exception e) {
            throw e;
        }
    }
    
    public List<Funcionario> getByNome(String nome){
        Query q = manager.createQuery("SELECT u FROM Usuario u WHERE lower(u.nome) LIKE lower(:nome)");
        q.setParameter("nome", "%" + nome + "%");
        List<Funcionario> u = q.getResultList();
        return u;
    }
}
