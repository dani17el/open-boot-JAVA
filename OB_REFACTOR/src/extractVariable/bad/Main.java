package extractVariable.bad;

public class Main {

    void printProductPrice(Order order){
        Double totalPrice = order.getPrice() * order.getQuantity() -
                order.getOffer() + order.getShipping() * 2.99;

        System.out.println(totalPrice);
    }
}
