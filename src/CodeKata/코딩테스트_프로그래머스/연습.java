package CodeKata.코딩테스트_프로그래머스;

public class 연습 {
    // 두 정수 a, b가 주어졌을 때 a와 b 사이에 속한 모든 정수의 합을 리턴하는 함수, solution을 완성하세요.
    //예를 들어 a = 3, b = 5인 경우, 3 + 4 + 5 = 12이므로 12를 리턴합니다.
    public long solution(int a, int b) {
        int answer = 0;
        if (a > b) {
            for (int i = b; i <= a; i++) {
                answer += i;
            }
        } else if (b > a) {
            for (int i = a; i <= b; i++) {
                answer += i;
            }
        } else if (a == b) {
            return a;
        }
        return answer;
        // 위 답은 틀렸음
    }
    public long solution2(int a, int b) {
        // 이게 정답이었다.
        int min = Math.min(a, b);
        int max = Math.max(a, b);
        long answer = 0;

        for (int i = min; i <= max; i++) {
            answer += i;
        }

        return answer;
    }
    public int soulsion(int num) {

        int answer = 0;
        return answer;
    }
}
