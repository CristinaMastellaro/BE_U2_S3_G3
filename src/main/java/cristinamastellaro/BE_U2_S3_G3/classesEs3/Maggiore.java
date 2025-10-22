package cristinamastellaro.BE_U2_S3_G3.classesEs3;

public class Maggiore extends Ufficiale {
    public Maggiore(Ufficiale responsabile, String funzione, String nomeCompleto) {
        super(responsabile, funzione, 3000, 3, nomeCompleto);
        if (responsabile.getGerarchia() < 3)
            System.out.println("Questo ufficiale non ha un grado sufficente per essere il responsabile di un maggiore");
        this.responsabile = null;
    }
}
