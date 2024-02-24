package static1;

/**
    Counter 객체를 새로 만들어, 해당 객체의 필드인 count를 공유해서 누적되었다.
    단점 : Data2가 몇개 생성됐는지 알고싶은 기능인건데, Data2 클래스에서 구현되지 않은 것
 */

public class DataCountMain2 {
    public static void main(String[] args) {

        Counter counter = new Counter();

        Data2 data1 = new Data2("A", counter);
        System.out.println("A count = " + counter.count);

        Data2 data2 = new Data2("B", counter);
        System.out.println("B count = " + counter.count);

        Data2 data3 = new Data2("C",counter);
        System.out.println("C count = " + counter.count);
    }
}
