package week02.w01_w17;

import java.util.Objects;
import java.util.Scanner;

public class w13_가위바위보 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //A 에 값을 입력받는 부분
        System.out.println("A 입력 :");
        String aHand = sc.nextLine();

        //B 에 값을 입력받는 부분
        System.out.println("B 입력 :");
        String bHand = sc.nextLine();

        // 두 개의 값을 비교하는 메서드 -> Objects.equals(좌 , 우) : 좌 우가 같은 경우 true, 다르면 false

        //중첩 if문으로 가위바위보 만들기. 여기에서 중요한 점은 어디에 else if 를 넣느냐, if에서 원하는 값이 없는 경우 어떻게 else로 가느냐
        if (Objects.equals(aHand, "가위")) {
            if (Objects.equals(bHand, "가위")) {
                System.out.println("A와 B는 비겼습니다");
            } else if (Objects.equals(bHand, "바위")) {
                System.out.println("B가 이겼습니다");
            }else if (Objects.equals(bHand, "보")) {
                System.out.println("A가 이겼습니다");
            }else {
                System.out.println("B가 이상한 값을 입력했습니다!!!!!!!");
            }
        } else if (Objects.equals(aHand, "바위")) {
            if (Objects.equals(bHand, "가위")) {
                System.out.println("A가 이겼습니다");
            } else if (Objects.equals(bHand, "바위")) {
                System.out.println("A와 B가 비겼습니다");
            }else if (Objects.equals(bHand, "보")) {
                System.out.println("B가 이겼습니다");
            }else {
                System.out.println("B가 이상한 값을 입력했습니다!!!!!!!");
            }
        } else if (Objects.equals(aHand, "보")) {
            if (Objects.equals(bHand, "가위")) {
                System.out.println("A가 이겼습니다");
            } else if (Objects.equals(bHand, "바위")) {
                System.out.println("A와 B가 비겼습니다");
            }else if (Objects.equals(bHand, "보")) {
                System.out.println("B가 이겼습니다");
            }else {
                System.out.println("B가 이상한 값을 입력했습니다!!!!!!!");
            }
        } else {
            System.out.println("A가 이상한 값을 입력했습니다");
        }
    }
}
