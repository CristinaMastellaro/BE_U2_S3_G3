package cristinamastellaro.BE_U2_S3_G3.runners;

import cristinamastellaro.BE_U2_S3_G3.classesEs1.Adapter;
import cristinamastellaro.BE_U2_S3_G3.classesEs1.Info;
import cristinamastellaro.BE_U2_S3_G3.classesEs1.UserData;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.Instant;
import java.time.temporal.ChronoUnit;
import java.util.Date;

@Component
public class Es1Runner implements CommandLineRunner {

    @Override
    public void run(String... args) throws Exception {
        Info gino = new Info();
        gino.setNome("Gino");
        gino.setCognome("Paoli");
        gino.setDataDiNascita(Date.from(Instant.now().minus(25 * 365, ChronoUnit.DAYS)));

        Adapter adapter = new Adapter(gino);

        UserData userData = new UserData();
        userData.getData(adapter);
        System.out.println(userData);
    }
}
