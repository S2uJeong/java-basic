package access;

public class SpeakerMain {

    public static void main(String[] args) {
        Speaker speaker = new Speaker(90);

        speaker.printVol();
        speaker.volUp();
        speaker.volUp();

        speaker.volDown();

       /*
        System.out.println("Update Filed value directly");
        speaker.vol = 200;  // 이제 오류남! 필드가 private라
        System.out.println("Volume over MAX_vol!!!! BOMB~! ");
        speaker.printVol();
        */
    }

}
