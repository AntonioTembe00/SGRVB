package controller;

import br.com.caelum.vraptor.*;
import dao.FuncionarioDAO;
import dao.TipopagamentoDAO;
import java.time.Instant;
import java.util.Date;
import model.Tipopagamento;
import javax.inject.Inject;

/**
 *
 * @author
 */
@Controller
@Path("/tipopagamento")
public class TipopagamentoController {

    @Inject
    private Result result;
    @Inject
    private TipopagamentoDAO dao;
    @Inject
    LoginController loginController;
    @Inject
    private FuncionarioDAO usodao;

    @Path("/create")
    public void create() {
        loginController.sessao();
        result.include("list", dao.findAllUsers());
        result.include("lista", usodao.findAllUsers1(LoginController.valor));
    }

    @Path("/add")
    public void add(Tipopagamento entity, String nome, String descricao) {
        try {
            entity.setNome(nome);
            entity.setDescricao(descricao);
            entity.setData(Date.from(Instant.now()));
            entity.setEstado(1);
            dao.create(entity);
            result.include("lista1", dao.find(entity.getId()));
            result.include("succeedMessage", "Tipo de Pagamento registado com sucesso");
            result.redirectTo(TipopagamentoController.class).create();
        } catch (Exception e) {
            result.include("error", "Tipo de Pagamento não registado.");
            result.redirectTo(JogoController.class).create();
        }
    }

    @Path("/editar")
    public void editar() {
        loginController.sessao();
        result.include("list", dao.findAllUsers());
        result.include("lista", usodao.findAllUsers1(LoginController.valor));
    }

    @Path("/visualizar")
    public void visualizar() {
        loginController.sessao();
        result.include("list", dao.findAllUsers());
        result.include("lista", usodao.findAllUsers1(LoginController.valor));
    }

    public void edita(Integer id) {
        Tipopagamento adm = dao.find(id);
        result.include("entity", dao.find(adm.getId()));
        result.redirectTo(TipopagamentoController.class).editar();
    }

    @Path("/edita1")
    public void edita1(Tipopagamento entity, Integer id, String nome) {
        try {
            entity = dao.find(id);
            entity.setNome(nome);
            dao.update(entity);
            result.include("lista1", dao.find(entity.getId()));
            result.include("succeedMessage", "Tipo de Pagamento actualizado com sucesso");
            result.redirectTo(TipopagamentoController.class).visualizar();
        } catch (Exception e) {
            result.include("error", "Tipo de Pagamento não actualizado.");
            result.redirectTo(JogoController.class).create();
        }
    }

    public void remove(Integer id) {
        Tipopagamento adm = dao.find(id);
        adm.setEstado(0);
        dao.update(adm);
        result.include("succeedMessage", "Tipo de Pagamento removido com sucesso");
        result.redirectTo(TipopagamentoController.class).visualizar();
    }

    public void find(Integer id) {
        Tipopagamento adm = dao.find(id);
        dao.find(id);
        result.redirectTo(TipopagamentoController.class).create();
    }
}
