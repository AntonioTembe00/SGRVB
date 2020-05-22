package controller;

import br.com.caelum.vraptor.*;
import br.com.caelum.vraptor.validator.Validator;
import dao.ClienteDAO;
import dao.ReservaDAO;
import dao.EventoDAO;
import dao.PagamentoDAO;
import dao.TipopagamentoDAO;
import java.time.Instant;
import java.util.Date;
import model.Evento;
import model.Reserva;
import model.Cliente;
import javax.inject.Inject;
import javax.servlet.jsp.tagext.ValidationMessage;
import model.Pagamento;
import model.Tipopagamento;

/**
 *
 * @author
 */
@Controller
@Path("/reserva")
public class ReservaController {

    @Inject
    private Result result;
    @Inject
    private ReservaDAO dao;
    @Inject
    private EventoDAO evedao;
    @Inject
    private ClienteDAO usodao;
    @Inject
    private PagamentoDAO pdao;
    @Inject
    private TipopagamentoDAO tpdao;
    @Inject
    LoginController loginController;

    @Path("/create")
    public void create() {
        loginController.sessao();
        result.include("list", dao.findAllUsers());
        result.include("usuariolista", usodao.findAllUsers());
        result.include("eventolista", evedao.findAllUsers());
    }

    @Path("/editar")
    public void editar() {
        loginController.sessao();
        result.include("list", dao.findAllUsers());
    }

    @Path("/add")
    public void add(Reserva entity, Integer evento, Integer cliente,
            Integer quantidade) {
        try {
            Evento eve = evedao.find(evento);
            Cliente uso = usodao.find(cliente);
            entity.setQuantidade(quantidade);
            entity.setEvento(eve);
            entity.setCliente(uso);
            entity.setData(Date.from(Instant.now()));
            entity.setEstado(1);
            entity.setEstadoReserva("Reservado");
            dao.create(entity);
            eve.setBilhetesDisponiveis(eve.getBilhetesDisponiveis() - entity.getQuantidade());
            evedao.update(eve);

            Pagamento pg = new Pagamento();
            entity = dao.find(entity.getId());
            Tipopagamento tipo = tpdao.find(3);
            pg.setReserva(entity);
            pg.setTipopagamento(tipo);
            pg.setData(Date.from(Instant.now()));
            pg.setEstado(1);
            pg.setEstadopagamento("Pedente");
            pdao.create(pg);

//        result.include("lista", dao.find(entity.getId()));
            result.redirectTo(InicialController.class).paginacliente();
        } catch (Exception e) {
            result.include("error", "Reserva não efectuada.");
            result.redirectTo(ReservaController.class).create();
        }
    }

    @Path("/visualizar")
    public void visualizar() {
        loginController.sessao();
        result.include("list", dao.findAllUsers());
    }

    public void edita(Integer id) {
        Reserva adm = dao.find(id);
        result.include("entity", dao.find(adm.getId()));
        result.redirectTo(ReservaController.class).editar();
    }

    @Path("/edita1")
    public void edita1(Reserva entity, Integer id, Integer quantidade) {
        try {
            entity = dao.find(id);
            entity.setQuantidade(quantidade);
            dao.update(entity);
            result.include("lista", dao.find(entity.getId()));
            result.include("succeedMessage", "Reserva actualizada com sucesso");
            result.redirectTo(ReservaController.class).visualizar();
        } catch (Exception e) {
            result.include("error", "Reserva não actualizada.");
            result.redirectTo(InicialController.class).paginacliente();
        }
    }

    public void cancelar(Integer id) {
        Reserva adm = dao.find(id);
        adm.setEstadoReserva("Cancelado");
        adm.setEstado(0);
        dao.update(adm);
        result.include("succeedMessage", "Reserva cancelada com sucesso");
        result.redirectTo(ReservaController.class).create();
    }

    public void find(Integer id) {
        Reserva adm = dao.find(id);
        dao.find(id);
        result.redirectTo(ReservaController.class).create();
    }

}
