package oop1.ex;

public class RectangleMain {
    public static void main(String[] args) {

        Rectangle rectangle = new Rectangle();
        rectangle.width = 5;
        rectangle.height = 5;

        int area = rectangle.calculateArea();
        int perimeter = rectangle.calculatePerimeter();
        boolean isSquere = rectangle.isSquare();

        System.out.println("정사각형인가?:" +  isSquere + " 넓이:" + area + " 둘레:" + perimeter);




    }


}
