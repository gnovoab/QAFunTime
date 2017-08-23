/**
 * Class that represents a car
 */
public class Car {

    //Fields
    private String make;
    private String model;
    private int yearModel;
    private int doors;
    private int speed;
    private double maxSpeed;

    /**
     * Constructor
     */
    public Car() {
    }


    /**
     * Constructor
     * @param make
     * @param model
     * @param year
     * @param doors
     * @param maxSpeed
     */
    public Car(String make, String model, int year, int doors, double maxSpeed) {
        this.make = make;
        this.model = model;
        this.yearModel = year;
        this.doors = doors;
        this.maxSpeed = maxSpeed;
    }



    //Methods
    public void accelerateSpeed (int speed)
    {
        this.speed = speed + 5;
    }
    public void brakeSpeed (int speed)
    {
        this.speed = speed - 5;
    }



    //Getters and Setters
    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYearModel() {
        return yearModel;
    }

    public void setYearModel(int yearModel) {
        this.yearModel = yearModel;
    }

    public int getDoors() {
        return doors;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public double getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(double maxSpeed) {
        this.maxSpeed = maxSpeed;
    }
}
