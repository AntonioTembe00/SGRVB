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
@Path("/usuario")
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
        loginController.sessao();
        result.include("list", dao.findAllUsers());
    }

    @Path("/editar")
    public void editar() {
        loginController.sessao();
        result.include("list", dao.findAllUsers());
    }

    @Path("/createcliente")
    public void createcliente() {
        loginController.sessao();
        result.include("list", dao.findAllUsers());
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
                entity.setSenha(""+telefone);
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
                result.include("lista", dao.find(entity.getId()));
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
    }
    @Path("/actualizarsenha")
    public void actualizarsenha() {
        loginController.sessao();
        result.include("list", dao.findAllUsers());
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
            entity.setSenha(""+telefone);
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
    public void trocar(Funcionario entity, String senhanova, String confirmarsenha,String senhaantiga){
        try {
            
        Funcionario adm = dao.find(LoginController.valor);
         if (adm.getSenha().equals(senhaantiga)) {
             if (senhaantiga.equals(senhanova)) {
                result.include("error", "A senha nova é igual a senha antiga. Por favor, introduza uma nova senha.");
                result.redirectTo(FuncionarioController.class).actualizarsenha();

            } else if (senhanova.equals(confirmarsenha)) {

               dao.update(entity);
                result.include("succeedMessage", "Senha actualizada com sucesso");
                result.redirectTo(FuncionarioController.class).actualizarsenha();
            } else {
                result.include("error", "Não foi possivel actualizar, senha diferente de confirmar senha.");
                result.redirectTo(FuncionarioController.class).actualizarsenha();
            }
        } else {
            result.include("error", "Não foi possivel actualizar. A senha introduzida não corresponde a senha antiga.");
            result.redirectTo(FuncionarioController.class).actualizarsenha();
        }
        } catch (Exception e) {
            result.include("error", "Senha não actualizada.");
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
