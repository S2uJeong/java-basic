package access.b;

import access.a.AccessData;

public class AccessOuterMain {
    public static void main(String[] args) {
        AccessData data = new AccessData();
        data.publicField = 10;
        // data.defaultField = 10; 다른 패키지라 불가

        data.publicMethod();
        //data.defaultMethod();

        data.innerAccess();

    }

}
