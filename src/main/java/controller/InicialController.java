package controller;

import br.com.caelum.vraptor.*;
import dao.EventoDAO;
import dao.FuncionarioDAO;
import javax.inject.Inject;

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
    }

    @Path("/inicialvenda")
    public void inicialvenda() {
        result.include("lista", usodao.findAllUsers1(LoginController.valor));
//       result.include("clilista", clidao.coutList());
    }
    @Path("/inicialcliente")
    public void inicialcliente() {
        loginController.sessao();
        result.include("lista", usodao.findAllUsers1(LoginController.valor));

    }

    @Path("/paginacliente")
    public void paginacliente() {
//        loginController.sessao();
//        result.include("lista", evedao.find(2));
//        result.include("lista1", evedao.find(3));
//        result.include("lista2", evedao.find(4));
//        result.include("lista3", evedao.find(5));
//        result.include("lista4", evedao.find(6));
//        result.include("lista5", evedao.find(7));

    }
}
