package oop1;

/**
 * 단점 :
 * 기능을 메서드화 시켰지만, data와 관련된 메서드들이 따로 나와 있어서
 * data에 수정이 일어나면 기능 메서드들도 수정이 일어난다.
 * 이제 class 개념을 통해 데이터와 기능을 온전히 묶어보도록 한다.
 */
public class MusicPlayerMain2 {
    public static void main(String[] args) {
        MusicPlayerData data = new MusicPlayerData();

        on(data);

        volumeUp(data);
        volumeUp(data);
        volumeDown(data);

        printStatus(data);
    }

    static void on(MusicPlayerData data) {
        data.isOn = true;
        System.out.println("음악 플레이어를 시작합니다.");
    }

    static void off(MusicPlayerData data) {
        data.isOn = false;
        System.out.println("음악 플레이어를 끕니다.");
    }

    static void volumeUp(MusicPlayerData data) {
        data.volume++;
        System.out.println("볼륨을 높였습니다.");
    }

    static void volumeDown(MusicPlayerData data) {
        data.volume--;
        System.out.println("볼륨을 낮췄습니다.");
    }

    static void printStatus(MusicPlayerData data) {
        System.out.println("플레이어 on?: " + data.isOn + " 볼륨: " + data.volume);
    }


}
