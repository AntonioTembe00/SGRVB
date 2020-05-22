package controller;

import br.com.caelum.vraptor.*;
import dao.TipopagamentoDAO;
import dao.ReservaDAO;
import dao.PagamentoDAO;
import java.time.Instant;
import java.util.Date;
import model.Tipopagamento;
import model.Pagamento;
import model.Reserva;
import javax.inject.Inject;
import model.Especialidade;

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

    @Path("/create")
    public void create() {
        loginController.sessao();
        result.include("list", dao.findAllUsers());
        result.include("tipolista", tipdao.findAllUsers());
        result.include("reslista", redao.findAllUsers());
    }

    @Path("/add")
    public void add(Pagamento entity, Integer reserva, Integer tipopagamento) {
        try {
            Reserva res = redao.find(reserva);
            Tipopagamento tipo = tipdao.find(tipopagamento);
            entity.setReserva(res);
            entity.setTipopagamento(tipo);
            entity.setData(Date.from(Instant.now()));
            entity.setEstado(1);
            entity.setEstadopagamento("Pago");
            dao.create(entity);
            res.setEstado(0);
            redao.update(res);
            result.include("lista", dao.find(entity.getId()));
            result.include("succeedMessage", "Pagamento efectuado com sucesso");
            result.redirectTo(PagamentoController.class).create();
        } catch (Exception e) {
            result.include("error", "Pagamento não registado.");
            result.redirectTo(PagamentoController.class).create();
        }
    }

    @Path("/visualizar")
    public void visualizar() {
        loginController.sessao();
        result.include("list", dao.findAllUsers());
    }

    public void cancel(Integer id) {
        Pagamento adm = dao.find(id);
        adm.setEstadopagamento("Cancel");
        adm.setEstado(0);
        dao.update(adm);
        Reserva re = redao.find(adm.getReserva().getId());
        re.setEstadoReserva("Cancelado");
        re.setEstado(0);
        redao.update(re);
        result.include("succeedMessage", "Pagamento cancelado com sucesso");
        result.redirectTo(PagamentoController.class).visualizar();
    }

    public void pagamento(Integer id) {
        Pagamento adm = dao.find(id);
        adm.setEstadopagamento("Pago");
        adm.setEstado(0);
        adm.setData(Date.from(Instant.now()));
        dao.update(adm);
        Reserva re = redao.find(adm.getReserva().getId());
        re.setEstado(0);
        redao.update(re);
        result.include("succeedMessage", "Pagamento efectuado com sucesso");
        result.redirectTo(PagamentoController.class).visualizar();
    }

}
