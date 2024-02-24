package access.ex;

public class MaxCounterMain {

    public static void main(String[] args) {
        MaxCounter maxCounter1 = new MaxCounter(1);
        maxCounter1.increment();
        maxCounter1.increment();

        MaxCounter maxCounter2 = new MaxCounter(1000);

        maxCounter2.increment();
    }
}
