package cristinamastellaro.BE_U2_S3_G3.classesEs3;

public class Colonello extends Ufficiale {
    public Colonello(Ufficiale responsabile, String funzione, String nomeCompleto) {
        super(responsabile, funzione, 4000, 4, nomeCompleto);
        if (responsabile.getGerarchia() < 4)
            System.out.println("Questo ufficiale non ha un grado sufficente per essere il responsabile di un colonello");
        this.responsabile = null;
    }
}
