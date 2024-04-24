package week02.collection;

import java.util.HashSet;
import java.util.Set;

public class col5_set {
    public static void main(String[] args) {
        // Set은 집합과 닮아 있음 순서 없고, 중복 없음!!
        // 순서가 보장되지 않는 대신 중복을 허용하지 않도록 하는 프로그램에서 사용할 수 있는 자료구조
        // Set -> 그냥 쓸 수도 있음. 그러나, HashSet, TreeSet 등으로 응용해서 같이 사용 가능
        // Set은 생성자가 없는 껍데기라서 바로 생성할 수 없음!!!
        // 생성자가 존재하는 HashSet을 이용해서 -> Set을 구현해 볼 수 있다.

        Set<Integer> iS = new HashSet<>();

        iS.add(1);
        iS.add(12);
        iS.add(5);
        iS.add(9);
        iS.add(1);
        iS.add(12);

        for (Integer i : iS) {
            System.out.println(i);
        }

        // contains 포함 하느냐 를 나타내는 메소드
        System.out.println(iS.contains(2));// 포함 하고 있는지를 물어보기 때문에 예 아니오 인 true or false 로만 대답한다
        System.out.println(iS.contains(5));

    }
}
