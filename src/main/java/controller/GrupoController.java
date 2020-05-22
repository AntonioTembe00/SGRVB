package controller;

import br.com.caelum.vraptor.*;
import dao.FuncionarioDAO;
import dao.GrupoDAO;
import java.time.Instant;
import java.util.Date;
import model.Grupo;
import javax.inject.Inject;

/**
 *
 * @author Jasse
 */
@Controller
@Path("/grupo")
public class GrupoController {

    @Inject
    private Result result;
    @Inject
    private GrupoDAO dao;
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
    public void add(Grupo entity, String descricao, String nome) {
        entity.setNome(nome);
        entity.setDescricao(descricao);
        entity.setData(Date.from(Instant.now()));
        entity.setEstado(1);
        dao.create(entity);
        result.include("lista1", dao.find(entity.getId()));
        result.include("succeedMessage", "Grupo registado com sucesso");
        result.redirectTo(GrupoController.class).create();
    }

    @Path("/visualizar")
    public void visualizar() {
        loginController.sessao();
        result.include("list", dao.findAllUsers());
        result.include("lista", usodao.findAllUsers1(LoginController.valor));
    }

    @Path("/editar")
    public void editar() {
        loginController.sessao();
        result.include("list", dao.findAllUsers());
        result.include("lista", usodao.findAllUsers1(LoginController.valor));
    }

    public void edita(Integer id) {
        Grupo adm = dao.find(id);
        result.include("entity", dao.find(adm.getId()));
        result.redirectTo(GrupoController.class).editar();
    }

    @Path("/edita1")
    public void edita1(Grupo entity, Integer id, String nome) {
        entity = dao.find(id);
        entity.setNome(nome);
        dao.update(entity);
        result.include("lista1", dao.find(entity.getId()));
        result.include("succeedMessage", "Grupo actualizado com sucesso");
        result.redirectTo(GrupoController.class).visualizar();
    }

    public void remove(Integer id) {
        Grupo adm = dao.find(id);
        adm.setEstado(0);
        dao.update(adm);
        result.include("succeedMessage", "Grupo removido com sucesso");
        result.redirectTo(GrupoController.class).visualizar();
    }

    public void find(Integer id) {
        Grupo adm = dao.find(id);
        dao.find(id);
        result.redirectTo(GrupoController.class).create();
    }
}
