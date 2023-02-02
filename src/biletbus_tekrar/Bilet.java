package biletbus_tekrar;

import java.util.Scanner;

public class Bilet {

    int km = 0;
    int yas = 0;
    String yolculukTipi = "";
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Lutfen gideceginiz mesafeyi giriniz");
        int km = scanner.nextInt();

        System.out.println("Lutfen yasinizi giriniz");
        int yas = scanner.nextInt();

        System.out.println("Lutfen yolculuk tipini giriniz \n  Tek yon icin 1" +
                "\n Gidis-Donus icin 2");
        int yolculukTipi = scanner.nextInt();

        if (yas>0 && km>0 && (yolculukTipi==1 || yolculukTipi==2)){
            double biletFiyati =km*0.1;
            double yasIndirimOrani = 0;
            if (yolculukTipi==2){
                double biletUcreti = (km*0.1*2)-biletFiyati;
            }


        } else if (yas>12) {



        }


    }


}
