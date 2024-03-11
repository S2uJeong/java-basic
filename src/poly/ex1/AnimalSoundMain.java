package poly.ex1;

/**
 * 중복 코드 발생,
 * 중복을 제거하려고 해도 타입이 달라 메서드나 for문으로 효율적으로 없앨 수 없었다.
 * 이때 다형적 참조와 메서드 오버라이딩을 이용하면 Dog, Cat, Cow 가 모두 같은 타입을 사용하고,
 * 각자 자신의 메서드도 호출할 수 있다.
 */
public class AnimalSoundMain {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();
        Cow cow = new Cow();

        dog.sound();
        cat.sound();
        sound(cow);
    }

    private static void sound(Cow cow) {
        cow.sound();
    }
}
