package week02.collection;

import java.util.ArrayList; //ArrayList를 선언하면 이 문장이 생성

public class col1_ArrayList {
    public static void main(String[] args) {
        // List
        //순서가 있는데이터의 집합 => Array는 최초 길이를 알아야 초기화가 가능
        // 처음에 길이를 몰라도 만들 수 있음!
        // 1) Array -> 정적 배열
        // 2) List(ArrayList) -> 동적배열(크기가 가변적으로 늘어남)

        //선언하는 방법 ArrayList<> 를 만든 후 괄호 안에 int의 래퍼 클래스인 Integer이 들어감.
        // 이후 변수명을 선언하고 = new 왼쪽에 ArrayList<Integer>반복
        ArrayList<Integer> intList = new ArrayList<Integer>(); //선언과 생성을 동시에 한 부분

        intList.add(99);
        intList.add(15);
        intList.add(3);

        System.out.println(intList.get(1));

        // 2번째 있는 값 15를 20으로 변환
        intList.set(1, 20);
        System.out.println(intList.get(1));


        // 부분 삭제
        intList.remove(0);
        // 분명 0번째 값은 건들지 않았기에 99가 나와야 하지만 리무브로 0번째를 지워버렸기 때문에
        System.out.println(intList.get(0)); // 99가 삭제되고 뒤에있던 15가 앞으로 와서 0번째가 된다.
                                            // 여기서 20이 나오는 이유는 위에 로직에서 set으로 1번째 값을 20으로 바꾸었기에
                                            // 그것이 그대로 유지되어서 0번째로 온 것이다.
        System.out.println("클리어 전");
        System.out.println(intList.toString());

        intList.clear();
        System.out.println("클리어 후");
        System.out.println(intList.toString()); // toString은 int 안에 있는 값을 사람이 편하게 볼 수 있게 해주는 명령어

    }
}
