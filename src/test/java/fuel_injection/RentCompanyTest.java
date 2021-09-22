package fuel_injection;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class RentCompanyTest {
    private static final String NEWLINE = System.getProperty("line.separator");

    @Test
    void report() throws Exception{
        RentCompany company = RentCompany.create();
        company.addCar(new Sonata(150));
        company.addCar(new K5(150));
        company.addCar(new Sonata(150));
        company.addCar(new Avante(150));
        company.addCar(new K5(150));

        System.out.println("NEWLINE === "+NEWLINE);

        String report = company.generateReport();
        assertThat(report).isEqualTo(
            "Sonata : 15 리터" + NEWLINE +
            "K5 : 20 리터" + NEWLINE +
            "Sonata : 12 리터" + NEWLINE +
            "Avante : 20 리터" + NEWLINE +
            "K5 : 30 리터" + NEWLINE
        );
    }
}
