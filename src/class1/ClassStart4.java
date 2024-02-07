package class1;

public class ClassStart4 {

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

        Student[] students = new Student[2];
        students[0] = student1;
        students[1] = student2;

        for (int i =0; i<students.length; i++) {
            System.out.printf(students[i].name + ' ' + students[i].age + ' ' + students[i].grade);
            System.out.println();
        }

    }
}
