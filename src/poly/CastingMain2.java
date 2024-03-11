package poly;

public class CastingMain2 {
    public static void main(String[] args) {
        Parent parent1 = new Child();
        // Child child = parent1; // 에러. Child 타입이긴하나, Parent 타입 변수에 참조 됐기 때문
        Child child1 = (Child) parent1;
        child1.childMethod();

        /**
         * 상위타입 객체를 생성 후, 다운캐스팅하면 힙메모리에 하위타입의 인스턴스가 생성되지 않았으므로 에러 발생
         */
        Parent parent2 = new Parent();
        // Child child2 = (Child) parent2; // 런타임 오류 - ClassCastException
        // child2.childMethod();  // 실행불가
    }
}
