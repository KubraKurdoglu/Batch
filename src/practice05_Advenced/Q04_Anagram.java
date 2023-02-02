package practice05_Advenced;

import java.util.Arrays;
import java.util.Scanner;

public class Q04_Anagram {
    /*
       İki kelimenin "Anagram" olup olmadığını kontrol eden bir method oluşturunuz.
       - Anagram, başka bir kelimenin karakterlerinden yeni bir kelime oluşturmaktır. -
       Örn:
       * bahriyeli <> harbiyeli.
       * sızlanma <> anlamsız.
       * asya <> yasa.
       * Bursa Dağı <> su bardağı
       * kan ara <> Ankara.
       */
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen bir Strin deger giriniz");
        String str1 = scan.nextLine();
        System.out.println("lutfen karsilastirmak icin ikinci bir String giriniz");
        String str2 = scan.nextLine();


        anagram(str1, str2);
        // methodun icinde "sout" var o nedenle otomatik yaziyor ekrana


        anagram("kan ara", "ankara");
        anagram("sizlanma" , "anlamsiz");
        anagram("bahriyeli", "harbiyeli");
        anagram("bahriyeli", "su bardaki");

    }


    public static void anagram(String str1, String str2){

       String[] arr1 =  str1.toLowerCase().replaceAll(" ", "").split("");
       String [] arr2=str2.toLowerCase().replaceAll(" ", "").split("");

        Arrays.sort(arr1);
        Arrays.sort(arr2);// " natrual order'a gore siralama yapacak

        if (Arrays.equals(arr1, arr2)) {

            System.out.println("Anagram");
        }else{
            System.out.println("Anagram Degil");
        }


    }

}
