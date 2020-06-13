package controller;

import br.com.caelum.vraptor.*;
import dao.ClienteDAO;
import java.time.Instant;
import java.util.Date;
import model.Cliente;
import javax.inject.Inject;
import javax.swing.JOptionPane;

/**
 *
 * @author
 */
@Controller
@Path("/cliente")
public class ClienteController {

    @Inject
    private Result result;
    @Inject
    private ClienteDAO dao;
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
    public void add(Cliente entity, String senha, String confirmarsenha, String nome, String email, Integer telefone) {
        try {

            if (senha.equals(confirmarsenha)) {
                entity.setNome(nome);
                entity.setEmail(email);
                entity.setTelefone(telefone);
                entity.setSenha(senha);
                entity.setData(Date.from(Instant.now()));
                entity.setEstado(1);
                
                dao.create(entity);
                result.include("succeedMessage", "Cliente registado com sucesso");
                result.redirectTo(LoginController.class).logincliente();
            } else {
                result.include("error", "Cliente não registado. Senha diferente de confirmar senha.");
                result.redirectTo(ClienteController.class).create();

            }

        } catch (Exception e) {
            result.include("error", "Cliente não registado.");
            result.redirectTo(ClienteController.class).create();
        }
    }

    @Path("/visualizar")
    public void visualizar() {
        loginController.sessao();
        result.include("list", dao.findAllUsers());
    }

    public void edita(Integer id) {
        Cliente adm = dao.find(id);
        result.include("entity", dao.find(adm.getId()));
        result.redirectTo(ClienteController.class).editar();
    }

    @Path("/edita1")
    public void edita1(Cliente entity, Integer id, String nome, String email,
            String senha, String confirmarsenha, Integer telefone) {
    try {
        entity.setNome(nome);
        entity.setEmail(email);
        entity.setSenha(senha);
        entity.setTelefone(telefone);
        if (senha.equals(confirmarsenha)) {
            dao.update(entity);
            result.include("succeedMessage", "Cliente actualizado com sucesso");
            result.redirectTo(ClienteController.class).visualizar();
        } else {
            result.include("error", "Cliente não actualizado. Senha diferente de confirmar senha.");
            result.redirectTo(ClienteController.class).visualizar();

        } } catch (Exception e) {
            result.include("error", "Clinte não actualizado.");
            result.redirectTo(ClienteController.class).create();
        }
    }

    public void remove(Integer id) {
        Cliente adm = dao.find(id);
        adm.setEstado(0);
        dao.update(adm);
        result.include("succeedMessage", "Cliente removido com sucesso");
        result.redirectTo(ClienteController.class).visualizar();
    }

    public void find(Integer id) {
        Cliente adm = dao.find(id);
        dao.find(id);
        result.redirectTo(ClienteController.class).create();
    }
}
