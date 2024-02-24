package access.ex;

public class MaxCounter {
    private int count = 0;
    private int maxCount;

    public MaxCounter(int maxCount) {
        this.maxCount = maxCount;
    }

    public void increment() {
        if (isMaxValue()) {
            System.out.println("It's Max Count : " + maxCount);
        } else {
            count += 1;
        }
    }

    private boolean isMaxValue() {
        return count >  maxCount;
    }


}
