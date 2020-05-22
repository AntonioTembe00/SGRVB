package controller;

import br.com.caelum.vraptor.*;
import dao.ClienteDAO;
import dao.JogoDAO;
import dao.EventoDAO;
import java.time.Instant;
import java.util.*;
import java.text.*;
import model.Cliente;
import model.Evento;
import model.Jogo;
import javax.inject.Inject;

/**
 *
 * @author
 */


@Controller
@Path("/evento")
public class EventoController {

    @Inject
    private Result result;
    @Inject
    private JogoDAO jodao;
    @Inject
    private ClienteDAO clidao;
    @Inject
    private EventoDAO dao;
    @Inject
    LoginController loginController;

    @Path("/create")
    public void create() {
        loginController.sessao();
        result.include("list", dao.findAllUsers());
        result.include("clientelista", clidao.findAllUsers());
        result.include("jogolista", jodao.findAllUsers());
    }
    
     @Path("/editar")
    public void editar() {
        loginController.sessao();
        result.include("list", dao.findAllUsers());
        result.include("clientelista", clidao.findAllUsers());
        result.include("jogolista", jodao.findAllUsers());
    }

    @Path("/add")
    public void add(Evento entity, Integer jogo, String descricao,String data,
        Double valor, Integer bilhetesDisponiveis) throws ParseException {
        try{
        Jogo jog = jodao.find(jogo);
        Date date1=new SimpleDateFormat("yyyy-MM-DD").parse(data);
        entity.setBilhetesDisponiveis(bilhetesDisponiveis);
        entity.setValor(valor);
        entity.setJogo(jog);
        entity.setData(Date.from(Instant.now()));
        entity.setDatajogo(date1);
        entity.setEstadoevento("Vigor");
        entity.setEstado(1);
        dao.create(entity);
        result.include("lista", dao.find(entity.getId()));
        result.include("succeedMessage","Evento registado com sucesso");
        result.redirectTo(EventoController.class).create();
    } catch (Exception e) {
            result.include("error", "Evento não registado.");
            result.redirectTo(EventoController.class).create();
        }
        }

    @Path("/visualizar")
    public void visualizar() {
        loginController.sessao();
        result.include("list", dao.findAllUsers());
    }

public void edita(Integer id) {
        Evento adm = dao.find(id);
        result.include("entity", dao.find(adm.getId()));
        result.redirectTo(EventoController.class).editar();
    }
    
    @Path("/edita1")
    public void edita1(Evento entity,Integer id,String data,Double valor, Integer 
            bilhetesDisponiveis) throws ParseException {
        try{
        entity = dao.find(id);
        Date date1=new SimpleDateFormat("yyyy-MM-DD").parse(data);
        entity.setValor(valor);
        entity.setEstadoevento("Vigor");
        entity.setDatajogo(date1);
        entity.setBilhetesDisponiveis(bilhetesDisponiveis);
        dao.update(entity);
        result.include("lista", dao.find(entity.getId()));
        result.include("succeedMessage","Evento actualizado com sucesso");
        result.redirectTo(EventoController.class).visualizar();
    } catch (Exception e) {
            result.include("error", "Evento não actualizado.");
            result.redirectTo(EventoController.class).create();
        }
        }

    public void remove(Integer id) {
        Evento adm = dao.find(id);
        adm.setEstado(0);
        dao.update(adm);
        result.include("succeedMessage","Evento removido com sucesso");
        result.redirectTo(EventoController.class).visualizar();
    }

    public void find(Integer id) {
        Evento adm = dao.find(id);
        dao.find(id);
        result.redirectTo(EventoController.class).create();
    }
}
