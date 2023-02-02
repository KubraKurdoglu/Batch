package practice06_advenced;

import java.util.Scanner;

public class Q01_Ascii_Karakterler {

    //Kullanıcıdan aldığınız iki karakterin arasında bulunan tüm karakterleri yazdıran bir kod yazınız.


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Ilk karakterleri giriniz");

        char ch1 = input.next().charAt(0);

        System.out.println("Ikinci Karakteri Giriniz");

        char ch2 = input.next().charAt(0);

        // asagida verilen ilk sayinin ikinci sayidan kucuk olmasi durumuna karsi
        // mat klasorune gitti ve kucukten buyuge siraladi

        int ilk = Math.min(ch1, ch2);
        int ikinci = Math.max(ch1, ch2);

        System.out.println((char) ilk);//hangisi kucukse onu yazdiracak burda


        for (int i = ilk + 1; i < ikinci; i++) {// arasindakileri istedigi icin baslangic ve son degerleri almadi

            System.out.print((char) i + " ");

        }

    }

}