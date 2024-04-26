package This_is_Java_my.OverLoading;

public class CarExample {
    public static void main(String[] args) {
        Car car1 = new Car();
        Car car2 = new Car("supra");
        Car car3 = new Car("supra","2JZ");
        Car car4 = new Car("supra","2JZ",230);

        System.out.println(car1.company);
        System.out.println(car2.model);
        System.out.println(car3.model + car3.engine);
        System.out.println(car4.model + car4.engine + car4.maxSpeed);
    }
}
