package construct;

public class MemberConstruct {
    String name;
    int age;
    int grade;

    MemberConstruct(String name, int age) {
        /*
        this.age = age;
        this.name = name;
        this.grade = 50;
         */
        // this 오버로딩 활용, 생성자 안에서만 사용 가능
        this(name, age, 50);
        System.out.println("생성자 호출 name=" + name + ",age=" + age + ",grade=" + grade);
    }

    MemberConstruct(String name, int age, int grade) {
        System.out.println("생성자 호출 name=" + name + ",age=" + age + ",grade=" + grade);
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

}
