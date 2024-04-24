package week02.w01_w17;

public class w16_while문 {
    public static void main(String[] args) {
        int number = 0;
        //while 문은 조건만 들어가면 됨
        while ( number < 3 ) { // number < 3 동안 반복
            number++;
            System.out.println(number+"출력!");
        }
        System.out.println("-------do ~ while--------");
        // do ~ while 문 do 안에 있는 로직을 먼저 수행한 후 while 문으로 이동함
        int number2 = 4;
        do {
            // 이 안에 있는 로직이 먼저 선행되고 그 이후에 while 문으로 넘어가서 수행
            System.out.println(number2 + "출력");
        } while (number2 < 3); // number2 변수는 4이기때문에 while 문의 조건에 맞지 않아서 위에 do 안에있는 sout만 실행하고 while은 멈춤
        // do ~ while 문은 while을 실행하기 이전에 먼저 선행되어야 하는 조건이 있을 경우 사용됨


        System.out.println("-------break--------");
        // break(깨부수다)
        // 가장 가까운 블록의 for문 또는 while, switch문을 중단시킴
        int number3 = 0;
        while (number3 < 3) {
            number3++;
            if (number3 == 2) {
                break;
            }
            System.out.println(number3+"출력");
        }

        System.out.println("-------break심화--------");
        for (int i=0; i<10; i++) {
            System.out.println("i: " + i);
            if (i == 2) {
                break; //i가 2일때 가장 바깥 반복문이 종료됨
            }
            for (int j=0; j<10; j++) {
                System.out.println("j: "+j);
                if (j == 2) {
                    break; // j가 2일때, 안쪽 반복문이 종료
                }
            }
        }
        System.out.println("-----continue-----");
        //continue
        int number4 = 0;
        while (number4 < 3) {
            number4++;
            if (number4 == 2) {
                continue;
            }
            System.out.println(number4 + "출력!");
        }

    }
}
