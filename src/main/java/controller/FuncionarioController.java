package controller;

import br.com.caelum.vraptor.*;
import dao.GrupoDAO;
import dao.FuncionarioDAO;
import dao.EspecialidadeDAO;
import dao.FaltasDAO;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Date;
import model.Funcionario;
import model.Especialidade;
import model.Faltas;
import javax.inject.Inject;
import javax.swing.JOptionPane;
import model.Grupo;
import model.Jogo;

/**
 *
 * @author
 */
@Controller
@Path("/funcionario")
public class FuncionarioController {

    @Inject
    private Result result;
    @Inject
    private FuncionarioDAO dao;
    @Inject
    private GrupoDAO grdao;
    @Inject
    private EspecialidadeDAO espdao;
    @Inject
    private FaltasDAO faldao;
    @Inject
    LoginController loginController;

    @Path("/create")
    public void create() {

        result.include("list", dao.findAllUsers());
        result.include("especialidadelista", espdao.findAllUsers());
        result.include("grupolista", grdao.findAllUsers());
        result.include("lista", dao.findAllUsers1(LoginController.valor));
    }

    @Path("/editar")
    public void editar() {
        result.include("list", dao.findAllUsers());
        result.include("especialidadelista", espdao.findAllUsers());
        result.include("grupolista", grdao.findAllUsers());
        result.include("lista", dao.findAllUsers1(LoginController.valor));
    }

    @Path("/createcliente")
    public void createcliente() {
        result.include("list", dao.findAllUsers());
        result.include("lista", dao.findAllUsers1(LoginController.valor));
    }

    @Path("/add")
    public void add(Funcionario entity, String nome, String email, Integer telefone,
            String datanascimento, String bi, double salario, String endereco, Integer especialidade, Integer grupo) throws ParseException {
        try {
            Grupo gru = grdao.find(grupo);
            Especialidade esp = espdao.find(especialidade);

            Date date1 = new SimpleDateFormat("yyyy-MM-DD").parse(datanascimento);
            entity.setNome(nome);
            entity.setEmail(email);
            entity.setSenha("" + telefone);
            entity.setGrupo(gru);
            entity.setBI(bi);
            entity.setEndereco(endereco);
            entity.setSalario(salario);
            entity.setTelefone(telefone);
            entity.setEspecilidade(esp);
            entity.setDataNascimento(date1);
            entity.setData(Date.from(Instant.now()));
            entity.setEstado(1);
            dao.create(entity);
            result.include("lista1", dao.find(entity.getId()));
            result.include("succeedMessage", "Funcionário registado com sucesso");
            result.redirectTo(FuncionarioController.class).create();

        } catch (Exception e) {
            result.include("error", "Funcionário não registado.");
            result.redirectTo(FuncionarioController.class).create();
        }
    }

    @Path("/visualizar")
    public void visualizar() {
        loginController.sessao();
        result.include("list", dao.findAllUsers());
        result.include("lista", dao.findAllUsers1(LoginController.valor));
    }

    @Path("/actualizarsenha")
    public void actualizarsenha() {
        loginController.sessao();
        result.include("list", dao.findAllUsers());
        result.include("lista", dao.findAllUsers1(LoginController.valor));
    }

    public void edita(Integer id) {
        Funcionario adm = dao.find(id);
        result.include("entity", dao.find(adm.getId()));
        result
                .redirectTo(FuncionarioController.class
                ).editar();
    }

    @Path("/edita1")
    public void edita1(Funcionario entity, Integer id, String nome, String email, Integer telefone,
            String datanascimento, String bi, double salario, String endereco, Integer especialidade, Integer grupo) throws ParseException {
        try {
            entity = dao.find(id);
            Grupo gru = grdao.find(grupo);
            Especialidade esp = espdao.find(especialidade);
            Date date1 = new SimpleDateFormat("yyyy-MM-DD").parse(datanascimento);
            entity.setNome(nome);
            entity.setEmail(email);
            entity.setSenha("" + telefone);
            entity.setGrupo(gru);
            entity.setBI(bi);
            entity.setEndereco(endereco);
            entity.setSalario(salario);
            entity.setTelefone(telefone);
            entity.setEspecilidade(esp);
            entity.setDataNascimento(date1);

            dao.update(entity);
            result.include("succeedMessage", "Funcionário actualizado com sucesso");
            result.redirectTo(FuncionarioController.class).visualizar();
        } catch (Exception e) {
            result.include("error", "Funcionário não actualizado.");
            result.redirectTo(FuncionarioController.class).create();
        }
    }

    @Path("/trocar")
    public void trocar(Funcionario entity, String senhanova, String confirmarsenha, String senhaantiga) {
      
            Funcionario adm = dao.find(LoginController.valor);
            if (adm.getSenha().equals(senhaantiga)) {
                if (senhaantiga.equals(senhanova)) {
                    result.include("error", "A senha nova é igual a senha antiga. Por favor, introduza uma nova senha.");
                    result.redirectTo(FuncionarioController.class).actualizarsenha();

                } else if (senhanova.equals(confirmarsenha)) {

                    dao.update(entity);
                    if (adm.getGrupo().getNome().equals("Admin")) {
                        result.include("succeedMessage", "Senha actualizada com sucesso");
                        result.redirectTo(FuncionarioController.class).visualizar();
                    } else if (adm.getGrupo().getNome().equals("Admin")) {
                        result.include("succeedMessage", "Senha actualizada com sucesso");
                        result.redirectTo(InicialController.class).inicialvenda();
                    }
                } else {
                    result.include("error", "Não foi possivel actualizar, senha diferente de confirmar senha.");
                    result.redirectTo(FuncionarioController.class).actualizarsenha();
                }
            } else {
                result.include("error", "Não foi possivel actualizar. A senha introduzida não corresponde a senha antiga.");
                result.redirectTo(FuncionarioController.class).actualizarsenha();
            }
       
    }

    public void remove(Integer id) {
        Funcionario adm = dao.find(id);
        adm.setEstado(0);
        dao.update(adm);
        result.include("succeedMessage", "Funcionário removido com sucesso");
        result
                .redirectTo(FuncionarioController.class
                ).visualizar();
    }

    public void find(Integer id) {
        Funcionario adm = dao.find(id);
        dao.find(id);
        result
                .redirectTo(FuncionarioController.class
                ).create();
    }
}
