package ref;
/**
 참조형의 메서드에 대한 예제
 */
public class MethodChange2 {

    public static void main(String[] args) {
        Data dataA = new Data();
        dataA.value = 10;
        System.out.println("before_a : " + dataA.value);
        changePrimitive(dataA);
        System.out.println("after_a : " + dataA.value);
    }

    static void changePrimitive(Data dataX) {
        dataX.value = 20;
    }
}
