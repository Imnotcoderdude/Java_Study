package NBCamp.Week03.week02.Array;

public class Array06 {
    public static void main(String[] args) {
        // 반복문을 통한 초기화
        int[][] array = new int[2][3]; // 최초 선언 new int[i][j]

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.println("출력값 => " + i +"," + j);
                array[i][j] = 0;  // i, j 는 위 노란색 네모박스 안에있는 숫자를 의미하며 인덱스 라고 부릅니다.
//                System.out.println("array[" + i + "][" + j + "] = " + array[i][j]);
                //결과 값이 1씩 늘어나는 이유는 for문 안에 i++로 인해 반복될수록 1씩 증가하기 때문이다 j도 마찬가지
                // 이렇게 순환하면서 초기값을 0으로 세팅한다는데 이게 무슨 뜻인지?
            }
        }
    }
}
