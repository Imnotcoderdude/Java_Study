package NBCamp.Week03.week02.Array;

public class Array07 {
    public static void main(String[] args) {
        // 가변배열
        int [][] array = new int [3][];

        //배열 원소마다 각기 다른 크기로 지정
        array[0] = new int[2]; //array의 0번째 요소는 새로운 배열이며 길이가 2이다
        array[1] = new int[4]; //array의 1번째 요소는 새로운 배열이며 길이가 4이다
        array[2] = new int[1]; //array의 2번째 요소는 새로운 배열이며 길이가 1이다

        // 중괄호로 초기화를 아예 해버릴 때도 가능함
        int[][] array2 = {
                {10, 20},
                {10, 20, 30, 40},
                {10}
        };// 길이가 각각 2, 4, 1인 배열로 선언함
    }
}
