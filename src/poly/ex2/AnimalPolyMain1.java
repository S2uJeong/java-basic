package poly.ex2;

/**
 * 이제 새로운 동물을 추가한다고 해도, soundAnimal 메서드를 활욯할 수 있다.
 */
public class AnimalPolyMain1 {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Animal poly = new Dog(); // 이것도 당연 가능하다. Animal클래스에서 메서드를 찾다가, 오버라이딩 된 메서드가 있으면 자리를 뺏긴다.
        Cat cat = new Cat();
        Cow cow = new Cow();

        soundAnimal(dog);
        soundAnimal(cat);
        soundAnimal(cow);
        soundAnimal(poly);
    }
    private static void soundAnimal(Animal animal) {
        System.out.println("동물 소리 테스트 시작");
        animal.sound();
        System.out.println("==================");
    }
}
