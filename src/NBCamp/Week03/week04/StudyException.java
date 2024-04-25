package NBCamp.Week03.week04;

public class StudyException {
    public static void main(String[] args) {
        OurClass ourClass = new OurClass();

        // try ~ catch ~ finally 구문
        // try : 시도하다
        // catch : 잡다(붙잡다)
        // finally : 마침내

        //일단 Try 해 그리고 에외가 발생하면 그걸 잡아!! (catch
        // 그리고, 정상적으로 수행 되든, 에외가 발생하든 결국, 마침내 수행돼야 하는 로직을 'finally' 수행해!!
        try  {
            ourClass.thisMethodIsDangerous();
        } catch (OurBadException e) {
            System.out.println(e.getMessage());
        } finally {
            // 어떻게 되든 무조건 이 파이널리는 거치게 되어있음
            System.out.println("우리는 방금 예외를 Handling 했습니다! 정상처리가 되든 예외가 발생하든 여기는 거쳐요!");
        }


    }
}
