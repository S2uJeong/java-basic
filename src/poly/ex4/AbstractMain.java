package poly.ex4;

public class AbstractMain {
    public static void main(String[] args) {
        AbstractAnimal[] animals = {new Dog(), new Cat(),new Pig()};
        // 변하지 않는 부분
        for (AbstractAnimal animal : animals) {
            System.out.println("동물 소리 테스트 시작");
            animal.sound();
            moveAnimal(animal);
            System.out.println("==================");
        }
    }

    private static void moveAnimal(AbstractAnimal animal) {
        System.out.println("동물 움직임 테스트 시작");
        animal.move();
    }


}
