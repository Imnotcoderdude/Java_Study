package NBCamp.Week03.week01;

// [조건]
// 입력값
//    - 내가 좋아하는 요리 제목을 먼저 입력합니다.
//    - 요리 별점을 1~5 사이의 소수점이 있는 실수로 입력해 주세요. (ex. 3.5)
//    - 이어서 내가 좋아하는 요리 레시피를 한 문장씩 10문장을 입력합니다.

//- 출력값
//    - 입력이 종료되면 요리 제목을 괄호로 감싸서 먼저 출력해 줍니다.
//    - 이어서, 요리 별점을 소수점을 제외한 정수로만 출력해 줍니다. (ex. 3)
//    - 바로 뒤에 정수 별점을 5점 만점 퍼센트로 표현했을 때 값을 실수로 출력해 줍니다. (ex. 60.0%)
//    - 이어서, 입력한 모든 문장 앞에 번호를 붙여서 모두 출력해 줍니다. 조건 끝.

import java.util.Scanner;

public class HomeWork1 {
    public static void main(String[] args) {

        Scanner cook = new Scanner(System.in); // 스캐너를 불러오고 cook으로 지정, 이후 시스템에서 값을 받을 수 있게 System.in 작성

        String title = cook.nextLine(); //문자열 형 String에 title이라는 변수를 지정, 이후 cook을 불러서 값을 입력받을 수 있게 해준 후 next만 사용하면 띄어쓰기에도 줄바꿈이 되기 때문에 nextLine으로 줄바꿈 정지.

        double star = cook.nextDouble(); // 조건에 별점을 소수점이 있는 실수로 받기 위해 double을 사용하여 실수로 값 받기

        //이 로직이 존재하지 않으면 Scanner 가 nextDouble()을 사용하여 double 값을 읽으면 double 값만 소비한 후 입력 버퍼에 개행 문자인 \n이 남는다.
        //그런 다음 nextLine()을 호출하여 입력의 다음 줄을 읽으면 버퍼에 남아있는 개행문자인 \n 값을 읽어서 빈 문자열이 생성되는 것이다.
        cook.nextLine();

        String text1 = cook.nextLine();// 1~10번째 줄에 문자값을 각각 입력받아야 하므로 String을 사용하여 문자열값으료 입력 받기
        String text2 = cook.nextLine();
        String text3 = cook.nextLine();
        String text4 = cook.nextLine();
        String text5 = cook.nextLine();
        String text6= cook.nextLine();
        String text7 = cook.nextLine();
        String text8 = cook.nextLine();
        String text9 = cook.nextLine();
        String text10 = cook.nextLine();

        //제목의 조건이 괄호로 감싸주어야 하는 것 이기 때문에 println 안에 []이것이 들어가야 하고 이것을 집어 넣기 위해 전체를 ""로 감싸준 후 그 안에 []를 입력
        //이후 []안에 입력받은 title 값을 넣어주기 위해 ""를 입력한후 그 안에 title 을 입력. title 좌 우에 +를 추가하여 입력받은 값이 출력 되었을때 []로 감싸져서 출력 되기 위함.
        System.out.println("[" + title + "]");

        int intStar = (int)star; // int 형에 intStar 라는 변수을 지정한 후 형변환을 진행. 위에있는 double 변수인 Star 를 int 형, 즉 정수형으로 변환함

        //조건 중 입력받은 소수점 포함 실수를 퍼센트로 변환하기 위해서 perStar 변수를 지정하고 위에 형변환을 끝낸 intStar 의 정수를 가져와서 백분율로 변환.
        //이때 조건이 소수점 1자리 까지 있어야 하니 5를 나누는 것이 아닌 5.0으로 나누어 소수점이 생기도록 함
        //이 소수점을 받기 위해서 int 가 아닌 double 을 사용하는 것.
        double perStar = intStar / 5.0 *100;

        //예시 출력이 별점 : 4 (80.0%) 이므로 "별점 : " + intStar + "("+ perStar +")" 를 입력하여 예시출력과 동일하게 출력되도록 설정
        System.out.println("별점 : "+intStar+"("+perStar+")");

        System.out.println("1." + text1); //1~10번 입력받은 텍스트를 순서대로 출력하기 위해서 순서대로 text1~10 변수들을 입력함
        System.out.println("2." + text2);
        System.out.println("3." + text3);
        System.out.println("4." + text4);
        System.out.println("5." + text5);
        System.out.println("6." + text6);
        System.out.println("7." + text7);
        System.out.println("8." + text8);
        System.out.println("9." + text9);
        System.out.println("10." + text10);


    }
}
