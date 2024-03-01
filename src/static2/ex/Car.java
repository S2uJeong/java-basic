package static2.ex;

public class Car {
    private String modelName;
    private static int countTotal;

    public Car(String modelName) {
        this.modelName = modelName;
        countTotal ++;
    }
    public static void showTotalCars() {
        System.out.println("생성된 자동차의 총 갯수 = " + countTotal);

    }
}
