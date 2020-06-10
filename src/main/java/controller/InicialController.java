package controller;

import br.com.caelum.vraptor.*;
import dao.EventoDAO;
import dao.FuncionarioDAO;
import dao.ClienteDAO;
import dao.InicialDAO;
import javax.inject.Inject;
import model.Funcionario;

/**
 *
 * @author
 */
/*Login da API e nao da APP*/
@Controller
@Path("/inicial")
public class InicialController {

    @Inject
    private Result result;
    @Inject
    private EventoDAO evedao;
    @Inject
    LoginController loginController;
    @Inject
    private FuncionarioDAO usodao;
    @Inject
    private ClienteDAO clidao;
    @Inject
    private InicialDAO dao;

    protected InicialController() {
        this(null);
    }

    @Inject
    public InicialController(Result result) {
        this.result = result;
    }

    @Path("/inicia")
    public void inicial() {
        loginController.sessao();
        result.include("lista", usodao.findAllUsers1(LoginController.valor));
        result.include("clista", dao.countClientList());
        result.include("cmlista", dao.countClientListMensal());
        result.include("vlista", dao.countVendaList());
        result.include("vtlista", dao.valorTotalVendas());
    }

    @Path("/inicialtodos")
    public void inicialtodos() {
        Funcionario adm = usodao.find(LoginController.valor);
        if (adm.getGrupo().getNome().equals("Admin")) {
            result.include("lista", usodao.findAllUsers1(LoginController.valor));
            result.redirectTo(InicialController.class).inicial();
        } else if (adm.getGrupo().getNome().equals("Vendedor")) {
            result.include("lista", usodao.findAllUsers1(LoginController.valor));
            result.redirectTo(InicialController.class).inicialvenda();
        }

    }

    @Path("/inicialvenda")
    public void inicialvenda() {
        result.include("lista", usodao.findAllUsers1(LoginController.valor));
    }

    @Path("/inicialcliente")
    public void inicialcliente() {
//        result.include("lista", usodao.findAllUsers1(LoginController.valor));
    }

    @Path("/paginacliente")
    public void paginacliente() {
        result.include("lista", clidao.findAllUsers1(LoginController.valor));
//        loginController.sessao();
//        result.include("lista", evedao.find(2));
//        result.include("lista1", evedao.find(3));
//        result.include("lista2", evedao.find(4));
//        result.include("lista3", evedao.find(5));
//        result.include("lista4", evedao.find(6));
//        result.include("lista5", evedao.find(7));

    }
}
