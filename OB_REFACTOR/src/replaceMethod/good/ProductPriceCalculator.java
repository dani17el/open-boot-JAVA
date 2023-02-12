package replaceMethod.good;

public class ProductPriceCalculator {


    private double price;
    private int quantiy;

    public ProductPriceCalculator(Product product) {
        this.price = product.getPrice();
        this.quantiy = product.getQuantity();

    }

    public double calculatePrice() {
        double result = 0;

        // calculos

        return result;
    }

}
