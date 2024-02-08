package ref;
/*
    NullPointerException이 발생하는 예시
 */
public class NullMain3 {
    public static void main(String[] args) {
        BigData bigData = new BigData();
        System.out.println("bigData.count = " + bigData.count);
        // 이거 안될줄 알았는데 null로 초기화 된다.!
        System.out.println("bigData.data = " + bigData.data);
        // NullPointerEx
        System.out.println("bigData.data.value = " + bigData.data.value);

    }
}
