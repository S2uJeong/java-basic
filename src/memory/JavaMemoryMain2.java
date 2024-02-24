package memory;

public class JavaMemoryMain2 {
    public static void main(String[] args) {
        System.out.println("> main start");
        method1();
        System.out.println("> main start");
    }

    static void method1() {
        System.out.println(">> method1 start");
        Data data = new Data(10);
        method2(data);
        System.out.println(">> method1 start");
    }

    static void method2(Data data) {
        System.out.println(">>> method2 start");
        System.out.println("data.value = " + data.getValue());
        System.out.println(">>> method2 start");
    }
}
