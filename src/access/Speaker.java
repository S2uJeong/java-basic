package access;

public class Speaker {
    int vol;  // 외부에서 필드를 직접 update 가능 (지양)
    // private int vol;

    Speaker(int vol) {
        this.vol = vol;
    }

    void volUp() {
        if (vol >= 100) {
            System.out.println("Max vol");
        } else {
            vol += 10;
            System.out.println("vol + 10");
        }
    }

    void volDown() {
        if (vol < 10) {
            vol -= vol;
            System.out.println("Min vol");
        } else {
            vol -= 10;
            System.out.println("vol - 10");
        }
    }

    void printVol() {
        System.out.println("now vol = " + vol);
    }

}
