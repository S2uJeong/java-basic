package poly.ex5Interface;

public class InterfaceMain {
    public static void main(String[] args) {
        // 인터페이스 객체 생성 불가
        // InterfaceAnimal interfaceAnimal = new InterfaceAnimal();
        InterfaceAnimal[] animals = {new Cat(), new Cow(), new Dog()};
        for (InterfaceAnimal animal : animals) {
            methodAnimal(animal);
        }
    }
    private static void methodAnimal(InterfaceAnimal animal) {
        animal.move();
        animal.sound();
        System.out.println("======================");
    }
}
