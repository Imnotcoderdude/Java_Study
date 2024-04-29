package Other_Study.This_is_Java_my.메소드.오버로딩;

public class Calculator {
    //  정사각형의 넓이
    double areaReactangle(double width) {
        return width * width;
    }
    // 직사각형의 넓이. 위에 정사각형의 넓이 메소드와 동일하게 작성하였지만 매개변수란에 더블 높이를 추가하여 서로 오버로딩이 가능하게 함
    double areaReactangle(double width, double height) {
        return width * height;
    }
}
