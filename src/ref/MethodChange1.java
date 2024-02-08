package ref;
/**
 기본형의 파리미터에 대한 예제
 */
public class MethodChange1 {

    public static void main(String[] args) {
        int a = 10;
        System.out.println("before_a : " + a);
        changePrimitive(a);
        System.out.println("after_a : " + a);
    }

    static void changePrimitive(int x) {
        x = 20;
    }
}
