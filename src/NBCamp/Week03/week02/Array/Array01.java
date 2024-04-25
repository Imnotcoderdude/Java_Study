package NBCamp.Week03.week02.Array;

public class Array01 {
    public static void main(String[] args) {
        //배열 생성
        int[] intArray = new int[3]; // {0, 0, 0} 왼쪽 0부터 순서대로 0번째 1번째 2번째 ..... 이순서이다 아래도 동일함
        boolean[] boolArray = new boolean[3]; // {false, false, false}
        String[] strArray = new String[3]; // {"", "", ""} -> ""안은 아무것도 없다는 뜻에 null 이다.

        // 배열 선언 먼저 하고 나중에 초기화 하는 방법
        int[] intArray2;
        intArray2 = new int[3]; // {0, 0, 0}

        //생성한 배열을 순회 한다는 말은 배열의 값을 하나씩 뽑아서 조회한다는 말이다.
        //(1) 단건 조회 방법
        System.out.println(intArray[2]); // 3번째에 있는 0값에 접근하고 싶으면 3이 아닌 0,1,2 순서이므로 2를 입력해야 3번재 0 값에 접근할 수 있다.
        System.out.println("------------------");

        //(2) 다건 조회 <<-- 굉장히 중요함
        // 밑에 intArray2.length 이 문장은 intArray2의 배열의 크기를 입력한 것이다. 즉 위에서 intArray2는 [3]의 크기를 갖도록 했으니 intArray.length = 3 이다
        for (int i = 0; i < intArray2.length; i++) {
            System.out.println(intArray2[i]);
        }
    }
}
