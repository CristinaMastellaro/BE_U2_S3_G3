package cristinamastellaro.BE_U2_S3_G3.classesEs2;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@ToString
public class Sezione implements Pagina {
    private List<Pagina> pagineSingoleOSottoSezione;

    @Override
    public int getNumPages() {
        int totPagine = 0;
        for (Pagina PaginaOSottosezione : pagineSingoleOSottoSezione) {
            totPagine += PaginaOSottosezione.getNumPages();
        }
        return totPagine;
    }
}
