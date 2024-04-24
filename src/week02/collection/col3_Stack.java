package week02.collection;

import java.util.Stack;

public class col3_Stack {
    // Stack
    // 수직으로 값을 쌓아놓고, 넣었다가 뺀다. First In Last Out (FILO)
    // 선입 후출, 통안에 담아주고 먼저 들어간건 아래 깔리고 나중에 들어간것을 먼저 꺼내 쓴다
    // push(값집어넣기), peek(값하나만뽑기), pop
    // 최근 저장된 데이터를 나열하고 싶거나 데이터의 중복 처리를 막고 싶을 때 사용

    public static void main(String[] args) {
        Stack<Integer> intStack = new Stack<Integer>();

        intStack.push(10);
        intStack.push(15);
        intStack.push(1);

        // 다 지워질 때까지 출력
        while(!intStack.isEmpty()) { // 이 while 문은 !가 없을 경우 다 비워져 있어야만 트루를 반환한다. 하지만 부정인 !를 붙여서 반대로 다 비워져 있어야 false 반환되게 설정
            System.out.println(intStack.pop());
        }
        System.out.println("-----peek----");
        intStack.push(10);
        intStack.push(15);
        intStack.push(1);


        //peek 가장 마지막에 들어간 친구를 뽑아서 보여줌
        System.out.println(intStack.peek());
        System.out.println(intStack.size()); // size는 총 크기를 알려준다
    }

}
