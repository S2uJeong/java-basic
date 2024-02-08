package class1.ex;

public class ProductOrderMain {
    public static void main(String[] args) {
        ProductOrder[] orders = new ProductOrder[3];

        ProductOrder order1  = new ProductOrder();
        order1.productName = "두부김치";
        order1.price = 15000;
        order1.quantity = 10;
        orders[0] = order1;

        ProductOrder order2  = new ProductOrder();
        order2.productName = "제육볶음";
        order2.price = 22000;
        order2.quantity = 5;
        orders[1] = order2;

        ProductOrder order3  = new ProductOrder();
        order3.productName = "오댕탕";
        order3.price = 18000;
        order3.quantity = 7;
        orders[2] = order3;

        int totalAmount = 0;
        for(ProductOrder order : orders) {
            System.out.println("상품명 : " + order.productName );
            totalAmount += order.price * order.quantity;
        }

        System.out.println("총 결제금액 : " + totalAmount);
    }

}
