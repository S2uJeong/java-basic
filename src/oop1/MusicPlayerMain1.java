package oop1;

public class MusicPlayerMain1 {
    public static void main(String[] args) {
        int volume = 0;
        boolean isOn = false;

        // 1.음악 플레이어 켜기
        //isOn = true;
        System.out.println("음악 플레이어를 시작합니다.");

        volume++;
        System.out.println("음악 플레이어 볼륨 : " + volume);

        if (isOn) {
            System.out.println("음악 플레이어가 켜져 있습니다.");
            System.out.println("음악 플레이어 볼륨 : " + volume);
        } else {
            System.out.println("음악 플레이어가 꺼져 있습니다.");
        }
    }
}
