package cristinamastellaro.BE_U2_S3_G3.classesEs1;

import lombok.ToString;

@ToString
public class UserData {
    private String nomeCompleto;
    private int eta;

    public void getData(DataSource ds) {
        nomeCompleto = ds.getNomeCompleto();
        eta = ds.getEta();
    }
}
