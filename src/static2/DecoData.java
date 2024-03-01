package static2;

public class DecoData {
    private int instanceValue;
    private static int staticValue;

    public static void staticCall(){

        // instanceValue++; //  컴파일 에러
        // instanceMethod(); // 컴파일 에러

        staticValue++;
        staticMethod();
    }

    public static void staticCall(DecoData data) {
        data.instanceValue++;
        data.instanceMethod();
    }

    public void instanceCall(){
        // staic 변수/메서드에 접근할 수 있다.
        staticValue++;
        staticMethod();

        instanceValue++;
        instanceMethod();
    }



    private void instanceMethod() {
        System.out.println("instanceValue = " + instanceValue);
    }
    private static void staticMethod() {
        System.out.println("staticMethod = " + staticValue);
    }

}
