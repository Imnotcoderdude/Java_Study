package CodeKata;

import java.util.Scanner;

class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // 가로의 길이를 받을 n
        int m = sc.nextInt(); // 세로의 길이를 받을 m 

        // 첫번째 for문은 세로의 길이를 만든다. 안쪽 for 문이 다회로 움직이기에 가로를 찍고 난 다음으로 넘어가는 방식
        for(int i=0; i<m; i++) {
            // 두번째 for 문은 가로의 길이를 만든다. 가로의 길이인 n만큼 반복하고 그 이후 반복문을 뻐져나올때
            // println 으로 인해 한줄 밑으로 내려간 이후 다시 첫번째 반복문으로 이동하고 그 이후 반복함
            for(int j=0; j<n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}