package controller;

import br.com.caelum.vraptor.*;
import dao.MensagemDAO;
import dao.FuncionarioDAO;
import java.time.Instant;
import java.util.Date;
import model.Funcionario;
import javax.inject.Inject;
import javax.swing.JOptionPane;
import model.Mensagem;

/**
 *
 * @author
 */
@Controller
@Path("/mensagem")
public class MensagemController {

    @Inject
    private Result result;
    @Inject
    private FuncionarioDAO usodao;
    @Inject
    private MensagemDAO dao;
    @Inject
    LoginController loginController;
//    private Integer valor;
    @Inject
    private LoginController log;

    @Path("/create")
    public void create() {
        loginController.sessao();
        result.include("lista", usodao.findAllUsers1(loginController.getFuncionarioLoged().getId()));

    }

    @Path("/responder")
    public void responder() {
        loginController.sessao();
        result.include("lista", usodao.findAllUsers1(loginController.getFuncionarioLoged().getId()));
    }

    @Path("/respondervenda")
    public void respondervenda() {
        loginController.sessao();
        result.include("lista", usodao.findAllUsers1(loginController.getFuncionarioLoged().getId()));

    }

    @Path("/createvenda")
    public void createvenda() {
        loginController.sessao();
        result.include("lista", usodao.findAllUsers1(loginController.getFuncionarioLoged().getId()));

    }

    @Path("/visualizar")
    public void visualizar() {
        Funcionario us = usodao.find(loginController.getFuncionarioLoged().getId());
         loginController.sessao();
        result.include("list", dao.findAllUsers1(us.getId()));
        result.include("lista", usodao.findAllUsers1(us.getId()));
    }

    @Path("/visualizarvenda")
    public void visualizarvenda() {
        Funcionario us = usodao.find(loginController.getFuncionarioLoged().getId());
        loginController.sessao();
        result.include("list", dao.findAllUsers1(us.getId()));
        result.include("lista", usodao.findAllUsers1(us.getId()));
    }

    @Path("/add")
    public void add(Mensagem entity, Integer receptor, String descricao, String assunto) {
        try {
            Funcionario uso = usodao.find(receptor);
            Funcionario uso1 = usodao.find(loginController.getFuncionarioLoged().getId());
            entity.setDescricao(descricao);
            entity.setAssunto(assunto);
            entity.setReceptor(uso);
            entity.setEmissor(uso1);
            entity.setData(Date.from(Instant.now()));
            entity.setEstado(1);
            dao.create(entity);
            result.include("succeedMessage", "Mensagem enviada com sucesso");
            result.redirectTo(MensagemController.class).create();
        } catch (Exception e) {
            result.include("error", "Mensagem não enviada.");
            result.redirectTo(MensagemController.class).create();
        }
    }

    @Path("/addvenda")
    public void addvenda(Mensagem entity, Integer receptor, String descricao, String assunto) {
        try {
            Funcionario uso = usodao.find(receptor);
            Funcionario uso1 = usodao.find(loginController.getFuncionarioLoged().getId());
            entity.setDescricao(descricao);
            entity.setAssunto(assunto);
            entity.setReceptor(uso);
            entity.setEmissor(uso1);
            entity.setData(Date.from(Instant.now()));
            entity.setEstado(1);
            dao.create(entity);
            result.include("succeedMessage", "Mensagem enviada com sucesso");
            result.redirectTo(MensagemController.class).createvenda();
        } catch (Exception e) {
            result.include("error", "Mensagem não enviada.");
            result.redirectTo(MensagemController.class).createvenda();
        }
    }

    public void edita(Integer id) {
        Mensagem adm = dao.find(id);
        result.include("entity", dao.find(adm.getId()));
        result.redirectTo(MensagemController.class).responder();
    }

    public void editavenda(Integer id) {
        Mensagem adm = dao.find(id);
        result.include("entity", dao.find(adm.getId()));
        result.redirectTo(MensagemController.class).respondervenda();
    }

    @Path("/respostagestor")
    public void respostagestor(Mensagem entity, String descricao, Integer id) {
        try {
            Mensagem men = dao.find(id);
            Funcionario uso1 = usodao.find(loginController.getFuncionarioLoged().getId());
            entity.setDescricao(descricao);
            entity.setAssunto(men.getAssunto());
            entity.setReceptor(men.getEmissor());
            entity.setEmissor(uso1);
            entity.setData(Date.from(Instant.now()));
            entity.setEstado(1);
            dao.create(entity);
            result.include("succeedMessage", "Resposta enviada com sucesso");
            result.redirectTo(MensagemController.class).create();
        } catch (Exception e) {
            result.include("error", "Resposta não enviada.");
            result.redirectTo(MensagemController.class).create();
        }
    }

    @Path("/respostavenda")
    public void respostavenda(Mensagem entity, String descricao, Integer id) {
        try {
            Mensagem men = dao.find(id);
            Funcionario uso1 = usodao.find(loginController.getFuncionarioLoged().getId());
            entity.setDescricao(descricao);
            entity.setAssunto(men.getAssunto());
            entity.setReceptor(men.getEmissor());
            entity.setEmissor(uso1);
            entity.setData(Date.from(Instant.now()));
            entity.setEstado(1);
            dao.create(entity);
            result.include("succeedMessage", "Resposta enviada com sucesso");
            result.redirectTo(MensagemController.class).createvenda();
        } catch (Exception e) {
            result.include("error", "Resposta não enviada.");
            result.redirectTo(MensagemController.class).createvenda();
        }
    }

    public void remove(Integer id) {
        Mensagem adm = dao.find(id);
        adm.setEstado(0);
        dao.update(adm);
//        result.redirectTo(MensagemController.class).visualizar();
    }

}
