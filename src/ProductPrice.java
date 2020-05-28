import java.math.BigDecimal;

public class ProductPrice {
    private String name;
    private BigDecimal nettoPrice;
    private BigDecimal vat;

    public ProductPrice(String name, BigDecimal nettoPrice, BigDecimal vat) {
        this.name = name;
        this.nettoPrice = nettoPrice;
        this.vat = vat;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getNettoPrice() {
        return nettoPrice;
    }

    public void setNettoPrice(BigDecimal nettoPrice) {
        this.nettoPrice = nettoPrice;
    }

    public BigDecimal getVat() {
        return vat;
    }

    public void setVat(BigDecimal vat) {
        this.vat = vat;
    }

    }
