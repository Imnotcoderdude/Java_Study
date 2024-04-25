package NBCamp.Week03.Week03Project_계산기;
import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // 스캐너를 불러와서 인풋 받기
        System.out.println("계산하고싶은 기호 입력하세용 : ");// Sout 구문이 먼저 나와야 한다.
        String input4c = sc.nextLine();// 이 구문이 먼저 나오게 되면 입력받은 후 위에 구문 출력

        System.out.println("계산 당할 숫자 입력~ : ");
        int FirstNum = sc.nextInt();

        System.out.println("계산 할 숫자 입력~ : ");
        int secNum = sc.nextInt();

        Calculator2 calculator = null;
        switch (input4c) {
            case "+": calculator = new Calculator2(new AddOperation());
            break;
            case "-": calculator = new Calculator2(new SubstractOperation());
                break;
            case "*": calculator = new Calculator2(new MultiplyOperation());
                break;
            case "/": calculator = new Calculator2(new DivideOperation());
                break;
            default:
                System.out.println("사칙연산 연산자만 입력하시죠?");
                return;
        }
        double result = calculator.Calculate(FirstNum, secNum);
        System.out.println("결과는~ : "+result);
//        Calculator2 calc1 = new Calculator2(new AddOperation());
//        System.out.println(calc1.Calculate( 10,5));
//
//        Calculator2 calc2 = new Calculator2(new SubstractOperation());
//        System.out.println(calc2.Calculate(10,3));
//
//        Calculator2 calc3 = new Calculator2(new MultiplyOperation());
//        System.out.println(calc3.Calculate(10,3));
//
//        Calculator2 calc4 = new Calculator2(new DivideOperation());
//        System.out.println(calc4.Calculate(10,3));
    }
}
