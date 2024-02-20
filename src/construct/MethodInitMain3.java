package construct;

public class MethodInitMain3 {
    public static void main(String[] args) {
        MemberInit member1 = new MemberInit();
      /*
        member1.name = "Sujeong Choi";
        member1.age = 26;
        member1.grade = 4;
      */
        member1.initMember("sujeong Choi", 26, 4);

        MemberInit member2 = new MemberInit();
        member2.initMember("Injeong Choi", 29, 3);

        MemberInit[] members = {member1, member2};

        for (MemberInit member : members) {
            System.out.println("이름: " + member.name + " 나이: " + member.age + " grade: " + member.grade);
        }
    }
}
