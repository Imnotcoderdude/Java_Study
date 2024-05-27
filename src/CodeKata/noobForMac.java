package CodeKata;

import java.util.ArrayList;

public class noobForMac {
    class Solution32 {
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
class Solution12 {
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
// 콜라츠 추측 if문을 사용해서 처리하기 위해 공부중.
class Solution3 {
    public int solution(int num) {
        int answer = 0;
        int count = 0;
        for (int i = 0; i <= 500; i++) {
            if (num == 1) break;

            if (num % 2 == 0) {
                num = num / 2 ;
            } else {
                num = num * 3 + 1;
            }
            count++;
        }
        if (num == 1) {
            answer = 1;
        } else {
            count = -1;
        }
        return answer;
    }
    class Solution {
        public int[] solution(int[] arr) {
            if (arr.length == 1) {
                return new int[] {-1};
            }
            int min = arr[0];
            for (int num : arr) {
                if (num < min) {
                    min = num;
                }
            }
            int[] result = new int[arr.length - 1];
            int index = 0;
            for (int num : arr) {
                if (num != min) {
                    result[index++] = num;
                }
            }
            return result;
        }
    }
    class Solution1 {
        public String solution(String s) {
            int len = s.length();
            int mid = len / 2;

            if (len % 2 == 0) {
                return s.substring(mid - 1, mid + 1);
            } else {
                return s.substring(mid);
            }
        }
    }

}
// 5월 28일 코드카타 문제 풀이
class solution {
    public int[][] solution(int[][] arr1, int[][] arr2) {
        int row = arr1.length; // 헹 개수
        int col = arr1[0].length; // 열 개수
        int row2 = arr2.length; // 비교를 위한 arr2 의 행 길이
        int col2 = arr2[0].length; // 비교를 위한 arr2 의 열 길이
        int[][] answer = new int[row][col]; // 결과를 담을 배열
        if (row == row2 && col == col2) {
            for (int i=0; i<row; i++) {
                for (int j = 0; j < col; j++) {
                    answer[i][j] = arr1[i][j] + arr2[i][j];
                }
            }
        }
        return answer;
    }
}