package extends1.access.child;

import extends1.access.parent.Parent;

public class Child extends Parent {

    public void call() {
        publicValue = 1;
        protectedValue = 1; // 상속관계 or 같은 패키지
        //defaultValue = 1; // 같은 패키지 내에서만 가능, 컴파일 오류
        //privateValue = 1; // 접근불가, 컴파일 오휴

        publicMethod();
        protectedMethod();
        // defaultMethod();
        // privateMethod();

        printParent();
    }
}
