package week02.w01_w17;

public class w04 {
    //논리 연산자
    //비교 연산의 결과값으로 받을 수 있는 booldea 값을 연결하는 연산자
    //조건을 연결 하였을 때 boolean 값들을 조합하여 참(true) 또는 거짓 (false) 값인 boolean 값을 출력
    //&&(and), ||(or), !(not)
    public static void main(String[] args) {
        boolean flag1 = true;
        boolean flag2 = true;
        boolean flag3 = false;

        System.out.println(flag1);
        System.out.println(flag2);
        System.out.println(flag3);

        // 피 연산자 중 하나라도 true 이면 true 이다. => 또는(or : ||)
        System.out.println("or 연산자(||)---------------");
        System.out.println(flag1 || flag2); // 두개 다 true 이기 때문에 결과값은 true
        System.out.println(flag1 || flag2 || flag3);// 3개중 하나라도 true 가 있으면 true 를 출력하기에 결과는 true

        // 피 연산자가 모두 true이면  true => 그리고(and : &&)
        System.out.println("and 연산자(&&)---------------");
        System.out.println(flag1 && flag2); // 두개 모두 true 이기때문에 결과값은 true
        System.out.println(flag1 && flag3 && flag3); // 3개중에 하나라도 false가 있으면 결과값은 false

        // AND
        System.out.println("and 연산자(&&) 실습---------------");
        System.out.println((5 > 3) && (3 > 1));// true && true => true
        System.out.println((5 > 3) && (3 < 1));// true && false => false
        System.out.println((5 < 3) && (3 < 1));// false && false => false

        // OR
        System.out.println("OR 연산자(||) 실습---------------");
        System.out.println((5 > 3) || (3 > 1));// true || true => true
        System.out.println((5 > 3) || (3 < 1));// true || false => true
        System.out.println((5 < 3) || (3 < 1));// false || false => false
        System.out.println((5 > 3) || (3 > 1) || (2 < 1));// true || true || false => true

        // 논리 부정 연산자( ! " NOT)
        System.out.println("논리부정연산자( ! ) 실습---------------");
        System.out.println(!flag1);// flag1 은 ture 값이기때문에 부정 연산자 (!)에 의해 뒤집혀서 false로 나옴
        System.out.println(!flag2);// flag2 은 ture 값이기때문에 부정 연산자 (!)에 의해 뒤집혀서 false로 나옴
        System.out.println(!flag3);// flag3 은 false 값이기때문에 부정 연산자 (!)에 의해 뒤집혀서 true로 나옴

    }
}
