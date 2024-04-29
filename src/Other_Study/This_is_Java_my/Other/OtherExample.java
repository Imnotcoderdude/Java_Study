package Other_Study.This_is_Java_my.Other;

public class OtherExample {
    public static void main(String[] args) {
        Other other1 = new Other("자가용");
        System.out.println("othe1.company : " + other1.company);
        System.out.println("othe1.model : " + other1.model);
        System.out.println("------------");

        Other other2 = new Other("자가용", "빨강");
        System.out.println("other2.company : " + other2.company);
        System.out.println("other2.model : " + other2.model);
        System.out.println("other2.color : " + other2.color);
        System.out.println("------------");

        Other ohter3 = new Other("자가용", "검정", 230);
        System.out.println("other3.company : " + ohter3.company);
        System.out.println("other3.model : " + ohter3.model);
        System.out.println("other3.color : " + ohter3.color);
        System.out.println("other3.maxSpeed : " + ohter3.maxSpeed);
        System.out.println("------------");
    }

}
