package ref;
/*
    NullPointerExceptio 에러 해결
    - 해당 에러는 null값에 .(dot)을 찍었다고 생각하면 쉽게 해결 가능하다.
 */
public class NullMain4 {
    public static void main(String[] args) {
        BigData bigData = new BigData();
        // 에러 해결 부분. 참조할 곳을 만들어 준다.
        bigData.data = new Data();
        System.out.println("bigData.count = " + bigData.count);
        System.out.println("bigData.data = " + bigData.data);
        System.out.println("bigData.data.value = " + bigData.data.value);

    }
}
