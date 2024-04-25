package NBCamp.Week03.packageExample.main;
//import NBCamp.Week03.packageExample.pk1.Car;

public class Main {
    public static void main(String[] args) {
        // 패키지는 클래스의 일부분이며, 하위 패키지를 도트(.)로 구분한다.
        // 다른 패키지에 접근할 떄는 패키지의 경로를 입력해야함
        Week03.packageExample.pk1.Car car1 = new Week03.packageExample.pk1.Car();
        Week03.packageExample.pk2.Car car2 = new Week03.packageExample.pk2.Car();

        car1.horn();
        car2.horn();
    }
}
