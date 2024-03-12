package poly.ex3;

public class AbstractMain {
    public static void main(String[] args) {
        AbstractAnimal[] animals = {new Dog(), new Cat(),new Pig()};
        // 변하지 않는 부분
        for (AbstractAnimal animal : animals) {
            System.out.println("동물 소리 테스트 시작");
            animal.sound();
            animal.move(); // 오버라이딩이 아닌 메서드 (다 똑같이 실행된다.)
            System.out.println("==================");
        }
    }
}
