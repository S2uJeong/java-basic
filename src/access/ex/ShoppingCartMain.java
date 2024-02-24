package access.ex;

public class ShoppingCartMain {

    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();
        Item item1 = new Item("Pizza", 20000, 3);
        Item item2 = new Item("Salad", 7000, 5);
        Item item3 = new Item("Soup", 3000, 7);


        cart.addItem(item1);
        cart.addItem(item2);
        cart.addItem(item3);

        cart.displayItems();

        // 10개 이상 담기는지 확인
        while (cart.addItem(item1)) {
            cart.addItem(item1);
            cart.displayItems();
            }
        }
    }



