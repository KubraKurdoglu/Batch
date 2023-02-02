package biletbus;

import java.util.Scanner;

public class Bilet {
    static Scanner input = new Scanner(System.in);


    public static void main(String[] args) {

        String plakaNumarasi="34 NB 34";
        int km=0;
        int yas=0;
        int yolculukTipi =1;
        //yukardaki degerleri default aldik, cunku zaten i"inpu" a degistirecegiz.

        System.out.println("lutfen gideceginiz mesafeyi km olarak veriniz.");
        km= input.nextInt();

        System.out.println("lutfen yasinizi giriniz.");
        yas =input.nextInt();

        System.out.println("lutfen yolculuk tipinizi giriniz"+
                "Sadece gidis ise 1\n Gidis-Donus ise 2");
        yolculukTipi =input.nextInt();

        if(km>0 && yas >0 && (yolculukTipi==1|| yolculukTipi==2) ){

            double biletUcreti = km * 0.10;
            double yasIndirimOrani = 0;

            if (yas < 12) {
                yasIndirimOrani = 0.5;
            } else if (yas > 24) {
                yasIndirimOrani = 0.1;

            } else if (yas > 65) {
                yasIndirimOrani = 0.3;


            }
            double dusulecekDeger = 0;
            dusulecekDeger = biletUcreti * yasIndirimOrani;
            biletUcreti = biletUcreti - dusulecekDeger;
            //biletUcreti -= biletUcreti*yasIndirimOrani;==> bu daha profesyonel hali kodun

            if (yolculukTipi == 2) {
                biletUcreti -= biletUcreti * 0.20;
                biletUcreti *= 2; //2 ile carptik cunku gidis donus ucreti
            }


            biletDokum(plakaNumarasi, km, yolculukTipi, biletUcreti);
            System.out.println("BiletUcreti = " + biletUcreti);
        }else {
            System.err.println("Hatali Veri Giridniz");
        }





    }

    private static void biletDokum(String plakaNumarasi, int km, int yolculukTipi, double biletUcreti){

        System.out.println("===============Bilet Dokum==========");
        System.out.println("Otobsun Plakasi :"+plakaNumarasi);
        System.out.println("Mesafe "+km);
        System.out.println("Yolculuk Tipi "+ (yolculukTipi==1? "Tek Yon" : "Gidis Donus"));



        slowPrint("KEYIFLI YOLCULULAR DILERIZ", 50);
    }

    public static void slowPrint(String text, int delay) {
        for (char c : text.toCharArray()) {
            System.out.print(c);
            try {
                Thread.sleep(delay);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }


}
