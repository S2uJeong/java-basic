package access.ex;

public class Item{
    private String name;
    private int value;
    private int amount;

    public Item(String name, int value, int amount) {
        this.name = name;
        this.value = value;
        this.amount = amount;
    }

    public String getName() {
        return name;
    }

    public int getTotalPrice() {
        return value * amount;
    }
}
