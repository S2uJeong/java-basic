package final1;

/**
 * 최대 참여자수를 상수화 하지 않았을 때
 * -> 명수를 수정하고자 하면 수정해야하는 코드가 많다.
 */
public class ConstantMain1 {
    public static void main(String[] args) {
        System.out.println("프로그램 최대 참여자 수 = " + 10000);
        int currentUserCount = 999;
        process(currentUserCount++);
        process(currentUserCount++);
        process(currentUserCount++);

    }

    private static void process(int currentuserCount) {
        System.out.println("참여자 수:" + currentuserCount);
        if (currentuserCount > 1000) {
            System.out.println("대기자로 등록합니다.");
        } else {
            System.out.println("게임에 참여합니다.");
        }

    }
}
