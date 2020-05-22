package controller;

import br.com.caelum.vraptor.*;
import dao.EventoDAO;
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

    protected InicialController() {
        this(null);
    }

    @Inject
    public InicialController(Result result) {
        this.result = result;
    }

    @Path("/inicial")
    public void inicial() {
        loginController.sessao();
    }

    @Path("/inicialcliente")
    public void inicialcliente() {
        loginController.sessao();

    }

    @Path("/paginacliente")
    public void paginacliente() {
        loginController.sessao();
        result.include("lista", evedao.find(2));
        result.include("lista1", evedao.find(3));
        result.include("lista2", evedao.find(4));
        result.include("lista3", evedao.find(5));
        result.include("lista4", evedao.find(6));
        result.include("lista5", evedao.find(7));

    }
}
