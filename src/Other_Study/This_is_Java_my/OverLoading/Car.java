package Other_Study.This_is_Java_my.OverLoading;

public class Car {
    String color;
    String company = "Toyota";
    String model;
    String engine;
    int maxSpeed;

    Car() {};

    Car(String model) {
        this.model = model;
    };

    Car(String model, String engine) {
        this.model = model;
        this.engine = engine;
    };
    Car(String model,String engine, int maxSpeed) {
        this.model = model;
        this.engine = engine;
        this.maxSpeed = maxSpeed;
    };

}
