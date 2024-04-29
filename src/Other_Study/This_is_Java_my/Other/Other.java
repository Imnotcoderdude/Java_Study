package Other_Study.This_is_Java_my.Other;

public class Other {
    String company = "현대자동차";
    String model;
    String color;
    int maxSpeed;

    Other(String model) {
        this(model, "은색", 250);
    }
    Other(String model, String color) {
        this(model, color, 250);
    }
    Other(String model, String color, int maxSpeed) {
        this.model = model;
        this.color = color;
        this.maxSpeed = maxSpeed;
    }
}
