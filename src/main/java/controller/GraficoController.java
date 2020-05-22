
package controller;

import br.com.caelum.vraptor.*;
import javax.inject.Inject;


/**
 *
 * @author 
 */
/*Login da API e nao da APP*/

@Controller
@Path("grafico")
public class GraficoController {

    @Inject private Result result;
@Inject
    LoginController loginController;
    protected GraficoController() {
	this(null);
    }
	
    @Inject
    public GraficoController(Result result) {
        this.result = result;
    }

    @Path("/grafico")
    public void grafico() {
        loginController.sessao();
    }
    
    
}
