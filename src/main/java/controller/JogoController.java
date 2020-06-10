package controller;

import br.com.caelum.vraptor.*;
import dao.JogoDAO;
import dao.CategoriaDAO;
import dao.FuncionarioDAO;
import java.nio.file.Paths;
import java.time.Instant;
import java.util.Date;
import model.Jogo;
import javax.inject.Inject;
import javax.swing.JOptionPane;
import model.Categoria;
import upload.UploadRepository;
import upload.Upload;
import br.com.caelum.vraptor.observer.upload.UploadSizeLimit;
import br.com.caelum.vraptor.observer.upload.UploadedFile;

/**
 *
 * @author
 */
@Controller
@Path("/jogo")
public class JogoController {

    @Inject
    private Result result;
    @Inject
    private JogoDAO dao;
    @Inject
    private CategoriaDAO catdao;
    @Inject
    LoginController loginController;
    @Inject
    private FuncionarioDAO usodao;
    @Inject
    UploadRepository jogoRepository;
    private static final String[] ARQUIVOS_PERMITIDOS = {".jpg", ".jpeg", ".gif", ".bmp", ".png", ".pdf"};

    @Path("/create")
    public void create() {
        loginController.sessao();
        result.include("list", dao.findAllUsers());
        result.include("categorialista", catdao.findAllUsers());
        result.include("lista", usodao.findAllUsers1(LoginController.valor));
    }

    @Path("/editar")
    public void editar() {
        loginController.sessao();
        result.include("list", dao.findAllUsers());
        result.include("categorialista", catdao.findAllUsers());
        result.include("lista", usodao.findAllUsers1(LoginController.valor));
    }

    public boolean validate(String file) {
        String extension = Upload.getExtension(file);
        return Upload.isValidExtension(extension);
    }

    @UploadSizeLimit(sizeLimit = 500 * 1024, fileSizeLimit = 50 * 1024 * 1024)
    @Path("/add")
    public void add(Jogo entity, Integer categoria, String nome, String sinopse,
            String descricao, String fotografia) {
        try {
            entity.setFoto(fotografia);
            if (validate(fotografia)) {
                jogoRepository.uploadImageJogo(fotografia);
            } else {
                result.include("error", "Tipo de arquivo não permitido!\nUse: JPG, JPEG, GIF, BMP, PNG ou PDF.");
                result.redirectTo(JogoController.class).create();
            }
            Categoria category = catdao.find(categoria);
            entity.setDescricao(descricao);
            entity.setNome(nome);
            entity.setCategoria(category);
            entity.setData(Date.from(Instant.now()));
            entity.setEstado(1);
            dao.create(entity);
            result.include("lista1", dao.find(entity.getId()));
            result.include("succeedMessage", "Jogo registado com sucesso");
            result.redirectTo(JogoController.class).create();

        } catch (Exception e) {
            result.include("error", "Jogo não registado.");
            result.redirectTo(JogoController.class).create();
        }
    }

    @Path("/visualizar")
    public void visualizar() {
        loginController.sessao();
        result.include("list", dao.findAllUsers());
        result.include("lista", usodao.findAllUsers1(LoginController.valor));
    }

    public void edita(Integer id) {
        Jogo adm = dao.find(id);
        result.include("entity", dao.find(adm.getId()));
        result.redirectTo(JogoController.class).editar();
    }

    @Path("/edita1")
    public void edita1(Jogo entity, Integer id, String nome, String sinopse) {
        try {
            entity = dao.find(id);
            entity.setNome(nome);
            dao.update(entity);
            result.include("lista1", dao.find(entity.getId()));
            result.include("succeedMessage", "Jogo actualizado com sucesso");
            result.redirectTo(JogoController.class).visualizar();
        } catch (Exception e) {
            result.include("error", "Jogo não actualizado.");
            result.redirectTo(JogoController.class).create();
        }
    }

    public void remove(Integer id) {
        Jogo adm = dao.find(id);
        adm.setEstado(0);
        dao.update(adm);
        result.include("succeedMessage", "Jogo removido com sucesso");
        result.redirectTo(JogoController.class).visualizar();
    }

    public void find(Integer id) {
        Jogo adm = dao.find(id);
        dao.find(id);
        result.redirectTo(JogoController.class).create();
    }

}
