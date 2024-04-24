package week02.Array;

public class Array03 {
    public static void main(String[] args) {
        //얕은 복사
        int[] a = {1,2,3,4};
        int[] b = a;

        b[0] = 3; // b 배열의 0번째 순번 값을 3으로 수정했다 즉 위에 선언한 것처럼 b배열 = a배열 이기때문에 b[1,2,3,4} 에서 1 의 값이 3으로 바뀌어 b[3,2,3,4] 가 된 것이다.

        System.out.println(a[0]); // 하지만 a배열의 0 번째 값을 조회했을때 b배열을 바꾼 것 처럼 3으로 조회된다.
                                  // 이 말은 즉 b배열을 a배열과 동일값으로 복사 하였는데 a배열의 값을 저장하는 heap 부분에 b배열이 동시에 복사가 되면서
                                  // 같은 공간을 공유하게 되고 그로 인해 b배열의 순번값을 바꿨을떄 a배열에도 영향이 간다는 문제이다.

        System.out.println("-------------");

        // for문을 활용한 깊은 복사의 방법
        int[] c = {1,2,3,4};
        int[] d = new int[c.length]; // d배열의 순번값을 전부 0으로 초기화

        for (int i = 0; i < c.length; i++) { // 이후 c 배열의 순번값을 하나 하나씩 불러내서 d배열의 순번값에 각각 대입하여 저장.
            d[i] = c[i]; // 이것이 깊은 복사
        }
        System.out.println(b[0]);
        System.out.println(b[1]);
        System.out.println(b[2]);
        System.out.println(b[3]);
        System.out.println("--------------");

        d[0] = 3; // d열의 0번째 순번값을 3으로 수정
        System.out.println(d[0]); // 바뀐 값은 정확히 출력됨
        System.out.println(d[1]);
        System.out.println(d[2]);
        System.out.println(d[3]);

        System.out.println("--------------");

        System.out.println(c[0]);// c배열의 값에도 변화가 없음
        System.out.println(c[1]);
        System.out.println(c[2]);
        System.out.println(c[3]);

        // 위에 서술한 for문 깊은복사는 너무 길다. 쉬운 것을 알아보자
        // 깊은 복사 메서드 라는 것이 존재한다
        System.out.println("--------------");
        // 1. clone() 메서드
        int[] e = {1,2,3,4};
        int[] f = e.clone(); //가장 간단한 방법이다 이렇게 하면 for 문을 사용할 필요 없이 배열을 그대로 가져다 쓸 수 있다.
        //하지만 클론 메서드는 2차원 이상의 배열에서는 얕은복사를 지원하기에 조심해야 한다.
        System.out.println(f[0]);// 1234로 순번값이 정해진 e 배열의 모든 순번값이 그대로 복사되었다
        System.out.println(f[1]);
        System.out.println(f[2]);
        System.out.println(f[3]);


    }
}
