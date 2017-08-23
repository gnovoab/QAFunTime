package shape;

/**
 * Created by Gabriel on 23/08/2017.
 */
public class Rectagle extends Shape  implements ShapeOperations{


    public Rectagle() {
        super();
        this.name = "Rectangle";
        this.sides = 4;
    }



    @Override
    public double calculateArea() {
        return sizeOfSide * sizeOfSide;
    }

    @Override
    public double calculatePerimeter() {
        return  sizeOfSide * sides;
    }
}
