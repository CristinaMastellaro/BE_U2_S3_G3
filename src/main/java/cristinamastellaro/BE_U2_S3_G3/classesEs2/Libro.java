package cristinamastellaro.BE_U2_S3_G3.classesEs2;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@Getter
@Setter
@ToString
@AllArgsConstructor
public class Libro implements Pagina {
    private List<String> autori;
    private double prezzo;
    private List<Pagina> sezioniEPagineSingole;

    @Override
    public int getNumPages() {
        int totPages = 0;
        for (Pagina paginaOSezione : sezioniEPagineSingole) {
            totPages += paginaOSezione.getNumPages();
        }
        return totPages;
    }
}
