package poly.ex5Interface;

public class Dog implements InterfaceAnimal{

    @Override
    public void sound() {
        System.out.println("멍ㅁ엄엄엄ㅇ");
    }

    @Override
    public void move() {
        System.out.println("멍멍이가 터벅터벅");
    }
}
