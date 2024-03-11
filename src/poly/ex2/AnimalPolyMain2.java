package poly.ex2;

/**
 * 함수를 따로 만들지 않고, 부모타입 배열 이용해서 for문으로 중복없애기
 */
public class AnimalPolyMain2 {
    public static void main(String[] args) {
        Animal[] animals = {new Dog(), new Cat(),new Cow(),new Duck()};
        // 변하지 않는 부분
        for (Animal animal : animals) {
            System.out.println("동물 소리 테스트 시작");
            animal.sound();
            System.out.println("==================");
        }
    }
}
