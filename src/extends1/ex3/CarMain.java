package extends1.ex3;

/**
 * 이제 .move() 함수는 Car 클래스의 메서드로 호출된다.
 */
public class CarMain {
    public static void main(String[] args) {
        ElectricCar electricCar = new ElectricCar();
        electricCar.openDoor();
        electricCar.move();
        electricCar.charge();
        System.out.println("==============================");

        GasCar gasCar = new GasCar();
        gasCar.openDoor();
        gasCar.move();
        gasCar.fillUp();
        System.out.println("==============================");


        HydrogenCar hydrogenCar = new HydrogenCar();
        hydrogenCar.openDoor();
        hydrogenCar.move();
        hydrogenCar.fillUp();
        System.out.println("==============================");


        Car car = new Car();
        car.openDoor();
        car.move();
    }

}
