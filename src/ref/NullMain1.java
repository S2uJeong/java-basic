package ref;

/**
 * 참조형은 null로 초기화 할 수도 있다.
 */
public class NullMain1 {
    public static void main(String[] args) {
        // cka
        Data data = null;
        System.out.println("1. data = "+ data);
        data = new Data(); // x001
        System.out.println("2. data = "+ data + " value: = " + data.value);
        data = null;
        // x001 을 잃어버렸다. 11줄에서 생성한 참조형은 GC를 통해 삭제된다.
        System.out.println("3. data = "+ data);

    }
}
