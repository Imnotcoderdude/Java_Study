package weeko1;

import java.util.Arrays;

public class VarPrac {
    public static void main(String[] args) {


        // 한번에 선언과 동시에 값을 할당함
        boolean flag = true;

        flag = false; // 첫 할당 이후 다시 할당하기

        //두번에 나눠서 처음엔 선언 이후에 값을 할당.
        //특별한 이유가 없다면 굳이 두번에 나눠서 쓰는 일은 없음
        boolean flag2;
        flag2 = true;

        flag2 = false; // 이후에 값을 바꾸는 것도 가능.

        final boolean flag3 = true; // 처음에 final이 들어가게 되면 후에 값을 바꾸는것이 불가능.

        System.out.println(flag);


        //문자형
        char alphabet = 'A';
        System.out.println(alphabet);

        //정수형
        byte byteNumber = 127;
        short shortNumber = 32767;
        int intNUmber = 2147483647;
        long longNumber = 2147483647L;

        System.out.println(byteNumber);
        System.out.println(shortNumber);
        System.out.println(intNUmber);
        System.out.println(longNumber);

        //실수형
        float floatNumber = 0.123F;
        double doubleNumber = 0.1234;

        System.out.println(floatNumber);
        System.out.println(doubleNumber);


        //참조형 변수!!!!!!!!!!!!!!!!!!!
        //(1) 문자열 변수
        String helloWorld = "hello World";

        System.out.println(helloWorld);

        //배열
        int[] a = {1, 2, 3};

        System.out.println(a);
        // 이렇게 하면 알수 없는 값이 출력되게 됨 전체 배열을 출력하고 싶다면
        System.out.println(Arrays.toString(a));
        // 이렇게 Arrays.toString을 하고 괄호 안에 지정된 변수의 이름을 넣어서 출력하면 된다.

        //래퍼 클래스
        int numBer = 21;
        Integer num = numBer; // int를 박싱

        //console.log(num.intValue())
        System.out.println(num.intValue()); //언박싱

    }
}
