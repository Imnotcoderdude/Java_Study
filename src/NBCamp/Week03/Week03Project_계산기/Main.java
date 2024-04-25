package NBCamp.Week03.Week03Project_계산기;

public class Main {
    public static void main(String[] args) {
        Calculator calc = new Calculator(new AddOperation());
        System.out.println(calc.Calculate( 10,5));
        calc.setOperation(new MultiplyOperation());
        System.out.println(calc.Calculate(10,3));
    }
}
