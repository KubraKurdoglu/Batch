package ssg_whileloopdowhileloop;

import java.util.Random;
import java.util.Scanner;

public class Tahmin_SayiBulma {
    public static void main(String[] args) {

        // bilgisayara 1 ile 100 arasinda bir sayi tutturun
        // kullanicidan bu sayiyi tahmin etmesini isteyin
        // girilen her tahminde sayiyi buyut veya kucult diye kullaniciya yol gosterin
        // kullanici sayiyi buldugunda kac tahminde sayiyi buldugunu kullaniciya yazdirin

       // sayac'i bir den baslatti
        // cunku 0'dan baslarsa ilk tahmin yaptiginda ve ilk tahminde dogru cevabi bulursan
        // 0. tahminde buldunuz yazar dogru olmaz
        //o nedenle 1'den baslatmak lazim


        Random rdn = new Random();


        Scanner input = new Scanner(System.in);
        System.out.println("lutfen bir sayi giriniz..");

        int sayi = rdn.nextInt(100);// 0'dan basla 100'e kadar siyilari rastgele al
        int tahmin=0;
        int sayac=1;

        while (sayi!=tahmin){

            tahmin=input.nextInt();

            if(tahmin<sayi){
                System.out.println("daha buyuk bir sayi giriniz");
            }else if (tahmin>sayi){
                System.out.println("lutfen daha kucuk bir sayi giriniz..");
            }
            sayac++;
        }

        System.out.println(sayac + ". ci sayida, tahmin  ettiniz");




    }
}
