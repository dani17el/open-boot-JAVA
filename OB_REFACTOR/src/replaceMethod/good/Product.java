package replaceMethod.good;

/**
 * Tecnica de refactoring para componer metodos
 * (Composing Methods)
 *
 * Replace method with method object
 */
public class Product {

    double price;
    int quantity;
    double discount;
    double shipping;

    // metodos especiales

    double calculatePrice() {
        // ProductPriceCalculator calculator = new ProductPriceCalculator(this);
        // return calculator.calculatePrice();
        return new ProductPriceCalculator(this).calculatePrice();
    }

    // getter y setter
    public double getPrice() { return price; }
    public int getQuantity() { return quantity; }
    public double getDiscount() { return discount;}
    public double getShipping() { return shipping;}
    public void setPrice(double price) { this.price = price ;}
    public void setQuantity(int quantity) { this.quantity = quantity; }
    public void setDiscount(double discount) { this.discount = discount; }
    public void setShipping(double shipping) { this.shipping = shipping; }

}
