package PlayJava.코딩테스트_프로그래머스;

public class 입문1 {
    class Solution {
        public int Soulution(int num1, int num2) {
            int sum = num1 + num2;
            return sum;
        }
    } class Soultion2 {
        public int Soulution(int num3, int num4) {
            boolean val = (-50000 <= num3 && num3 <= 50000 && -50000 <= num4 && num4 <= 50000);
            int sum2 = -1;
            if (val) {
                sum2 = num3 + num4;
            }
            return sum2;
        }
    }
    class Solution3 {
        public int solution(int num1, int num2) {
            int answer = 0;
            if(0<=num1 && 100>=num1 && 0<=num2 && 100>=num2){
                answer = num1 * num2;
            }
            return answer;
        }
    }
    class Solution4 {
        public int solution(int num1, int num2) {
            int answer = 0;
            if(0<=num1 && 100>=num1 && 0<=num2 && 100>=num2){
                answer = num1 / num2;
            }
            return answer;
        }
    }
    class Solution5 {
        public int solution(int num1, int num2) {
            int answer = 0;
            if(0<=num1 && 100>=num1 && 0<=num2 && 100>=num2){
//                answer = num1 == num2;
            }
            return answer;
        }
    }




}
