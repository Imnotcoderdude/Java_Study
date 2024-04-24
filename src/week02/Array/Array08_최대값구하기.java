package week02.Array;

public class Array08_최대값구하기 {
    public static void main(String[] args) {
        //최대값 구하기
        int[] arr = {3,2,1,5,1};

        //최대값 초기화 세팅
        int max = arr[0];

        //최대값 구하기 로직 for문
        for (int num : arr) { // 여기서 arr이 위에 arr 내부의 값인 3,2,1,5,1 을 하나씩 가져와서 num에 대입한다
            if (num > max) { // if를 이용하여 num의 값이 max 의 값보다 큰지 확인한다 만약 num의 값이 max의 값보다 크다면
                max = num; // 여기서 max의 값을 num의 값으로 만들어준다
            }
        }
        System.out.println(max);
        System.out.println("--------max--------");

        //최소값 구하기
        int[] arr2 = {3,2,0,5,1};

        //최소값 초기화
        int min = arr2[0];

        for (int num2 : arr2) {
            if (num2 < min) {
                min = num2;
            }
        }
        System.out.println(min);
    }
}
