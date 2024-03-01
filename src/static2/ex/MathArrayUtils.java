package static2.ex;

public class MathArrayUtils {

    // 해당 클래스는 객체생성 없는 정적메서드 사용을 위한 유틸리티 클래스이므로 인스턴스 생성을 막기 위해 private 생성자를 만듬
    private MathArrayUtils() {
    }

    public static int sum(int[] array) {
        int tmp = 0;
        for (int a : array) {
            tmp += a;
        }
        return tmp;
    }
    public static double average(int[] array) {
        return (double) sum(array) / array.length;
    }
    public static int min(int[] array) {
        int tmp = array[0];
        for (int i : array) {
            if (tmp > i) {
                tmp = i;
            }
        }
        return tmp;
    }
    public static int max(int[] array) {
        int tmp = array[0];
        for (int i : array) {
            if (tmp < i) {
                tmp = i;
            }
        }
        return tmp;
    }
}
