package controller;

import br.com.caelum.vraptor.*;
import dao.CategoriaDAO;
import java.time.Instant;
import java.util.Date;
import model.Categoria;
import javax.inject.Inject;

/**
 *
 * @author 
 */
@Controller
@Path("/especialidade")
public class EspecialidadeController {

    @Inject
    private Result result;
    @Inject
    private CategoriaDAO dao;
    @Inject
    LoginController loginController;

    @Path("/create")
    public void create() {
        loginController.sessao();
        result.include("list", dao.findAllUsers());
    }
    
     @Path("/editar")
    public void editar() {
        loginController.sessao();
        result.include("list", dao.findAllUsers());
    }

    @Path("/add")
    public void add(Categoria entity,String nome, String descricao) {
        try{
        entity.setNome(nome);
        entity.setDescricao(descricao);
        entity.setData(Date.from(Instant.now()));
        entity.setEstado(1);
        dao.create(entity);
        result.include("lista", dao.find(entity.getId()));
        result.include("succeedMessage","Especialidade registada com sucesso");
        result.redirectTo(EspecialidadeController.class).create();
        } catch (Exception e) {
            result.include("error", "Especialidade não registada.");
            result.redirectTo(EspecialidadeController.class).create();
        }
    }

    @Path("/visualizar")
    public void visualizar() {
        loginController.sessao();
        result.include("list", dao.findAllUsers());
    }

    public void edita(Integer id) {
        Categoria adm = dao.find(id);
        result.include("entity", dao.find(adm.getId()));
        result.redirectTo(EspecialidadeController.class).editar();
    }

    @Path("/edita1")
    public void edita1(Categoria entity, Integer id, String nome, String descricao) {
      try{  
        entity = dao.find(id);
        entity.setNome(nome);
        entity.setDescricao(descricao);
        dao.update(entity);
        result.include("lista", dao.find(entity.getId()));
        result.include("succeedMessage","Especialidade actualizada com sucesso");
        result.redirectTo(EspecialidadeController.class).visualizar();
    } catch (Exception e) {
            result.include("error", "Especialidade não actualizada.");
            result.redirectTo(EspecialidadeController.class).create();
        }
      }

    public void remove(Integer id) {
        Categoria adm = dao.find(id);
        adm.setEstado(0);
        dao.update(adm); 
        result.include("succeedMessage","Especialidade removida com sucesso");
        result.redirectTo(EspecialidadeController.class).visualizar();
    }

    public void find(Integer id) {
        Categoria adm = dao.find(id);
        dao.find(id);
        result.redirectTo(EspecialidadeController.class).create();
    }
}
