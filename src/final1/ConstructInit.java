package final1;

public class ConstructInit {
    /**
     * 멤버변수에 final이 붙으면, 처음 생성자로 생성될 때 할당된 값이 계속 사용된다.
     */
    final int value;

    public ConstructInit(int value) {
        this.value = value;
    }
}
