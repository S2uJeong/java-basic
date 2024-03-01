package final1;

public class FieldInit {

    static final int CONST_VALUE = 10;
    final int value = 10; // 이렇게 초기화까지 된 경우는, 생성자를 이용해도 에러가 난다.
    /*
    public FieldInit(int value) {
        this.value = value;
    }
     */
}
