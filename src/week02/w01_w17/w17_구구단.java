package week02.w01_w17;

import java.util.Scanner;

public class w17_구구단 {
    public static void main(String[] args) {

        //입력받는 값을 제외하고 출력
        Scanner sc = new Scanner(System.in);
//        int passNum = sc.nextInt(); // 출력을 제외할 구구단 수 값
//
//
//        for (int i = 2; i <= 9; i++) { //구구단의 첫 번째 수
//            if (i == passNum) {
//                continue;
//            }
//            for (int j = 2; j <= 9; j++) { // 구구단의 두번째 수
//                System.out.println(i + "곱하기" + j + "는" + i * j + "입니다!");
//            }
//        }

        //특정한 단 만 출력하는 구구단 만들기
        System.out.println("---------특정한 값만-----------");

        int spec = sc.nextInt(); // 출력할 구구단 수 값 입력 받는곳
        for (int i = 2; i <= 9; i++) {// 구구단 구문 i가 2부터 시작해서 9보다 작거나 같을때까지 반복, 반복할때마다 1씩 증가
            if (i == spec) {
                for (int j = 2; j <= 9; j++) {// 예를 들어 i가 2로 내려왔을때 j는 2부터 9까지 한바퀴를 완주 후 브레이크로 끊어냄
                    System.out.println(i + "곱하기" + j + "는" + i * j + "입니다!");
                } break;
            }
        }
    }
}
