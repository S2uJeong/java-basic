package poly;

public class CastingMain1 {
    public static void main(String[] args) {
        Parent poly = new Child(); // x001
        // poly.childMethod(); 호출불가

        // 다운캐스팅 (부모 타입 -> 자식 타입)
        Child child = (Child) poly; // x001
        child.childMethod(); // 이제 호출 가능해진다.

        // 일시적 다운캐스팅 - 해당 메서드를 호출하는 순간만 다운캐스팅
        // (Child) poly.childMethod(); 연산 순서 때문에 해당 코드는 에러남.
        ((Child) poly).childMethod();

        /**
         * upcasting vs downcasting
         */
        Child child2 = new Child();
        Parent parent1 = (Parent) child2;  // 업캐스팅은 생략 가능, 아래와 같이 생략해서 써야한다.
        // 권장된 생략 방법
        Parent parent2  = child2;

        parent1.parentMethod();
        parent2.parentMethod();
    }
}
