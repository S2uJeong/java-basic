package extends1.ex2;

/**
 * 이제 .move() 함수는 Car 클래스의 메서드로 호출된다.
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
