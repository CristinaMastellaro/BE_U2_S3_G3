package cristinamastellaro.BE_U2_S3_G3.classesEs3;

public class Tenente extends Ufficiale {

    public Tenente(Ufficiale responsabile, String funzione, String nomeCompleto) {
        super(responsabile, funzione, 1000, 1, nomeCompleto);
        if (responsabile.getGerarchia() < 1)
            System.out.println("Questo ufficiale non ha un grado sufficente per essere il responsabile di un tenente");
        this.responsabile = null;
    }
}
