package ssg_whileloopdowhileloop;

import java.util.Scanner;

public class AradakiSayilariYazdirma {
    public static void main(String[] args) {

        // kullanicidan iki tamsayi alip
        // bu sayilari ve aralarindaki tum tamsayilari yazdiran bir kod olusturun


        //do while loop

       /* int baslangic=40;
        int bitis=50;

        do{
            System.out.println(baslangic + " ");
            baslangic++;
        }while (bitis>=baslangic);


        */


        // asagidaki islemleri kendim yapmaya calistim


        Scanner input = new Scanner(System.in);
        /*
        System.out.println(" lutfen  birinci  sayiyi  griniz..");

        int sayi1 = input.nextInt();

        System.out.println("lutfen ikinci sayiyi giriniz..");
        int sayi2 = input.nextInt();




        int k=sayi1;

        while (k<=sayi2){
            System.out.print(k + " ");
            k++;
        }





        while (sayi2>=sayi1){
            System.out.print(sayi2 + " ");

            sayi2--;
        }


         */

        // do while ile

        System.out.println(" lutfen  birinci  sayiyi  griniz..");
        int sayi3 = input.nextInt();

        System.out.println("lutfen ikinci sayiyi giriniz..");
        int sayi4 = input.nextInt();



        int l = sayi3;

        do {
            System.out.print(l + " ");
            l++;
        }while (l<=sayi4);

    }
}
