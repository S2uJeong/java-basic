package class1;
/**
 * 배열을 이용하여 학생 정보를 저장하는 방법
 * 단점 : 사람이 인식하여 관리하기엔 어렵다. 우리는 하나의 학생을 분리해서 관리하는것에 익숙하지 않다.
 */
public class ClassStart2 {
    public static void main(String[] args) {
        String[] studentNames = {"학생1", "학생2", "학생3"};
        int[] studentAge = {15,26,27};
        int[] studentGrade = {90,30,40};

        for (int i = 0; i < studentNames.length; i++) {
            System.out.println("이름: "+studentNames[i] + " 나이 : " + studentAge[i] + " Grade: " + studentGrade[i]);
        }
    }
}
