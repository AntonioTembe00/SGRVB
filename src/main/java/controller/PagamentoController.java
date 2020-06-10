package controller;

import br.com.caelum.vraptor.*;
import dao.EventoDAO;
import dao.FuncionarioDAO;
import dao.TipopagamentoDAO;
import dao.ReservaDAO;
import dao.VendaDAO;
import dao.PagamentoDAO;
import java.time.Instant;
import java.util.Date;
import model.Tipopagamento;
import model.Pagamento;
import model.Reserva;
import model.Venda;
import javax.inject.Inject;
import model.Especialidade;
import model.Evento;
import model.Funcionario;

/**
 *
 * @author
 */
@Controller
@Path("/pagamento")
public class PagamentoController {

    @Inject
    private Result result;
    @Inject
    private ReservaDAO redao;
    @Inject
    private TipopagamentoDAO tipdao;
    @Inject
    private PagamentoDAO dao;
    @Inject
    LoginController loginController;
    @Inject
    private FuncionarioDAO usodao;
    @Inject
    private VendaDAO vdao;
    @Inject
    private EventoDAO evedao;

    @Path("/create")
    public void create() {
        loginController.sessao();
        result.include("list", dao.findAllUsers());
        result.include("tipolista", tipdao.findAllUsers());
        result.include("reslista", redao.findAllUsers());
        result.include("lista", usodao.findAllUsers1(LoginController.valor));
    }

    @Path("/visualizar")
    public void visualizar() {
        loginController.sessao();
        result.include("list", dao.findAllUsers());
        result.include("lista", usodao.findAllUsers1(LoginController.valor));
    }

    public void cancel(Integer id) {
        try {
            Pagamento adm = dao.find(id);
            adm.setEstadopagamento("Cancel");
            adm.setEstado(0);
            dao.update(adm);

            Reserva re = redao.find(adm.getReserva().getId());
            re.setEstadoReserva("Cancelado");
            re.setEstado(0);
            redao.update(re);

            Evento eve = evedao.find(adm.getReserva().getEvento().getId());
            eve.setBilhetesDisponiveis(eve.getBilhetesDisponiveis() + adm.getReserva().getQuantidade());
            evedao.update(eve);

            result.include("succeedMessage", "Pagamento cancelado com sucesso");
            result.redirectTo(PagamentoController.class).visualizar();
        } catch (Exception e) {
            result.include("succeedMessage", "Pagamento não cancelado");
            result.redirectTo(PagamentoController.class).visualizar();
        }
    }

    public void pagamento(Integer id) {
        try {

            Pagamento adm = dao.find(id);
            adm.setEstadopagamento("Pago");
            adm.setEstado(0);
            adm.setData(Date.from(Instant.now()));
            dao.update(adm);

            Reserva re = redao.find(adm.getReserva().getId());
            re.setEstado(0);
            redao.update(re);

            Funcionario fu = usodao.find(LoginController.valor);
            Venda venda = new Venda();
            venda.setQuantidade(adm.getReserva().getQuantidade());
            venda.setFuncionario(fu);
            venda.setEvento(adm.getReserva().getEvento());
            venda.setData(Date.from(Instant.now()));
            venda.setEstado(1);
            vdao.create(venda);

            result.include("succeedMessage", "Pagamento efectuado com sucesso");
            result.redirectTo(PagamentoController.class).visualizar();
        } catch (Exception e) {
            result.include("succeedMessage", "Pagamento não efectuado");
            result.redirectTo(PagamentoController.class).visualizar();
        }
    }

}
