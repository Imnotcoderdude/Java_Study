package Week03.hasExample;

public class Door {
    String company; // 차문 회사
    String location; // 차문 위치, FL, FR, BL, BR

    public Door(String company, String location) {
        this.company = company;
        this.location = location; // 쉽게 말해 이름이 중복되면 꼬이기 쉽기 때문에 this를 사용한다
    }
}
