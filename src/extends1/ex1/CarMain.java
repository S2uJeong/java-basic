package extends1.ex1;

/**
 * 공통 부분 발견
 * 주유하는 방식이 다르지.. 이동하는건 같잖아!!!
 */
public class CarMain {
    public static void main(String[] args) {
        ElectricCar electricCar = new ElectricCar();
        electricCar.move();
        electricCar.charge();

        GasCar gasCar = new GasCar();
        gasCar.move();
        gasCar.fillUp();

    }

}
