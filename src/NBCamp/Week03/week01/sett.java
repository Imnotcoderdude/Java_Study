package NBCamp.Week03.week01;

import java.util.Scanner;

public class sett {
    public static void main(String[] args) {

        Scanner cook = new Scanner(System.in);

        String title = cook.nextLine();

        double star = cook.nextDouble();
        cook.nextLine();

        String text1 = cook.nextLine();
        String text2 = cook.nextLine();
        String text3 = cook.nextLine();
        String text4 = cook.nextLine();
        String text5 = cook.nextLine();
        String text6= cook.nextLine();
        String text7 = cook.nextLine();
        String text8 = cook.nextLine();
        String text9 = cook.nextLine();
        String text10 = cook.nextLine();


        System.out.println("[" + title + "]");

        int intStar = (int)star;


        double perStar = intStar / 5.0 *100;

        System.out.println("별점 : "+intStar+"("+perStar+")");

        System.out.println("1." + text1);
        System.out.println("2." + text2);
        System.out.println("3." + text3);
        System.out.println("4." + text4);
        System.out.println("5." + text5);
        System.out.println("6." + text6);
        System.out.println("7." + text7);
        System.out.println("8." + text8);
        System.out.println("9." + text9);
        System.out.println("10." + text10);


    }
}