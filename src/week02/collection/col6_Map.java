package week02.collection;

import java.util.HashMap;
import java.util.Map;

public class col6_Map {
    public static void main(String[] args) {
        // Map 은 Key 와 value 의 pair 가 중요하다
        // Key 라는 값으로 유니크 하게 보장이 되어야 한다.
        // Map -> HashMap, TreeMap으로 응용한다.

        Map<String, Integer> iM = new HashMap<String, Integer>();

        //키값을 설정
        iM.put("일", 1);
        iM.put("이", 2);
        iM.put("삼", 3); // 중복 키
        iM.put("삼", 4); // 중복 키
        iM.put("삼", 5); // 중복 키

        //  Key 값 전체 출력하기, 향상된 for문을 활용하여
        for (String key : iM.keySet()) { // iM에서 키만 뽑아서 배열로 만드는 것이 keySet이다
            System.out.println(key); // 출력결과 이 일 삼 키만 출력됨 삼 키가 3개인데 생략하고 하나만 표시함
        }
        //value 값 전체 출력하기, 향상된 for문을 활용
        for (Integer vaule : iM.values()) { // String이 아니라 Integer을 사용하는 이유는 value 값은 문자가 아닌 숫자이기 때문이다.
            System.out.println(vaule); // Key의 이름을 출력하는 것이 아닌 각각의 키가 가지고 있는 value 를출력하기 위해 Integer 뒤에  value를 붙이고 value를 출력한다
                                       // value의 값은 가장 마지막에 추가된 중복키의 value 값으로 덮어 씌운다.
        }

        System.out.println(iM.get("삼"));
    }
}
