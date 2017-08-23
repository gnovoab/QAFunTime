package shape;

/**
 * Created by Gabriel on 23/08/2017.
 */
public class Shape {

   //Fields
    protected String name;
    protected int sides;
    protected double sizeOfSide;


    public Shape(){}


    //Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSides() {
        return sides;
    }

    public void setSides(int sides) {
        this.sides = sides;
    }

    public double getSizeOfSide() {
        return sizeOfSide;
    }

    public void setSizeOfSide(double sizeOfSide) {
        this.sizeOfSide = sizeOfSide;
    }
}
