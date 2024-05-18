package NBCamp.BasicClass.lotto;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class lottomain {
    public static void main(String[] args) {
        // 중복이 되지 않는 집합을 선택 !!set!!
        Set<Integer> onlyMyCode = new HashSet<>();
        // while 문을 사용해서 onlyMyCode 의 크기를 6미만으로 설정!
        while (onlyMyCode.size() < 6) {
            // 튜터님께서 알려주신 랜덤 객체 생성
            Random random = new Random();
            // +1 을 하지 않고 45까지만 할 경우 0부터 44까지 가 범위가 됨으로 +1을 하여 1~45로 범위 설정
            // 후 값을 int 타입의 randomNum 변수에 저장
            int randomNum = random.nextInt(45) + 1;
            // 컬렉션 onlyMyCode 에 숫자 randomNum 하나를 추가.
            onlyMyCode.add(randomNum);
            // 이후 while 문의 조건을 설정한 대로 반복하며 중복되지 않는 숫자 onlyMyCode 에 저장.
        }
        // 저장된 모든 onlyMyCode의 값을 출력, 6개만 저장되어 있고 set 컬랙션 타입이기에 중복값이 없다!!
        System.out.println("당첨 번호 출력 : " + onlyMyCode);
    }
}
