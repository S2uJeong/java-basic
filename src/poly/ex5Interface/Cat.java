package poly.ex5Interface;

public class Cat implements InterfaceAnimal{

    @Override
    public void sound() {
        System.out.println("냐아아아ㅏㅇ옹");
    }

    @Override
    public void move() {
        System.out.println("고양이가 터벅터벅");
    }
}
