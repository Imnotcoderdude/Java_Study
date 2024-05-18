package NBCamp.BasicClass.lotto;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Lotto {
    // 1~45 까지 숫자를 사용해서 로또 추첨기 만들기!!
    // 1~45까지의 숫자를 가지고 있는 리스트 제작.
    private static final List<Integer> numbers = new ArrayList<>();
    // for 문으로 정적 리스트 안에 1~45까지 때려박기
    // 모든 인덱스는 1~45까지 순차적으로 증가하는 수를 가지고 있기에 중복값이 없음.
    static {
        for (int i = 1; i <= 45; i++) {
            numbers.add(i);
        }
    }
    // 리스트에 있는 번호 섞어서 추첨하는 메서드
    private static List<Integer> lottoNumbers() {
        // 리스트를 섞어서 랜덤하게 만들어 주는 함수 사용. 찾느라 오래걸렸어요...
        Collections.shuffle(numbers);

        // 랜덤하게 섞인 리스트의 인덱스 0번째 부터 6개를 뽑아서 selectedNumbers 여따가 저장.
        List<Integer> selectedNumbers = numbers.subList(0, 6);

        // 추출한 인덱스값을 저장하고 있는 selectedNumbers 반환
        return selectedNumbers;
    }

    public static void main(String[] args) {
        // 섞은 숫자 가지고 있는 메서드 가져오기
        List<Integer> wowImJackpot= lottoNumbers();

        // 당첨번호 추첨하기!
        System.out.println("당첨번호는 ~ : " + wowImJackpot);
    }

}
