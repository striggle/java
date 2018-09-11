import java.text.NumberFormat;

public class Product {

    private String code;
    private String description;
    private double price;

    public Product(String incode, String indescription, double inprice) {
        code = incode;
        description = indescription;
        price = inprice;
    }

    public void setCode(String incode) {
        code = incode;
    }

    public String getCode() {
        return code;
    }

    public void setDescription(String indescription) {
        description = indescription;
    }

    public String getDescription() {
        return description;
    }

    public void setPrice(double inprice) {
        price = inprice;
    }

    public double getPrice() {
        return price;
    }

    public String getPriceFormatted() {
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        return currency.format(price);
    }
    
    public String getPriceNumberFormat() {
    	NumberFormat number = NumberFormat.getInstance();
    	return number.format(price);
    }
}