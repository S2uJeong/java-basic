package access.a;

public class AccessInnerMain {
    public static void main(String[] args) {
        AccessData data = new AccessData();

        data.publicField = 1;
        data.publicMethod();

        data.defaultField = 2;
        data.defaultMethod();

        /**
         *  private는 접근 불가,
         *  하지만 AccessData Class에 있는 public innerAccess()함수를 이용하면 간접적으로 접근이 가능하다!
         */
        // data.privateField = 3;
        data.innerAccess();
    }
}
