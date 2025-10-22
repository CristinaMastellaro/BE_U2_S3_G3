package cristinamastellaro.BE_U2_S3_G3.runners;

import cristinamastellaro.BE_U2_S3_G3.classesEs3.*;
import cristinamastellaro.BE_U2_S3_G3.classesEs3.filters.Filter;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class Es3Runner implements CommandLineRunner {
    @Override
    public void run(String... args) throws Exception {
        Generale g1 = new Generale("Controllo", "Paolo Paoletti");
        Generale g2 = new Generale("Attacco", "Gerry Gerrino");

        Colonello c1 = new Colonello(g1, g1.getFunzione(), "Roberto Robertini");
        Colonello c2 = new Colonello(g1, g1.getFunzione(), "Francesco Franceschini");
        Colonello c3 = new Colonello(g2, g2.getFunzione(), "Marco Marchetti");

        Maggiore m1 = new Maggiore(c1, c1.getFunzione(), "Giulio Giulietti");
        Maggiore m2 = new Maggiore(c2, c2.getFunzione(), "Luca Luchetti");
        Maggiore m3 = new Maggiore(c3, c3.getFunzione(), "Riccardo Ricciardi");
        Maggiore m4 = new Maggiore(c2, c2.getFunzione(), "Carlo Carletti");

        Tenente t1 = new Tenente(m1, m1.getFunzione(), "Sandro Sandrini");
        Tenente t2 = new Tenente(m2, m2.getFunzione(), "Gabriele Gabrieli");
        Tenente t3 = new Tenente(m3, m3.getFunzione(), "Pino Pinetti");
        Tenente t4 = new Tenente(m4, m4.getFunzione(), "Samuele Samueli");
        Tenente t5 = new Tenente(m3, m3.getFunzione(), "Enrico Enrichetti");

        List<Ufficiale> ufficiali = List.of(g1, g2, c1, c2, c3, m1, m2, m3, m4, t1, t2, t3, t4, t5);

        Filter f4000 = new Filter(4000);
        Filter f2500 = new Filter(2500);
        Filter f1000 = new Filter(1000);

        f1000.setNext(f2500);
        f2500.setNext(f4000);

        f1000.doFilter(ufficiali);


    }
}
