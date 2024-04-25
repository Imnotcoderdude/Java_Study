package NBCamp.Week03.week02.Array;

public class Array05 {
    public static void main(String[] args) {
        // 문자(char), 문자열(String)
        // String = char[]

        // 기본형 변수 vs 참조형 변수
        // 1. 기본형 변수는 '소문자로 시작함' 반면, 참조형 변수는 대문자로 시작함
        //      -Wrapper class에서 기본형 변수를 감싸줄 떄(boxing), int -> Integer
        // 2. 기본형 변수는 값 자체를 저장, 참조형 변수는 별도의 공간에 값을 저장 후 그 주소를 저장함(= 주소형 변수)

        // char 보다 String 을 훤씬 더 많이 씀
        // String이 가지고 있는 기능이 너무 많기 때문
        // Wrapper class와도 상당히 비슷함. -> 기본형 변수가 가지고 있는 기능이 제한됨 -> 다양한 기능을 제공하는 Wrapper로 감쌈으로써 추가기능을 더함

        //string 기능 활용 예시
        String str = "ABCD";

        // (1) length
        int strLength = str.length(); // 변수 str에 저장된 문자열의 길이를 strLength 변수에 저장함 즉 str 변수의 문자열의 길이인 4를 strLength 변수에 저장
        System.out.println(strLength);

        System.out.println("------------");

        // (2) charAt(int index) 문자 하나만 뽑아오고 싶을땐 이거
        char strChar = str.charAt(1);
        System.out.println(strChar);

        System.out.println("------------");

        // (3) subString(int fromIdx, int toIdx) int 형의 from인덱스와 int 형의 to 인덱스가 필요하다
        // 문자열의 어디부터 어디까지가필요하다 그럼 이거 사용
        String strSub = str.substring(0, 3);// 출력값은 0번째부터 3번째 '전' 까지 뽑아 오기 때문에 D를 제외한 ABC만 출력함
        System.out.println(strSub);//

        System.out.println("------------");

        // (4) equals(sString str) 어떠한 스트링이 괄호 안에 들어간 스트링과 같은지 물어보는 함수. 출력은 true 또는 false 가 나오게 됨
        String newStr = "ABCD";
        boolean strEquals = str.equals(newStr); // srt 이라는 String 변수안에 값이 equals 괄호 안에 있는 newStr 이라는 String 변수의 값과 같은지 물어봄
        System.out.println(strEquals); // 같으면 true 틀리면 false 반환

        System.out.println("------------");

        // (5) toCharArray() : String -> char[]
        char[] strCharArray = str.toCharArray();
        System.out.println(strCharArray);

        System.out.println("------------");

        // (6) 반대로 char[] -> String -> char
        char[] charArray = {'A', 'B', 'C', 'D', 'E', 'F'};
        String charArrayString = new String(charArray); // new String 키워드 하나로 charArray를 charArrayString로 변경이 가능함
        System.out.println(charArrayString);

    }
}
