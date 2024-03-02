package extends1.super2;

/**
 * ClassB에는 생성자가 정의되어 있어, 기본생성자가 생성되지 않았다. 따라서,  super(); 호출을 생략할 수 없다.
 */
public class ClassC extends ClassB{

    public ClassC() {
        super(10,10);
        System.out.println("Class C 생성자");
    }

}
