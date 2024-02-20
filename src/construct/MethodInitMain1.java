package construct;

public class MethodInitMain1 {
    public static void main(String[] args) {
        MemberInit member1 = new MemberInit();
        member1.name = "Sujeong Choi";
        member1.age = 26;
        member1.grade = 4;

        MemberInit member2 = new MemberInit();
        member2.name = "Injeong Choi";
        member2.age = 29;
        member2.grade = 3;

        MemberInit[] members = {member1, member2};

        for (MemberInit member : members) {
            System.out.println("이름: " + member.name + " 나이: " + member.age + " grade: " + member.grade);
        }




    }
}
