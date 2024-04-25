package NBCamp.Week03.week02.w01_w17;

public class w05 {
     //대입 연산자
    public static void main(String[] args) {
        // 변수를 바로 연산해서 그 자리에서 저장하는(대입하는) 연산자
        // =(기본대입연산자), +=, _=, *=......(복합대입연산자)
        // ++ : += 1 즉 예를 들어 a의 값이 10으로 할당되어 있으면 ++a의 값은 + 1 을 한 11이다
        // -- : -= 1 즉 예를 들어 a의 값이 10으로 할당되어 있으면 --a의 값은 - 1 을 한 9이다

        int number = 10;
        //기본대입연산자인 = 를 사용하여 실습.
        number = number + 2; // 10으로 초기화된 number 변수에 +2를 하여 그 자리에서 연산 후 대입하여 number 변수는 최종 12가된다
        System.out.println(number);

        number = number - 2;
        System.out.println(number);

        number = number * 2;
        System.out.println(number);

        number = number / 2;
        System.out.println(number);

        number = number % 2;
        System.out.println(number);

        System.out.println("-------복합대입연산자-------");

        //복합 대입 연산자
        number = 10;

        number += 2; // number = number + 2;
        System.out.println(number);// 결과는 12

        number -= 2; // number = number - 2;
        System.out.println(number);// 위 결과에 - 2 즉 결과는 10

        number *= 2; // number = number * 2;
        System.out.println(number);// 위 결과에 * 2 즉 결과는 20

        number /= 2; // number = number / 2;
        System.out.println(number);// 위 결과에 / 2 즉 결과는 10

        number %= 2; // number = number % 2;
        System.out.println(number);// 위 결과에 2로 나눈 나머지 즉 결과는 0

        System.out.println("-------(++),(--)-------");

        // ++, --
        number++; // number = number + 1; 줄이면 -> number += 1; 또 줄이면 number++;
        System.out.println(number);

        number--;// number = number - 1; 줄이면 -> number -= 1; 또 줄이면 number--;
        System.out.println(number);


    }
}
