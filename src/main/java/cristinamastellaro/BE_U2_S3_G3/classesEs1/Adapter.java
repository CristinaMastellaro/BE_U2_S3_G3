package cristinamastellaro.BE_U2_S3_G3.classesEs1;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.time.Period;
import java.time.ZoneId;

@AllArgsConstructor
@Getter
@Setter
public class Adapter implements DataSource {
    private Info info;

    @Override
    public String getNomeCompleto() {
        return info.getNome() + " " + info.getCognome();
    }

    @Override
    public int getEta() {
        return Period.between(LocalDate.ofInstant(info.getDataDiNascita().toInstant(), ZoneId.systemDefault()), LocalDate.now()).getYears();
    }
}
