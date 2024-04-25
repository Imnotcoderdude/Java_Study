package NBCamp.Week03.week02.w01_w17;

public class w09 {
    public static void main(String[] args) {
        short x = 10;
        int y = 20;

        System.out.println("----short형을 int로----");
        // x 와 y 의 변수 타입이 서로 short, int로 서로 다른데 연산이 가능한 이유는 정리.txt에 적어둔 대로 저장공간의 크기가 작은 short 타입을 int 타입으로 변경했기에 그렇다
        int z = x + y;
        System.out.println(z);

        System.out.println("----int형을 long으로----");
        long lx = 30L;
        // 여기서도 z는 int타입의 변수이고 lx는 long 타입의 변수이지만 연산 가능의 이유는 상기한 바와 같이 int를 long 형으로 바꾸었기 떄문이다.
        long lz = z + lx;
        System.out.println(lz);

        System.out.println("----long형을 float으로----");
        float fx = x; // short 형인 x를 float 형인 fx로 변환
        float fy = y; // int 형인 y를 float 형인 fy로 변환
        float fz = lz; // long 형인 lz를 float 형인 fz로 변환
        System.out.println(fx);
        System.out.println(fy);
        System.out.println(fz);


    }
}
