package poly.overriding;

public class OverridingMain {
    public static void main(String[] args) {
        // 1. 자식 변수가 자식 인스턴스 참조
        Child child = new Child();
        System.out.println("Child => child");
        System.out.println("value = " + child.value);
        child.method();
        System.out.println("========================");
        // 2. 부모 변수가 부모 인스턴스 참조
        Parent parent = new Parent();
        System.out.println("Parent => parent");
        System.out.println("value = " + parent.value);
        parent.method();
        System.out.println("========================");

        // 3. 부모 변수가 자식 인스턴스 참조 (다형적참조)
        Parent poly = new Child();
        System.out.println("Parent => chile");
        System.out.println("value = " + poly.value); // 변수는 오버라이딩 안되고 부모꺼 가져오고
        poly.method(); // 메서드는 오버라이딩이 되어서 자식 메서드를 실행함.
        System.out.println("========================");

    }
}
