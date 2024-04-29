package Other_Study.This_is_Java_my.return문;
// return 문 공부
public class CarExample {
    public static void main(String[] args) {
        Car myCar = new Car();

        myCar.setGas(5);

        if (myCar.isLeftgas()){ // myCar.isLeftgas()메소드가 true일 경우 출발합니다 출력, false일 경우에는 개스를 채우세용 출력
            System.out.println("출발합니다.");
            //리턴값이 없는 run 메소드 호출
            myCar.run();
        }
        System.out.println("가스를 채우세용");
    }
}
