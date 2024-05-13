package CodeKata;

import java.util.ArrayList;

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


    static class Solution2 {
        public double solution(int[] numbers) {
            double answer = 0;
            for (double num : numbers) {
                answer += num;
            }
            return (double) answer / numbers.length;
        }

        public int solution(int angle) {
            int answer = 0;

            if (0 < angle && angle < 90) {
                answer = 1;
            } else if (angle == 90) {
                answer = 2;
            } else if (90 < angle && angle < 180) {
                answer = 3;
            } else if (180 == angle) {
                answer = 4;
            }
            return answer;
        }

        class Solution {
            public int[] solution(int[] num_list) {
                int evenCount = 0;
                int oddCount = 0;

                for (int num : num_list) {
                    if (num % 2 == 0) {
                        evenCount++;
                    } else {
                        oddCount++;
                    }
                }
                int[] answer = new int[]{evenCount, oddCount};

                return answer;
            }
        }

        public long[] solution(int x, int n) {
            long[] answer = new long[n];
            long sum = x;
            for (int i = 0; i < n; i++) {
                answer[i] = sum;
                sum += x;
            }
            return answer;
        }

    }
}
class Solution {
    public int solution(long num) {
        int answer = 0;
        int count = 0;
        for (int i = 0; i <= 500; i++) {
            if(num == 1) {
                break;
            }
            num = num % 2 == 0 ? num / 2 : (num * 3) + 1;
            count++;
        }
        answer = num == 1 ? count : -1;
        return answer;
    }
}
class Solution1 {
    public int solution(long num) {
        int answer = 0;
        int count = 0;
        for (int i = 0; i <= 500; i++) {
            if (num == 1) break;
            num = num % 2 == 0 ? num / 2 : (num * 3) + 1;
            count++;
        }
        answer = num == 1 ? count : -1;
        return answer;
    }
}