package cristinamastellaro.BE_U2_S3_G3.classesEs3.filters;

import cristinamastellaro.BE_U2_S3_G3.classesEs3.Ufficiale;

import java.util.List;

public class Filter extends BaseFilter {

    public Filter(int minStipendio) {
        this.minStipendio = minStipendio;
        next = null;
    }

    @Override
    public void doFilter(List<Ufficiale> ufficiali) {
        System.out.println("Gli ufficiali che percepiscono almeno " + minStipendio + "€ di stipendio sono:");
        ufficiali.forEach(uff -> {
            if (uff.getStipendio() >= minStipendio)
                System.out.println(uff.getNomeCompleto());
        });
        if (next != null) next.doFilter(ufficiali);
        else System.out.println("Controllati tutti gli stipendi!");
    }
}
