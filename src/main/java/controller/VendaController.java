package controller;

import br.com.caelum.vraptor.*;
import br.com.caelum.vraptor.validator.Validator;
import dao.ClienteDAO;
import dao.VendaDAO;
import dao.FuncionarioDAO;
import dao.PagamentoDAO;
import dao.EventoDAO;
import java.time.Instant;
import java.util.Date;
import model.Evento;
import model.Venda;
import model.Funcionario;
import javax.inject.Inject;
import javax.servlet.jsp.tagext.ValidationMessage;
import model.Pagamento;
import model.Tipopagamento;

/**
 *
 * @author
 */
@Controller
@Path("/venda")
public class VendaController {

    @Inject
    private Result result;
    @Inject
    private VendaDAO dao;
    @Inject
    private EventoDAO evedao;
    @Inject
    private FuncionarioDAO usodao;
    @Inject
    private PagamentoDAO pdao;
    @Inject
    LoginController loginController;

    @Path("/create")
    public void create() {
        loginController.sessao();
        result.include("list", dao.findAllUsers());
        result.include("funcionariolista", usodao.findAllUsers());
        result.include("eventolista", evedao.findAllUsers());
        result.include("lista", usodao.findAllUsers1(LoginController.valor));
    }

    @Path("/editar")
    public void editar() {
        loginController.sessao();
        result.include("list", dao.findAllUsers());
        result.include("eventolista", evedao.findAllUsers());
        result.include("funcionariolista", usodao.findAllUsers());
        result.include("lista", usodao.findAllUsers1(LoginController.valor));
    }

    @Path("/add")
    public void add(Venda entity, Integer evento, Integer quantidade) {
        try {
            Evento eve = evedao.find(evento);
            Funcionario uso = usodao.find(loginController.valor);
            entity.setQuantidade(quantidade);
            entity.setEvento(eve);
            entity.setFuncionario(uso);
            entity.setData(Date.from(Instant.now()));
            entity.setEstado(1);
            dao.create(entity);
            eve.setBilhetesDisponiveis(eve.getBilhetesDisponiveis() - entity.getQuantidade());
            evedao.update(eve);

            result.include("lista1", dao.find(entity.getId()));
            result.include("succeedMessage", "Venda efectuada com sucesso");
            result.redirectTo(VendaController.class).visualizar();
        } catch (Exception e) {
            result.include("error", "Venda não efectuada.");
            result.redirectTo(VendaController.class).create();
        }
    }

    @Path("/visualizar")
    public void visualizar() {
        loginController.sessao();
        result.include("list", dao.findAllUsers1(loginController.valor));
        result.include("lista", usodao.findAllUsers1(LoginController.valor));
    }

    @Path("/edita1")
    public void edita1(Venda entity, Integer id, Integer quantidade) {
        try {
            entity = dao.find(id);
            entity.setQuantidade(quantidade);
            dao.update(entity);
            result.include("lista1", dao.find(entity.getId()));
            result.include("succeedMessage", "Venda actualizada com sucesso");
            result.redirectTo(VendaController.class).visualizar();
        } catch (Exception e) {
            result.include("error", "Venda não actualizada.");
            result.redirectTo(JogoController.class).create();
        }
    }

    public void find(Integer id) {
        Venda adm = dao.find(id);
        dao.find(id);
        result.redirectTo(VendaController.class).create();
    }

}
