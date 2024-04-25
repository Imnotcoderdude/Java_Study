package NBCamp.Week03.week02.w01_w17;

public class w06 {
    public static void main(String[] args) {
        //대입연산자 사용시 주의점
        // ++, --
        int a = 10;
        int b = 10;
        //b의 뒤에 --가 붙어있기 때문에 왼쪽에서 오른쪽으로 읽으며 b는 위에 초기화한 10값 그대로 가지고 있음. 그래서 11 + 9가 아닌 11 + 10이 먼저 들어가기에 출력은 21이다.
        int val = ++a + b--;

        System.out.println("틀린출력값 "+ val);

        val = ++a + --b; // 이렇게 b앞에 --가 먼저 선행되어야지만 정상적으로 11 + 9가 출력되게 된다
        System.out.println("정상 값 "+ val);

        String c = String.format("정상 출력값 테스트 %d",val); //이건 번외로 자리표시자 %d를 활용해서 뒤에 붙은 val의 자리를 지정해준다.
        System.out.println(c);
    }
}
