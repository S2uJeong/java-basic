package access.a;

public class AccessData {

    public int publicField;
    int defaultField;
    private int privateFiled;

    public void publicMethod() {
        System.out.println("publicField" + publicField);
    }

    void defaultMethod() {
        System.out.println("defaultField" + defaultField);
    }

    private void privateMethod() {
        System.out.println("privateFiled" + privateFiled);
    }

    public void innerAccess() {
        System.out.println("====== inner call ======");
        // 기본 값을 10으로 해야지!
        publicField = 10;
        defaultField = 10;
        privateFiled = 10;
        publicMethod();
        defaultMethod();
        privateMethod();

    }
}
