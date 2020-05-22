package controller;

import br.com.caelum.vraptor.*;
import dao.FaltasDAO;
import dao.FuncionarioDAO;
import java.time.Instant;
import java.util.Date;
import model.Faltas;
import model.Funcionario;
import javax.inject.Inject;

/**
 *
 * @author
 */
@Controller
@Path("/faltas")
public class FaltasController {

    @Inject
    private Result result;
    @Inject
    private FaltasDAO dao;
    private FuncionarioDAO fundao;
    @Inject
    LoginController loginController;

    @Path("/visualizar")
    public void visualizar() {
        loginController.sessao();
        result.include("lista1", fundao.findAllUsers());
        result.include("list", dao.findAllUsers());
        result.include("lista", fundao.findAllUsers1(LoginController.valor));
    }
    @Path("/create")
    public void create() {
        loginController.sessao();
        result.include("funcionariolista", fundao.findAllUsers());
        result.include("lista", fundao.findAllUsers1(LoginController.valor));
    }

    public void add(Integer id) {
        Faltas Entity = new Faltas();
        Funcionario adm = fundao.find(id);
        Entity.setEstadofalta(1);
        Entity.setFuncionario(adm);
        Entity.setData(Date.from(Instant.now()));
        dao.create(Entity);
        result.include("succeedMessage", "Falta atribuida com sucesso");
        result.redirectTo(FaltasController.class).create();
    }

    public void justificar(Integer id) {
        Faltas adm = dao.find(id);
        adm.setEstadofalta(2);
        dao.update(adm);
        result.include("succeedMessage", "Falta justificada com sucesso");
        result.redirectTo(FaltasController.class).visualizar();
    }
}
