package Week03.packageExample.main;

import Week03.packageExample.pk1.Car; // 이걸로 임포트 해와서 경로를 직접 입력할 필요가 없다.

public class Main2 {
    public static void main(String[] args) {
        Car car = new Car();
        car.horn();

        Week03.packageExample.pk2.Car pkcar = new Week03.packageExample.pk2.Car();
        pkcar.horn();
    }
}
