package NBCamp.Week03.week02.w01_w17;

public class w07 {
    public static void main(String[] args) {
        //기타연산자
        // (1) 형변환 연산자
        int intNumber = 93 + (int)98.8; // 93 + 98 = 191
        System.out.println(intNumber);

        double  doubleNumber = (double)93 +98.8; // 93.0 + 98.8 = 191.8
        System.out.println(doubleNumber);

        System.out.println("---------삼항연산자---------");
        // (2) 삼항연산자
        // 비교연산자와 항상 함께 쓰인다.
        // 비교연산자의 결과 : true or false -> 이 결과의 값에 따라 결정되는 무언가!
        // 조건 ? true : false <- 연산식
        int x = 1;
        int y = 9;

        boolean b = (x == y) ? true : false; // 맞으면 true 틀리면 false 값을 b 에 할당.
        System.out.println(b);

        // x가 y랑 다르니? 응!!!!
        String s = (x != y) ? "정답" : "오답"; // 왼쪽에 값이 식이 맞을때 오른쪽이 틀릴때 이기때문에 이 문장에 출력값은 정답이다
        s = (x != y) ? "오답" : "정답"; // 이번엔 서로 반대로 바꾸어서 작성 하였기 때문에 왼쪽이 맞을때 오른쪽이 틀릴때 이기 때문에 식이 맞기때문에 왼쪽에 있는 "오답"을 출력한다.
        System.out.println(s);

        // 설명하면 x가 y보다 클 경우 = ture 이기 때문에 ? 뒤에 식인 x를 집어넣고 식이 틀렸다면 false 값인 y를 넣어주는 것이다.
        int max = (x > y) ? x : y; // 그렇기에 이 문장에 max 의 할당된 값은 식이 성립하지 않기 때문에 false 값인 y를 넣어주고 y의 값은 9이기때문에 9를 출력해준다.
        System.out.println(max);

        int min = (x < y) ? x : y; // x의 값이 y보다 작은게 성립 되므로 true 값을 반환하여 min 에 x가 할당되고 x의 값인 1이 println으로 출력됨
        System.out.println(min);

        // (3) instance of (3주차 -> 클래스, 객체 편에서 상세히 다룸. 여기서는 간단하게만)
        // 피 연산자가 조건에 명시된 클래스의 객체 인지 비교하여 <- 이것 때문에 3주차에서 다룸
        //맞으면 -> true
        // 틀리면 -> false

    }
}
