package class1;

public class ClassStart5 {

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

        Student[] students = {student1, student2};

        for (int i =0; i<students.length; i++) {
            Student s = students[i];
            System.out.println(s.name + ' ' + s.age + ' ' + s.grade);
        }
        // 향상된 for 문 , 단축키 : iter
        for (Student s : students) {
            System.out.println(s.name + ' ' + s.age + ' ' + s.grade);
        }

        }

    }
