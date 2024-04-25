package NBCamp.Week03;
// 여기서 소문자 car 라는 것은 설계도를 이용해서 만들어 낸 실제 객체
public class main {
    public static void main(String[] args) {
        Car car = new Car(); // 객체생성

        //페달 밟기 전 기어
        System.out.println("페달 밟기 전 car.gear " + car.gear);
        //메서드 호출 및 반환값 저장
        double speed = car.gasPedal(100, 'D');
        System.out.println(speed);

        boolean lights = car.onOffLight();
        System.out.println(lights);

        System.out.println("------");
        System.out.println("페달 밟은 후 car.gear " + car.gear);

        System.out.println();
        car.carSpeeds(100, 80);
        System.out.println();
        car.carSpeeds(110, 120, 150);
    }
}
