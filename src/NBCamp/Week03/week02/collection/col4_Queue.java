package NBCamp.Week03.week02.collection;

import java.util.LinkedList;
import java.util.Queue;

public class col4_Queue {
    public static void main(String[] args) {
        // Queue : FIFO
        // add, oeek, poll
        // queue : 생성자가 없는 인터페이스
        System.out.println("-----poll-----");

        Queue<Integer> q = new LinkedList<Integer>(); // 큐는 생성자가 없기때문에 new 키워드로 만들 수 없음 그렇기에 LinkedList를 사용

        q.add(1);
        q.add(5);
        q.add(9);

        while(!q.isEmpty()) {
            System.out.println(q.poll());
        }
        System.out.println("-----peek-----");
        // 추가
        q.add(1);
        q.add(5);
        q.add(9);
        q.add(10);

        System.out.println(q.peek()); // 처음 들어온게 가장 처음 조회가 된다. 앞서 했던 스택과는 반대
        System.out.println("-----size-----");
        System.out.println(q.size()); //
    }
}
