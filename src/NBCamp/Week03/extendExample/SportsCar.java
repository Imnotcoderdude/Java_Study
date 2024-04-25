package NBCamp.Week03.extendExample;
//자식 클래스 extend + Car로 부모클래스를 상속받음
public class SportsCar extends Car{
    String engine;
    public void booster() {
        System.out.println("엔진 " + engine + " 부앙~\n");
    }
}