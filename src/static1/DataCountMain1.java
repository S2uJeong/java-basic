package static1;

/**
 * 의도한 대로 작동하지 않는 프로그램 예시
 * 인스턴스가 생성된 개수를 알고 싶지만, 객체 생성마다 count는 초기화 되므로 갯수를 다 1로 출력하게 된다.
 * 변수를 인스턴스끼리 공유하지 않기 때문.
 */

public class DataCountMain1 {
    public static void main(String[] args) {
        Data1 data1 = new Data1("A");
        System.out.println("A count = " + data1.count);

        Data1 data2 = new Data1("B");
        System.out.println("B count = " + data1.count);

        Data1 data3 = new Data1("C");
        System.out.println("C count = " + data1.count);
    }
}
