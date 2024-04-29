package Other_Study.This_is_Java_my.return문;
// return 문 공부
public class Car {
    // 필드 선언
    int gas;
    // 리턴 값이 없는 void 메소드 선언
    // 리턴 값이 없는 메소드이기에 매개값을 받아서 gas 필드값을 변경함
    void setGas(int gas) {
        this.gas = gas;
    }
    boolean isLeftgas() {
        if (gas == 0) {
            System.out.println("개스가 없습니당");
            return false; // false 를 리턴하고 메소드 종료
        }
        System.out.println("개스가 있습니당");
        return true; // true를 리턴하고 메소드 종료
    }
    // 리턴값이 없는 메소드로 gas 필드값이 0이면 마지막 return 문으로 메소드 종료
    void run() {
        while (true) {
            if (gas > 0) {
                System.out.println("달립니다.(개스 잔량 : " + gas + ")");
                gas -= 1;
            } else {
                System.out.println("멈춥니다.(개스 잔량 : " + gas + ")");
                return; // 메소드 종료, break;를 사용하면 while문만 종료하고 밑에 로직이 있다면 실행한다.
            }
        }
    }
}
