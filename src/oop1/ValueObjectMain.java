package oop1;

public class ValueObjectMain {
    public static void main(String[] args) {
        ValueData data = new ValueData();

        for (int i =0; i <3; i++) {
            data.add();
        }
        System.out.println("최종 숫자: " + data.value);

    }


}
