package cristinamastellaro.BE_U2_S3_G3.runners;

import cristinamastellaro.BE_U2_S3_G3.classesEs2.Libro;
import cristinamastellaro.BE_U2_S3_G3.classesEs2.Pagina;
import cristinamastellaro.BE_U2_S3_G3.classesEs2.PaginaSingola;
import cristinamastellaro.BE_U2_S3_G3.classesEs2.Sezione;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class Es2Runner implements CommandLineRunner {
    @Override
    public void run(String... args) throws Exception {
        Pagina p1 = new PaginaSingola("Ciao");
        Pagina p2 = new PaginaSingola("Bye");
        Pagina p3 = new PaginaSingola("Au revoir");
        Pagina p4 = new PaginaSingola("Adios");
        Pagina p5 = new PaginaSingola("Se vedemo");

        Sezione s1 = new Sezione(List.of(p1, p2, p3));
        Sezione s2 = new Sezione(List.of(p1, p2, p4, s1));
        Sezione s3 = new Sezione(List.of(s1, s2));

        Libro libro = new Libro(List.of("Gino Paoli", "Federico Carta"), 12.50, List.of(s1, s2, s3, p5));
        System.out.println("Numero totale di pagine del libro: " + libro.getNumPages());
        System.out.println("Numero totale di pagine della sezione 1: " + s1.getNumPages());
    }
}
