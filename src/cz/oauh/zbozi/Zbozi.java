package cz.oauh.zbozi;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Zbozi {
    private String popis;
    private BigDecimal cena;
    private LocalDate datumNakupu;

    //region Konstruktor a přístupové metody
    public Zbozi(String popis, BigDecimal cena, LocalDate datumNakupu)
            throws ZboziException {
        this.popis = popis;
        setCena(cena);
        this.datumNakupu = datumNakupu;
    }

    public String getPopis() {
        return popis;
    }

    public void setPopis(String popis) {
        this.popis = popis;
    }

    public BigDecimal getCena() {
        return cena;
    }

    public void setCena(BigDecimal cena) throws ZboziException {
        if (cena.compareTo(BigDecimal.ZERO) < 0) {
            throw new ZboziException(
                    "Cena nesmí být záporná - zadáno: "+cena);
        }
        this.cena = cena;
    }

    public LocalDate getDatumNakupu() {
        return datumNakupu;
    }

    public void setDatumNakupu(LocalDate datumNakupu) {
        this.datumNakupu = datumNakupu;
    }
    //endregion
}
