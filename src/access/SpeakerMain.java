package access;

public class SpeakerMain {

    public static void main(String[] args) {
        Speaker speaker = new Speaker(90);

        speaker.printVol();
        speaker.volUp();
        speaker.volUp();

        speaker.volDown();

        // 필드에 직접 접근 (하면 안됨,,)
        System.out.println("Update Filed value directly");
        speaker.vol = 200;
        System.out.println("Volume over MAX_vol!!!! BOMB~! ");
        speaker.printVol();
    }
}
