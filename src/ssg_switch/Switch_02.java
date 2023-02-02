package ssg_switch;

import java.util.Scanner;

public class Switch_02 {
    public static void main(String[] args) {



        /*Switch icine Strin; int; char; byte kullanlabiliriz
        fakat long, boolean, float kullanamayiz
         */


        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen ayin sayisini giriniz");
        int aySayisi=scan.nextInt();


        switch (aySayisi){
            case 1:
                System.out.println("janvier");
                break;
            case 2:
                System.out.println("fevrier");
                break;
            case 3:
                System.out.println("march");
                break;
            case 4:
                System.out.println("avril");
                break;
            case 5:
                System.out.println("mai");
                break;
            case 6:
                System.out.println("juin");
                break;
            case 7:
                System.out.println("juillet");
                break;
            case 8:
                System.out.println("aout");
                break;
            case 9:
                System.out.println("septembre");
                break;
            case 10:
                System.out.println("octobre");
                break;
            case 11:
                System.out.println("novembre");
                break;
            case 12:
                System.out.println("decembre");
                break;
            default:
                System.out.println("lutfen gecerli bir ay giriniz");


        }



    }
}
