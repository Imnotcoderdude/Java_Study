package NBCamp.BasicClass.상속강의5_13;

public class ElectricCar extends Car {
    private int batterryCapacity;
    public ElectricCar(String color, int batterryCapacity) {
        super(color);
        this.batterryCapacity = batterryCapacity;


    }
}
