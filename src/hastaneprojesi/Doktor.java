package hastaneprojesi;

import java.util.HashMap;
import java.util.Scanner;

public class Doktor extends VeriBankasi{

    private String isim;
    private String soyIsim;
    private String unvan;



    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public String getSoyIsim() {
        return soyIsim;
    }

    public void setSoyIsim(String soyIsim) {
        this.soyIsim = soyIsim;
    }

    public String getUnvan() {
        return unvan;
    }

    public void setUnvan(String unvan) {
        this.unvan = unvan;
    }




    public static void randevuAlma(){
        Scanner input = new Scanner(System.in);
        int aylar =0;
        slowPrint("=======Randevu Servisindesiniz=====\n Lutfen randevu almak istediginiz ay numarasini  giriniz",50);
        aylar = input.nextInt();
        switch (aylar){

            case 1:
                slowPrint("Ocak ayi randevusu icin, gun secim kismina yonlendiriliyorsunuz.",40);
                break;
            case 2:
               slowPrint("Subat ayi randevusu icin, gun secim kismina yonlendiriliyorsunuz.",40);
                break;
            case 3:
                slowPrint("Mart ayi randevusu icin, gun secim kismina yonlendiriliyorsunuz.",40);
                break;
            case 4:
                slowPrint("Nisan ayi randevusu icin,  gun secim kismina yonlendiriliyorsunuz.",40);
                break;
            case 5:
               slowPrint("Mayis ayi randevusu icin, gun secim kismina yonlendiriliyorsunuz.",40);
                break;
            case 6 :
                slowPrint("Haziran ayi randevusu icin, gun secim kismina yonlendiriliyorsunuz.",40);
                break;
            case 7:
               slowPrint("Temmuz ayi randevusu icin,  gun secim kismina yonlendiriliyorsunuz.",40);
                break;
            case 8:
                slowPrint("Agustos ayi randevusu icin, gunsecim kismina yonlendiriliyorsunuz.",40);
                break;
            case 9:
                System.out.println("eylul ayi randevusu icin,gun secim kismina yonlendiriliyorsunuz.");
                break;
            case 10:
                System.out.println("Ekim ayi randevusu icin, gun secim kismina yonlendiriliyorsunuz.");
                break;
            case 11:
                System.out.println("Kasim ayi randevusu icin, gun secim kismina yonlendiriliyorsunuz.");

                break;
            case 12:
                System.out.println("Kasim ayi randevusu icin, gun secim kismina yonlendiriliyorsunuz.");
                break;
            default:
                System.out.println("Lutfen gecerli bir deger giriniz");
        }


        System.out.println("Lutfen randevu istediginiz gunu giriniz...");

        String gunler = input.next();
        String saatler = "";

        switch (gunler.toLowerCase()) {

            case "pazartesi":
                System.out.println("09.00 - 09.30 - 10.00 - 10.30 - 11.00 - 11.30 - 12.00 - 14.00 - 14.30-15.00 -15.30 - 16.00 - 16.30-17.00");
                System.out.println("Lutfen istediginiz saati giriniz...");
                saatler = input.next();
                break;
            case "sali":
                System.out.println("09.00 - 09.30 - 10.00 - 10.30 - 11.00 - 11.30 - 12.00 - 14.00 - 14.30-15.00 -15.30 - 16.00 - 16.30-17.00");
                System.out.println("Lutfen istediginiz saati giriniz...");
                saatler = input.next();
                break;
            case "carsamba":
                System.out.println("09.00 - 09.30 - 10.00 - 10.30 - 11.00 - 11.30 - 12.00 - 14.00 - 14.30-15.00 -15.30 - 16.00 - 16.30-17.00");
                System.out.println("Lutfen istediginiz saati giriniz...");
                saatler = input.next();
                break;
            case "persembe":
                System.out.println("09.00 - 09.30 - 10.00 - 10.30 - 11.00 - 11.30 - 12.00 - 14.00 - 14.30-15.00 -15.30 - 16.00 - 16.30-17.00");
                System.out.println("Lutfen istediginiz saati giriniz...");
                saatler = input.next();
                break;
            case "cuma":
                System.out.println("09.00 - 09.30 - 10.00 - 10.30 - 11.00 - 11.30 - 12.00 - 14.00 - 14.30-15.00 -15.30 - 16.00 - 16.30-17.00");
                System.out.println("Lutfen istediginiz saati giriniz...");
                saatler = input.next();
                break;

            default:
                System.out.println("Lutfen gecerli gun ismi giriniz");
        }
        slowPrint("***** RANDEVU BILGILERINIZ *****\n " + "\nRandevu Ayiniz = "+ aylar+
                "\nRandevu gununuz = " + gunler + "\n Randevu saatiniz = " + saatler +
                "\n Randevunuz basariyla kaydedilmistir" +"\n****IYI GUNLER DILERIZ****", 40 );

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
