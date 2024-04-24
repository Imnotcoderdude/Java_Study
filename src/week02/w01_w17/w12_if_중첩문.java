package week02.w01_w17;

public class w12_if_중첩문 {
    public static void main(String[] args) {
        //중첩 if 문
        boolean flag = true;
        int number = 2;

        if (flag) {
            if (number == 1) {
                System.out.println("flag가 true 이고 number 가 1 입니다.");
            } else if (number == 2) {
                System.out.println("flag가 true 이고 number 가 2 입니다");
            } else {
                System.out.println("flag가 true 이고 number의 값은 모르겠습니다.");
            }
        } else {
            if (number == 1) {
                System.out.println("flag가 false 이고 number 가 1 입니다.");
            } else if (number == 2) {
                System.out.println("flag가 false 이고 number 가 2 입니다");
            } else {
                System.out.println("flag가 false 이고 number의 값은 모르겠습니다.");
            }
        }
    }
}
