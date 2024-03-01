package final1.ex;

public class MemberMain {
    public static void main(String[] args) {
        Member member = new Member("1", "최수정");
        System.out.println(member.toString());
        member.changeData("2", "최수"); // id가 final이라 오류가 난다. Member 클래스에서 해당 함수를 고쳐주었다. 이로써 id는 안 바뀐다.
        System.out.println(member.toString());

    }
}
