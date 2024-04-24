package week02.collection;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Objects;

public class 과제길들이기 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String titleName = sc.nextLine();
        String cookName = sc.nextLine();

        switch (titleName) {
            case "List":
                ArrayList<String> ls = new ArrayList<>();
                while (true) {
                    String text = sc.nextLine();
                    if (Objects.equals(text, "끝")) {
                        break;
                    }
                    ls.add(text);
                }
                titleName = "[ List 로 저장됨 " + cookName + "]";
                System.out.println(titleName);
                for (int i = 1; i < ls.size(); i++) {
                    int number =  i; // i 가 0번째 부터 시작하기에 + 1 을 한다고 하는데 그럼 그냥 위에서 i = 1로 하면 되지 않는가?
                    System.out.println(i + ". " + ls.get(i)); // 라인안에 넣는다. 즉 인라인 작업이 가능할 정도로 짧음.
                }
                break;
            default:
                System.out.println("저장할 수 없는 자료 구조입니다.");
        }
    }
}