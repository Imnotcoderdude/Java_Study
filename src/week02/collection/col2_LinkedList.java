package week02.collection;

import java.util.LinkedList;

public class col2_LinkedList {
    public static void main(String[] args) {
        // Linked List
        // 메모리에 남는 공간을 요청해서 여기저기 나누어서 실제 값을 담아놓는다.
        // 실제 값이 있는 주소값으로 목록을 구성하고 저장하는 자료구조.

        // 기본적인 기능은 -> ArrayList 와 동일함
        // LinkedList는 값 -> 여기저기 나누어서 : 조회하는 속도가 "느리다..."
        // 대신 값을 추가하거나, 삭제할 때는 빠르다.

        LinkedList<Integer> ll = new LinkedList<Integer>();

        ll.add(5); //0번째 항목
        ll.add(10); //1번째 항목
        ll.add(3); //2번째 항목

        System.out.println(ll.get(0));
        System.out.println(ll.get(1));
        System.out.println(ll.get(2));

        System.out.println(ll.toString()); // 이렇듯 조회할 때는 ArrayList 보다 속도가 현저히 느리다.

        ll.add(999);// 괄호안에 딱히 지정하는것 없이 숫자만 써있다면 마지막 인덱스 뒤에 생성됨 즉 뒤에서 하나 추가
        System.out.println(ll.toString());

        ll.add(2, 4); // 이렇게 직접 위치를 지정하면 2번째 인덱스의 엘리멘트를 4로 추가한다는 뜻.
        System.out.println(ll.toString());

        ll.set(1, 30); // set 을 사용하면 이 문장을 예로 들어 1번째 인덱스의 엘리멘트를 30으로 수정한다는 뜻 추가가 아님
        System.out.println(ll.toString());

        ll.remove(1); // remove를 사용하여 1번째 인덱스를 삭제함. 그러면 위에 수정했던 30이 삭제되고 출력
        System.out.println(ll.toString());

        ll.clear(); // 전부 삭제
        System.out.println(ll.toString());
    }
}
