package NBCamp.week04;

// 1. 제네릭은 클래스 또는 메서드에 사용이 가능하다
// <> 안에 들어가야 할 타입을 명시한다.
public class Generic<T> { // 이 꺽쇠가 제네릭 문법이라고 할 수 있다!
    // 2. 내부 필드의 스트링
    private T t;
    // 3. 메서드의 리턴 타입도 스트링
    public T get() {
        return this.t;
    }

    public void set(T t) {
        this.t = t;
    }

    public static void main(String[] args) {
        // 4.
        Generic<String> stringGeneric = new Generic<>();// 이렇게 꺽쇠를 사용해서 타입을 부여한 후 객체를 생성하게 된다. 여기서 스트링 타입으로 전부 바꾸었기 때문에 위에 T들도 스트링으로 변경
        // 5.
        stringGeneric.set("Hello World");

        String tValueTurnOutWithString = stringGeneric.get();

        System.out.println(tValueTurnOutWithString);
    }
}
