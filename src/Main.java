import cz.oauh.zbozi.Zbozi;
import cz.oauh.zbozi.ZboziException;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        try {
            Zbozi zbozi =
                    new Zbozi("Klávesnice",
                            BigDecimal.valueOf(250),
                            LocalDate.now());
        } catch (ZboziException e) {
            System.err.println(
                    "Nepodařilo se vytvořit objekt Zboží: "+
                    e.getLocalizedMessage());
        }
    }
}