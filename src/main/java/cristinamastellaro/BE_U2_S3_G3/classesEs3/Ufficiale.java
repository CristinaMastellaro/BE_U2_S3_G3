package cristinamastellaro.BE_U2_S3_G3.classesEs3;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@AllArgsConstructor
public abstract class Ufficiale {
    protected Ufficiale responsabile;
    protected String funzione;
    protected int stipendio;
    protected int gerarchia;
    protected String nomeCompleto;
}
