package Other_Study.This_is_Java_my.메소드;
// 가변길이 메소드
public class ComputerExample {
    public static void main(String[] args) {
        // Computer 객체 생성
        Computer com = new Computer();
        // sum() 메소드 호출시 매개값 1, 2, 3을 제공하고
        // 합산 결과를 리턴 받아 result1변수에 대입
        int result1 = com.sum(1,2,3);
        System.out.println("result 1 = " + result1);

        int result2 = com.sum(1,2,3,4,5);
        System.out.println("result 2 = " + result2);

        //sum() 메소드 호출시 배열을 제공하고
        // 합산 결과를 리턴 받아 result3 변수에 대입
        int[] values = {1,2,3,4,5};
        int result3 = com.sum(values);
        System.out.println("result 3 = " + result3);

        //sum() 메소드 호출시 배열을 제공
        // 합산 결과를 리턴 받아 result 변수에 대입함
        int result4 = com.sum(new int[] {1,2,3,4,5,6,7});// 직접 배열변수를 만들어서 매개값으로 제공
        System.out.println("result 4 = " + result4);
    }
}
