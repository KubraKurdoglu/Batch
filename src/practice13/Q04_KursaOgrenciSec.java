package practice13;

import java.util.Arrays;
import java.util.Scanner;

public class Q04_KursaOgrenciSec {
    /*
 Spor kursu için seçilecek öğrencileri belirleyen bir kod yazınız.
       kurs gereklilikleri:
            erkekler: boy: 1.60 ve üstü
                      kilo:70-90 kg
            kızlar: boy: 1.50 ve üstü
                    kilo:50-70 kg
       kullanıcıdan öğrenci sayısı ve herbir öğrenci
       için isim , cinsiyet, kilo ve boy bilgilerini girmesini
       isteyiniz.
 */

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen gireceginiz ogrenci sayisini giriniz");
       int ogrenciSayisi =  scanner.nextInt();
       String[] isimArr = new String[ogrenciSayisi];
       String[] cinsiyetArr = new String[ogrenciSayisi];
       double[] kilo = new double[ogrenciSayisi];
       double[] boy = new double[ogrenciSayisi];


       for (int i=0; i<ogrenciSayisi; i++){
           scanner.nextLine();
           System.out.println(i +1 +". Ogrencinin adini giriniz");
           isimArr[i]=scanner.nextLine();
           System.out.println("cinsiyetinizi giriniz(E, K)");
           String cinsiyet = scanner.next().toLowerCase().trim().substring(0,1);
           if(cinsiyet.equals("e") || cinsiyet.equals("k")){
               cinsiyetArr[i]=cinsiyet;
           }else {
               System.out.println("Hatali giris yaptiniz!! yeniden giriniz..");
               i--;
               continue;//eger yanlis girildi ise basa don.
           }

           System.out.println("lutfen kilonuzu giriniz(KG)");
           kilo[i]=scanner.nextDouble();
           System.out.println("lutfen boyunuzu giriniz(M)");
           boy[i]=scanner.nextDouble();

       }
        System.out.println(Arrays.toString(isimArr));
        System.out.println(Arrays.toString(cinsiyetArr));
        System.out.println(Arrays.toString(kilo));
        System.out.println(Arrays.toString(boy));






    }





}
