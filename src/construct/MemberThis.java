package construct;

public class MemberThis {
    String nameField;

    // this 참조자가 없어도 에러가 나지 않는다.
    void initMember(String name){
        nameField = name;
    }
}

