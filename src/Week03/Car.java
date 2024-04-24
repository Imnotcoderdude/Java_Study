package Week03;


// 우리가 클래스를 만들기 위해서는 4가지의 단계가 필요하다


// 1. 우리가 만들려고 하는 설계도를 선언한다. (클래스 선언)
// 2. 객체가 가지고 있어야 할 속성(필드)을 정의한다.
// 3. 객체를 생성하는 방식을 정의한다.(생성자)
// 4. 객체가 가지고 있어야 할 행위(메서드)를 정의한다

// 정리하자면 [ 클래스선언 -> 필드정의 -> 생성자정의 -> 메서드정의 ] 순서이다.

public class Car { // 이걸로 클래스 선언 완료

             // 필드 영역
    // 1) 고유 데이터 영역
   String company; // 자동차 회사

   String model = "Gv80"; // 자동차 모델

   String color; // 자동차 색상

   double price; // 자동차 가격

    // 2) 선택 데이터 영역
   double speed;  // 자동차 속도, km/h

   char gear; // 기어 상태 (P, R, N, D)

   boolean lights = true; // 자동차 조명의 상태

    // 객체 데이터 영역
    Tire tire = new Tire(); // 인스턴스화??

    Door door;

    Handle handle;

    //위에 쭉 적은것이 객체, 즉 자동차가 가지고 있어야 할 속성(필드)를 정의한 것이다.

                // 생성자 영역
    // 생성자 : 처음 객체가 생성될때 어떤 로직을 수행해야 하며, 어떤 값이 필수로 들어와야 하는지 정의!
    public Car() {
        // logic
        // 위에 public car는 기본 생성자이고 생략이 가능하다. 기본생성자 : 생략이 가능
        System.out.println("생성자가 호출되었습니다! 객체가 생성됩니다!");
    }

                // 메서드 영역
    // gasPedal
    // 들어가야 할 값 : input = kmh
    // 출력될 값 : output = speed
    double gasPedal(double kmh, char type) {
        changeGear(type); // 가속도 페달을 밟으면 자동으로 기어가 변한다.
        speed = kmh;
        return speed;

    }

    //brakePedal
    // input = 없음, 차가 멈추기 때문에 없음
    // out put = speed
    double brakePedal() {
        speed = 0;
        return speed;
    }

    //changeGear
    // input = P,R,N,D 한글자를 받아야 함으로 즉 char 타입으로 gear를 받아야 함
    // out put = 변경된 기어를 주면 됨
    char changeGear (char type) {
        gear = type;
        return gear;
    }

    // onOffLight
    // input = x
    // out put = 불이 켜져있는지 꺼져있는지 둘중 하나 true or false 로 boolean 타입으로 정의
    boolean onOffLight () {
        lights = !lights;
        return lights;
    }
    // horn
    // input = x 그저 누르기만 하기에 인풋이 없다.
    // out put = x 그저 소리만 나기에 아웃풋이 없다
    void horn () { // 인풋도 없고 아웃풋도 없기에 void 사용
        System.out.println("빵빵");
    }
    // 자동차의 속도.. 가변길이 메서드
    void carSpeeds(double ... speeds) {
        for (double v : speeds) {
            System.out.println("v = " + v);
        }
    }
 }
