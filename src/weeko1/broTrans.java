package weeko1;

public class broTrans {
    public static void main(String[] args) {
        //데이터를 변경
        //형 변환 예제 : 변수의 타입을 바꾸는 방법
        //문자열 -> 숫자
        //정수 -> 실수
        //실수 -> 정수

        //double형 or float형 -> int형
        // 실수 -> 정수(0.xxx ->0)
        double doubleNumber = 10.10101;
        float   floatNumber = 10.101F;

        int intNumber;
        intNumber = (int)floatNumber;
        System.out.println("float type -> " + floatNumber);
        System.out.println("int type -> " + intNumber);

//        intNumber = (int)doubleNumber; //double -> int
//        System.out.println("double type -> " + doubleNumber);
//        System.out.println("int type -> " + intNumber);

        int intNumber2 = 10;

        double doubleNumber2 = (double) intNumber2;
        float floatNumber2 = (float)intNumber2;

        System.out.println("int type => "+intNumber2);
        System.out.println("double type => "+doubleNumber2);
        System.out.println("float type => "+floatNumber2);
    }
}
