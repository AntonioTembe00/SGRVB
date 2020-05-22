package controller;

import br.com.caelum.vraptor.*;
import dao.CategoriaDAO;
import dao.FuncionarioDAO;
import java.time.Instant;
import java.util.Date;
import model.Categoria;
import javax.inject.Inject;

/**
 *
 * @author
 */
@Controller
@Path("/categoria")
public class CategoriaController {

    @Inject
    private Result result;
    @Inject
    private CategoriaDAO dao;
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

    @Path("/editar")
    public void editar() {
        loginController.sessao();
        result.include("list", dao.findAllUsers());
        result.include("lista", usodao.findAllUsers1(LoginController.valor));
    }

    @Path("/add")
    public void add(Categoria entity, String nome, String descricao)  {
        try {
            entity.setNome(nome);
            entity.setDescricao(descricao);
            entity.setData(Date.from(Instant.now()));
            entity.setEstado(1);
            dao.create(entity);
            result.include("lista1", dao.find(entity.getId()));
            result.include("succeedMessage", "Categoria Registada com sucesso");
            result.redirectTo(CategoriaController.class).create();
        } catch (Exception e) {
            result.include("error", "Categoria não registada.");
            result.redirectTo(CategoriaController.class).create();
        }
    }

    @Path("/visualizar")
    public void visualizar() {
        loginController.sessao();
        result.include("list", dao.findAllUsers());
        result.include("lista", usodao.findAllUsers1(LoginController.valor));
    }

    public void edita(Integer id) {
        Categoria adm = dao.find(id);
        result.include("entity", dao.find(adm.getId()));
        result.redirectTo(CategoriaController.class).editar();
    }

    @Path("/edita1")
    public void edita1(Categoria entity, Integer id, String nome, String descricao) {
        try{
        entity = dao.find(id);
        entity.setNome(nome);
        entity.setDescricao(descricao);
        dao.update(entity);
        result.include("lista1", dao.find(entity.getId()));
        result.include("succeedMessage", "Categoria actualizada com sucesso");
        result.redirectTo(CategoriaController.class).visualizar();
        } catch (Exception e) {
            result.include("error", "Categoria não actualizada.");
            result.redirectTo(CategoriaController.class).create();
        }
    }

    public void remove(Integer id) {
        Categoria adm = dao.find(id);
        adm.setEstado(0);
        dao.update(adm);
        result.include("succeedMessage", "Categoria removida com sucesso");
        result.redirectTo(CategoriaController.class).visualizar();
    }

    public void find(Integer id) {
        Categoria adm = dao.find(id);
        dao.find(id);
        result.redirectTo(CategoriaController.class).create();
    }
}
