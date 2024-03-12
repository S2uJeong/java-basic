package poly.ex5Interface;

public class Cow implements InterfaceAnimal{

    @Override
    public void sound() {
        System.out.println("음멈어어어어어ㅓ");
    }

    @Override
    public void move() {
        System.out.println("소가 터벅터벅");
    }
}
