package controller;

import br.com.caelum.vraptor.*;
import javax.inject.Inject;
import model.Funcionario;
import model.Cliente;
import dao.FuncionarioDAO;
import dao.ClienteDAO;
import java.util.Iterator;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.enterprise.context.SessionScoped;
import javax.swing.JOptionPane;

/**
 *
 * @author
 */
/*Login da API e nao da APP*/
@Controller
@Path("/")
public class LoginController {

    @Inject
    private Result result;
    @Inject
    private FuncionarioDAO dao;
    private ClienteDAO clidao;
    @Inject
    LoginController loginController;
    @SessionScoped
    private Funcionario funcionarioLoged = new Funcionario();

    protected LoginController() {
        this(null);
    }
    public static Integer valor;

    @Inject
    public LoginController(Result result) {
        this.result = result;
    }

    @Path({"/", "/login"})
    public void login() {
    }

    @Path("/logincliente")
    public void logincliente() {
    }

    @Path("/entrar")
    public void entrar(String email, String senha) {
        int contador = 0;

        for (Funcionario entity : dao.findAllUsers()) {
            if (entity.getEmail().equals(email) && entity.getSenha().equals(senha) && entity.getGrupo().getNome().equals("Admin")) {
                contador = 1;
                valor = entity.getId();
            } else if (entity.getEmail().equals(email) && entity.getSenha().equals(senha) && entity.getGrupo().getNome().equals("Vendedor")) {
                contador = 2;
                valor = entity.getId();
            }
        }
        if (contador == 1) {
            sessao();
            result.redirectTo(InicialController.class).inicial();

        } else if (contador == 2) {
            sessao();
            result.redirectTo(InicialController.class).inicial();

        } else {
            result.include("error", "Senha ou email errado");
            result.redirectTo(LoginController.class).login();
        }

    }

    @Path("/entrar1")
    public void entrar1(String email, String senha) {
        int contador = 0;

        for (Cliente entity : clidao.findAllUsers()) {
            if (entity.getEmail().equals(email) && entity.getSenha().equals(senha)) {
                contador++;
                valor = entity.getId();
            }
        }

        if (contador != 0) {
            sessao();
            result.redirectTo(InicialController.class).paginacliente();

        } else {
            result.include("error", "Senha ou email errado");
            result.redirectTo(LoginController.class).logincliente();
        }
    }
    
    @PostConstruct
    public void sessao() {
        result.include("funcionario", funcionarioLoged.getNome());
    }

    public Funcionario getFuncionarioLoged() {
        return funcionarioLoged;
    }

    public void setFuncionarioLoged(Funcionario funcionarioLoged) {
        this.funcionarioLoged = funcionarioLoged;
    }


}
