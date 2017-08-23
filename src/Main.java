import shape.Rectagle;
import shape.Shape;
import shape.Triangle;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");


        Car myCar = new Car();

        myCar.setDoors(2);
        myCar.setModel("Whatever model");


        Car myCar2 = new Car("myMake", "myModel", 1998, 4, 200);


        myCar.accelerateSpeed(5);



        Rectagle rectagle = new Rectagle();
        rectagle.setSizeOfSide(4);

        Triangle triangle = new Triangle();
        triangle.setSizeOfSide(4);


        System.out.println("Rectangle -->  Area:["+rectagle.calculateArea()+"]  Perimeter:["+rectagle.calculatePerimeter()+"]");
        System.out.println("Triangle -->  Area:["+triangle.calculateArea()+"]  Perimeter:["+triangle.calculatePerimeter()+"]");

    }
}
