
package dao;

import model.Cliente;
import model.Venda;
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
public class InicialDAO {

    @Inject 
    private EntityManager manager;
    
    public InicialDAO() {
    }

    
    public List<Cliente> countClientList(){
        Query q = manager.createQuery("SELECT count(e.id) FROM Cliente e ");
        List<Cliente> u = q.getResultList();
        return u;
    }
    public List<Cliente> countClientListMensal(){
        Query q = manager.createQuery("SELECT COUNT(e.id) FROM Cliente e where MONTH(e.data) = MONTH(CURRENT_DATE)");
        List<Cliente> u = q.getResultList();
        return u;
    }
    public List<Venda> countVendaList(){
        Query q = manager.createQuery("SELECT count(e.id) FROM Venda e ");
        List<Venda> u = q.getResultList();
        return u;
    }
    public List<Venda> valorTotalVendas(){
        Query q = manager.createQuery("SELECT sum(v.quantidade*e.valor) FROM Venda v inner join Evento e on v.evento = e.id");
        List<Venda> u = q.getResultList();
        return u;
    }
}
