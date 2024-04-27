package This_is_Java_my;

public class CalculatorExample {
    public static void main(String[] args) {
        Calculator calc = new Calculator();

        calc.powerOn();

        int result1 = calc.plus(5,6);
        System.out.println("Result1: " + result1);

        int a = 10;
        int b = 4;
        double result2 = calc.divide(a,b);
        System.out.println("result2: " + result2);


        calc.powerOff();
        }
    }

