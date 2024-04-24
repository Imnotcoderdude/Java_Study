package week02.Array;

import java.util.Arrays;

public class Array02 {
    public static void main(String[] args) {
        // 초기화 방법

        // 1. 배열에 특정값을 대입해서 선언 값을 대입하기만함
        int[] intArray = {1,2,3,4,5};
        String[] stringArray = {"a","b","c","d"};

        // 2. for문을 통해서 대입하는 방법 값을 대입하기만 함 이 문장으로 인해 i의 시작값이 0 이기 때문에 1,2,3,4,5 가 출력되는 것이 아닌 0,1,2,3,4 가 출력된다
        // 왜냐하면 intArray.lengh로 크기를 intArray의 크기인 5로 할당을 해놓았기 때문에 5개의 값만을 출력해 주는데 첫 요소가 1 -> 0으로 할당되어 바뀐것
        for (int i = 0; i < intArray.length; i++) {
            intArray[i] = i;
        }
        System.out.println("-----------");

        // 다건출력 값을 출력까지 해봄

        for (int i = 0; i < intArray.length; i++) {
            System.out.println(intArray[i]);
        }
        System.out.println("-----------");

        // 향상된 for 문 위에 적어둔 배열 변수 intArray의 세부요소인 1,2,3,4,5 를 하나씩 하나씩 전부 끌어와서 출력, 즉 다건출력을 해준다
        int[] intArray2 = {1,2,3,4,5};
        for (int i : intArray2) { // 향상된 for문에서 int i 는 index의 i가 아닌 item 의 i라고 생각해야 한다. 배열의 아이템 하나 하나를 다 가져온다고 생각하자.
            System.out.println(i);
        }
        System.out.println("-----------");
        // 배열의 주소를 모두 같은 값으로 초기화 하는 방법
        int[] intArray3 = {1,2,3,4,5};
        Arrays.fill(intArray3, 1); //intArray3 안에 있는 요소들을 전부 1로 초기화

        for (int i : intArray3) {
            System.out.println(i); // 그렇게 되면 출력값은 1이 5번 나오게 된다.
        }

    }
}
