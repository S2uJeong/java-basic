package final1;


public class FinalFieldMain {

    public static void main(String[] args) {

        System.out.println("생성자 초기화");
        ConstructInit constructInit1 = new ConstructInit(10);
        ConstructInit constructInit2 = new ConstructInit(20);
        System.out.println(constructInit1.value);
        System.out.println(constructInit2.value);

        /**
         * 어떤 인스턴스든, 다 같은 값을 이용하게 된다.
         * 그렇다면 인스턴스의 해당 필드 메모리를 낭비하는것 같지 않는가? -> 밑의 static final 이용
         */
        System.out.println("필드 초기화");
        FieldInit fieldInit1 = new FieldInit();
        FieldInit fieldInit2 = new FieldInit();
        FieldInit fieldInit3 = new FieldInit();
        System.out.println(fieldInit1.value);
        System.out.println(fieldInit2.value);
        System.out.println(fieldInit3.value);

        /**
         * 따라서 final + 필드 초기화를 사용하는 경우 static을 붙여서 사용하는 것이 효과적이다.
         */
        System.out.println("상수 출력");
        System.out.println(FieldInit.CONST_VALUE);


    }
}
