package weeko1;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Map;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.HashMap;
import java.util.Iterator;

public class _2주차과제 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String collectionName = sc.nextLine();
        String cookName = sc.nextLine();

        switch (collectionName) {
            case "List":
                ArrayList<String> ls = new ArrayList<>();
                while (true) {
                    String text = sc.nextLine();
                    if (Objects.equals(text, "끝")) {
                        break;
                    }
                    ls.add(text);
                }
                collectionName = "[ List 로 저장됨 " + cookName + "]";
                System.out.println(collectionName);
                for (int i = 0; i < ls.size(); i++) {
                    int number = i + 1; // i 가 0번째 부터 시작하기에 + 1 을 한다고 하는데 그럼 그냥 위에서 i = 1로 하면 되지 않는가?
                                        // 그렇게 처리한다면 밑에 ls.get(i) 부분에 i가 배열의 0번째가 아닌 1번째 부터 끌어오기 때문에 그렇게 하면 0번째 값이 출력되지 않는다.
                    System.out.println(number + ". " + ls.get(i));
                }
                break;
            case "Map":
                Map<Integer, String> sM = new HashMap<>();
                int lineNumber = 1;

                while (true) {
                    String text = sc.nextLine();
                    if (Objects.equals(text, "끝")) { // 따로 빼 내는 메소드로,
                        break;
                    }
//                    sM.put(lineNumber++,  text);
                    sM.put(lineNumber,  text);
                    lineNumber = lineNumber + 1;
                }
                collectionName = "[ weeko1.map 로 저장된 " + cookName + "]";
                System.out.println(collectionName);

                for (int i = 0; i < sM.size(); i++) {
                    int number = i + 1;
                    System.out.println(number + ". " + sM.get(i + 1)); // 위에 Key인 lineNumber을 1부터 저장했기 때문에 1부터 시작.
                }
                break;
            case "Set":
                LinkedHashSet<String> strSet = new LinkedHashSet<>();
                while (true) {
                    String text = sc.nextLine();
                    if (Objects.equals(text, "끝")) {
                        break;
                    }
                    strSet.add(text);
                }
                collectionName = "[ Set 로 저장됨 " + cookName + "]";
                System.out.println(collectionName);

                Iterator it = strSet.iterator();

                for (int i = 0; i < strSet.size(); i++) {
                    int number = i + 1;
                    System.out.println(number + ". " + it.next());
                }
                break;
            default:
                System.out.println("저장할 수 없는 자료 구조입니다.");
        }
    }
}
