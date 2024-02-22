package access.b;
import access.a.PublicClass;

public class PublicClassOuterMain {
    public static void main(String[] args) {
        PublicClass publicClass = new PublicClass();
        /*
        DefaultClass가 외부패키지에 있는 파일이라 에러 뜸을 확인
         */
       // DefaultClass1 defaultClass1 = new DefaultClass1();
       // DefaultClass2 defaultClass2 = new DefaultClass2();
    }
}
