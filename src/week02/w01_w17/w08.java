package week02.w01_w17;

public class w08 {
    public static void main(String[] args) {
        // [ 연산자의 우선 순위 : 산술 > 비교 > 논리 > 대입 ]
        int x = 2;
        int y = 9;
        int z = 10;

        // 여기에서 <>는 비교 연산자 &&는 논리 연산자 고로 우선순위는 비교 먼저 이후 논리
        boolean result = x < y && y < z; // x < y = true 이고 y < z = true 이기 때문에 true && true 이므로 true를 반환.
        System.out.println(result);
        System.out.println("-----------------");

        result = x + 10 < y && y < z; // false && true 이므로 and 연산자인 &&은 둘중 하나라도 false 이면 false 를 반환하기 때문에 답은 false 이다.
        System.out.println(result);
        System.out.println("-----------------");

        result = x + 2 * 3 > y;// x + 2 * 3 = 8 > y = false 이므로 false 를 반환함
        System.out.println(result);

        System.out.println("-----------------");
        result = (x + 2) * 3 > y;// x + 2 * 3 = 8 > y = false 이므로 false 를 반환함
        System.out.println(result);
    }
}
