package ssg_whileloopdowhileloop;

import java.util.Scanner;

public class Whileloop_0Abastigindatopla {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int sayi=1;
        int toplam= 0;
        int sayac =0;

        do {
            System.out.println("lutfen toplamak icin sayi  giriniz");
            sayi=scan.nextInt();
            toplam += sayi;
            sayac++;

        }while(sayi!=0);
        System.out.println("Girdiginiz sayilarin toplami ="+ toplam+ " ve "  + sayac +" kere sayi girdiniz.");





    }
}
