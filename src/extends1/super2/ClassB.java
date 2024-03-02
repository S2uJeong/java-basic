package extends1.super2;

public class ClassB extends CalssA {

    public ClassB(int a) {
        super(); // 부모의 기본 생성자 생략가능
        System.out.println("CalssB 생성자 a = " + a);
    }

    public ClassB(int a, int b) {
        super();
        System.out.println("CalssB 생성자 a = " + a  + " b = " + b);
    }
}
