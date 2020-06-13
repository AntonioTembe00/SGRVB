package upload;

import br.com.caelum.vraptor.observer.upload.UploadedFile;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;
import org.apache.commons.io.IOUtils;
import javax.inject.Inject;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpServlet;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FilePermission;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.security.AccessController;
import model.Jogo;

public class UploadRepository extends HttpServlet {

    @Inject
    private ServletContext context;
    private static final String DATA_DIRECTORY = "data";

    String IMAGE_PATH_JOGO = "/Imagens/Upload/Jogo";

    public void updateImage(Jogo jogo) {

    }

    public boolean uploadImageJogo(String file) throws IOException {
        String pasta = IMAGE_PATH_JOGO;
        File diretorio = new File(pasta);
        if (!diretorio.exists()) {
            diretorio.mkdirs();
        }

        Path path = Paths.get(pasta + file);
//                        Files.copy(path);
        return true;

    }

}
