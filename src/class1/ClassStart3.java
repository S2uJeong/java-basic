package class1;

public class ClassStart3 {

    public static void main(String[] args) {
        Student student1;
        student1 = new Student();
        student1.name = "최수정";
        student1.age = 26;
        student1.grade =100;

        Student student2 = new Student();
        student2.name = "최모씨";
        student2.age = 29;
        student2.grade = 90;

        System.out.println(student1.name +' '+ student1.age + ' ' + student1.grade);
        System.out.println(student2.name +' '+ student2.age + ' ' + student2.grade);

    }
}
