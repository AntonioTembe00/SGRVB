package controller;

import br.com.caelum.vraptor.*;
import dao.FeriasDAO;
import dao.FuncionarioDAO;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Date;
import model.Faltas;
import model.Funcionario;
import javax.inject.Inject;
import model.Ferias;

/**
 *
 * @author
 */
@Controller
@Path("/ferias")
public class FeriasController {

    @Inject
    private Result result;
    @Inject
    private FeriasDAO dao;
    @Inject
    private FuncionarioDAO fundao;
    @Inject
    LoginController loginController;

    @Path("/visualizar")
    public void visualizar() {
        result.include("list", dao.findAllUsers());
        result.include("lista", fundao.findAllUsers1(LoginController.valor));
    }

    @Path("/create")
    public void create() {
        result.include("funcionariolista", fundao.findAllUsers());
        result.include("lista", fundao.findAllUsers1(LoginController.valor));
    }

    public void add(Ferias entity, String datainicio, String datafim, Integer funcionario) throws ParseException {
        try {
            Funcionario adm = fundao.find(funcionario);
            Date dateI = new SimpleDateFormat("yyyy-MM-DD").parse(datainicio);
            Date dateF = new SimpleDateFormat("yyyy-MM-DD").parse(datafim);
            entity.setFuncionario(adm);
            entity.setDataInicio(dateI);
            entity.setDataFim(dateF);
            entity.setEstado(1);
            dao.create(entity);
            result.include("succeedMessage", "Férias atribuidas com sucesso");
            result.redirectTo(FeriasController.class).visualizar();
        } catch (Exception e) {
            result.include("error", "Férias não atribuidas.");
            result.redirectTo(FeriasController.class).create();
        }
    }

    public void justificar(Integer id) {
        Ferias adm = dao.find(id);
        adm.setEstado(2);
        dao.update(adm);
        result.include("succeedMessage", "Ferias cumpridas com sucesso");
        result.redirectTo(FeriasController.class).visualizar();
    }
}
