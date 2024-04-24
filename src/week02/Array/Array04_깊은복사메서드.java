package week02.Array;

import java.util.Arrays;

public class Array04_깊은복사메서드 {
    public static void main(String[] args) {
        // 2. Arrays.copy0f() 메서드
        int[] a = {1, 2, 3, 4, 5};
        int[] b = Arrays.copyOf(a, a.length); // (복사할 배열 변수, 복사할 배열 변수.length)

        a[3] = 9;
        System.out.println(a[3]);
        System.out.println(b[3]);
    }




}
