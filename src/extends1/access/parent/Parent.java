package extends1.access.parent;

public class Parent {

    public int publicValue;
    protected int protectedValue;
    int defaultValue;
    private int privateValue;

    public void publicMethod() {
        System.out.println("Parent.publicMethod");
    }
    protected void protectedMethod() {
        System.out.println("Parent.protectedMethod");
    }
    void defaultMethod() {
        System.out.println("Parent.defaultMethod");
    }
    private void privateMethod() {
        System.out.println("Parent.privateMethod");
    }

    public void printParent() {
        System.out.println("==== Parent 메서드 안 =======");
        System.out.println("public = " + publicValue);
        System.out.println("protected = " + protectedValue);
        System.out.println("default = " + defaultValue);
        System.out.println("private = " + privateValue);

        // 부모 메서드 안에서 모두 접근 가능, 외부에서는 접근 못하는 것들
        defaultMethod();
        privateMethod();
    }

}
