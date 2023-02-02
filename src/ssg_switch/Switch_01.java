package ssg_switch;

import java.util.Scanner;

public class Switch_01 {
    public static void main(String[] args) {



        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen ayin adi giriniz");
       String mevsim=scan.next();


        switch (mevsim){
            case "ocak", "subat", "aralik", "kasim":
                System.out.println("kis");

                break;
            case "mart", "nisan", "mayis", "":
                System.out.println("ilkbahar");

                break;
            case "temmuz", "agustos":
                System.out.println("yaz");
                break;
            case "eylul", "ekim":

                System.out.println("sonbahar");

                break;
            default:
                System.out.println("gecerli bir ad giriniz");
        }

    }
}
