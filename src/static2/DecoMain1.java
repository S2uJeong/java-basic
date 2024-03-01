package static2;

public class DecoMain1 {

    public static void main(String[] args) {
        String s = "Hello Java";
        Decoutil1 decoutil1 = new Decoutil1();
        String deco = decoutil1.deco(s);

        System.out.println("before" + s);
        System.out.println("after" + deco);

    }



}
