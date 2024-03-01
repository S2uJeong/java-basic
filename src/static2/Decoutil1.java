package static2;
/**
 * 기능만 있는 클래스.
 * 사실 상 클래스는 멤버변수가 중요한데, 해당 기능은 사용하는 인스턴스 변수도 없고 단순히 기능만 제공한다.
 * ---> 객체 생성이 무의미해 보인다.
 */
public class Decoutil1 {
    public String deco(String str) {
        return "*" + str + "*";
    }
}
