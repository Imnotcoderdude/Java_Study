package CodeKata;

public class noobForMac {
    class Solution {
        // 짝수의 값 더하기
        public int solution(int n) {
            int answer = 0;
            for (int i = 2; i <= n; i = i + 2) {
                answer = answer + i;
            }
            return answer;
        }
    }
    class Solution2 {
        public double solution(int[] numbers) {
            double answer = 0;
            for (double num : numbers) {
                answer += num;
            }
            return (double)answer / numbers.length;
        }

        public int solution(int angle) {
            int answer = 0;

            if(0 < angle && angle< 90){
                answer = 1;
            } else if (angle == 90) {
                answer = 2;
            }else if (90 < angle && angle < 180) {
                answer = 3;
            } else if (180 == angle ) {
                answer = 4;
            }
            return answer;
        }

    }

}
