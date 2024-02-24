package access.ex;

public class ShoppingCart {
    private Item[] items = new Item[10]; // 10개 이상 담지 못한다고 제시됨
    private int itemCount;

    public ShoppingCart() {
    }

    public boolean addItem(Item item) {
        if (itemCount >= items.length) {
            System.out.println("It's Over a Max count");
            return false;
        }
        items[itemCount] = item;
        itemCount++;
        return true;
    }

    public void displayItems(){
        System.out.println("Print Cart Contents");
        for (int i =0; i < itemCount; i++) {
            System.out.println(items[i].getName() + ' ' + items[i].getTotalPrice());
        }
        System.out.println("===== Print Total Price of All items =======");
        System.out.println(calculateTotalPrice()) ;
    }

    private int calculateTotalPrice() {
        int totalPrice = 0;
        for (int i = 0; i < itemCount; i++) {
            totalPrice += items[i].getTotalPrice();
        }
        return totalPrice;
    }
}
