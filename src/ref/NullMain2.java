package ref;
/*
    NullPointerException이 발생하는 예시
    - 단순히 생각해서, 참조형변수에 .으로 멤버필드에 접근할 때 참조형변수가 null이면 터진다 생각
    아래와 같이 지역변수에서 null이 터지면 발견하기 쉽다. 하지만 멤버변수는..어떨까...?
 */
public class NullMain2 {
    public static void main(String[] args) {
        Data data = null;
        data.value = 10; // 여기서 예외발생
        System.out.println(data.value);

    }
}
