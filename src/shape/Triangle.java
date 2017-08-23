package shape;


/**
 * Created by Gabriel on 23/08/2017.
 */
public class Triangle extends Shape implements ShapeOperations{
    public Triangle() {
        super();
        this.name = "triangle";
        this.sides= 3;
    }




    @Override
    public double calculateArea() {
        return sizeOfSide * sizeOfSide /2;
    }

    @Override
    public double calculatePerimeter() {
        return  sizeOfSide * sides;
    }
}
