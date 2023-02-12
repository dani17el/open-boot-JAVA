package removeAssign.good;

import removeAssign.bad.Order;

public class Main {


    double calculateDiscount(Order order, double totalPrice) {
        double result = totalPrice;

        if (order == null || order.getPrice() == null)  // programacion defensiva
            return result;

        if (order.getPrice() > 100)
            result += order.getPrice() * order.getOffer();  // sobrescrito totalPrice
        return result;
    }
}
