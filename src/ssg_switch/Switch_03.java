package ssg_switch;

import java.util.Scanner;

public class Switch_03 {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen numaranizi giriniz");
        int numara=scan.nextInt();

        switch (numara){
            case 34:
            case 35:
            case 36:
                System.out.println("small");
                break;
            case 37:
            case 38:
            case 39:
                System.out.println("medium");
                break;
            case 40:
            case 41:
            case 42:
                System.out.println("large");
                break;
            case 43:
            case 44:
            case 45:
                System.out.println("extra large");
            case 60:
                System.out.println("unkwon");
                break;
            default:
                System.out.println("lutfen gecerli bir numara giriniz");
        }





    }
}
