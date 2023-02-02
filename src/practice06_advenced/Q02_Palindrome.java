package practice06_advenced;

import java.util.Scanner;

public class Q02_Palindrome {

    //Bir String değerin Palindrome olup olmadığını kontrol eden bir kod yazınız.
    // palindrome tersten yazilisi ile normal yazilisinin ayni olup olmadigini kontrol
    // ediyorduk
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("lutfen bir String deger giriniz");

        String str = input.nextLine().replaceAll(" ", "").toLowerCase();
        String strReverse = "";

        for(int i = str.length()-1; i>-1; i--){

            strReverse += str.charAt(i);// son indeksi almak icin charAt()'in icine "i" yazdi

        }
        System.out.println(strReverse);

        if(str.equals(strReverse)){
            System.out.println("palindrome");
        }else{
            System.out.println("palindrome degildir");
        }

        String a = "Ali";
        a.toLowerCase();//burda ki degisiklik esas String'i degistirmez bize yeni String veiri
        // buna da "Immutuble" deger denir
        System.out.println(a);// bu yine bize "Ali" verir


    }

}
