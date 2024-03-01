package final1;

public class FinalRefMain {
    public static void main(String[] args) {
        final Data data = new Data();
        //data = new Data(); // 컴파일 오류
        /**
         * 그러나! 참조 대상의 값은 변경 가능하다.
         * value 변수에는 final이 붙어있지 않았다.
         */
        data.value = 10;
        System.out.println(data.value);
        data.value = 20;
        System.out.println(data.value);
    }
}
