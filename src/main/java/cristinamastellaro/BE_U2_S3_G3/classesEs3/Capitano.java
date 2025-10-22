package cristinamastellaro.BE_U2_S3_G3.classesEs3;

public class Capitano extends Ufficiale {
    public Capitano(Ufficiale responsabile, String funzione, String nomeCompleto) {
        super(responsabile, funzione, 2000, 2, nomeCompleto);
        if (responsabile.getGerarchia() < 2)
            System.out.println("Questo ufficiale non ha un grado sufficente per essere il responsabile di un capitano");
        this.responsabile = null;
    }
}
