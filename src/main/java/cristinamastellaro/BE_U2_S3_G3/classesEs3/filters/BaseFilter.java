package cristinamastellaro.BE_U2_S3_G3.classesEs3.filters;

import cristinamastellaro.BE_U2_S3_G3.classesEs3.Ufficiale;
import lombok.Setter;

import java.util.List;

@Setter
public abstract class BaseFilter {
    protected BaseFilter next;
    protected int minStipendio;

    public abstract void doFilter(List<Ufficiale> ufficiale);

    public void next(List<Ufficiale> ufficiali) {
        if (this.next != null) this.next.doFilter(ufficiali);
        else System.out.println("Hai visualizzato tutti gli stipendi");
    }
}
