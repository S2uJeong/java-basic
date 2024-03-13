package poly.ex6;


public class SoundFlyMain {
    public static void main(String[] args) {
        // AbstractAnimal[] = {new Dog(), new Bird(), new Chicken()};
        Dog dog =  new Dog();
        Bird bird = new Bird();
        Chicken chicken = new Chicken();

        soundAnimal(dog);
        soundAnimal(bird);
        soundAnimal(chicken);
        System.out.println("=====================");
        // flyAnimal(dog); Abstract만 상속 받았기 때문에 실행 불가.
        flyAnimal(bird);
        flyAnimal(chicken);
    }
    // AbstractAnimal 사용 가능
    private static void soundAnimal(AbstractAnimal animal) {
        animal.sound();
    }
    // Fly 사용 가능
    private static void flyAnimal(Fly fly) {
        fly.fly();
    }
}
