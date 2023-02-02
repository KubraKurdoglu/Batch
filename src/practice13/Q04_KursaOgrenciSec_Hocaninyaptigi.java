package practice13;

import java.util.Arrays;
import java.util.Scanner;

public class Q04_KursaOgrenciSec_Hocaninyaptigi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ogrenci sayisini giriniz");
        int ogrenciSayisi = scanner.nextInt();
        String[] isimArr = new String[ogrenciSayisi];
        String[] cinsiyetArr = new String[ogrenciSayisi];
        double[] kiloArr = new double[ogrenciSayisi];
        double[] boyArr = new double[ogrenciSayisi];

        for (int i = 0; i < ogrenciSayisi; i++) {
            scanner.nextLine();//dummy
            System.out.println(i + 1 + ". ismi giriniz:");
            isimArr[i] = scanner.nextLine();
            System.out.println("Cinsiyeti giriniz(E, K):");
            String cinsiyet = scanner.next().toLowerCase().trim().substring(0, 1);
            if (cinsiyet.equals("e") || cinsiyet.equals("k")) {
                cinsiyetArr[i] = cinsiyet;
            } else {
                System.out.println("Hatali giris!!! Yeniden Giriniz..");
                i--;
                continue;
            }

            System.out.println("Kilo giriniz(KG):");
            kiloArr[i] = scanner.nextDouble();
            System.out.println("Boy giriniz(M):");
            boyArr[i] = scanner.nextDouble();

        }

        System.out.println(Arrays.toString(isimArr));
        System.out.println(Arrays.toString(cinsiyetArr));
        System.out.println(Arrays.toString(kiloArr));
        System.out.println(Arrays.toString(boyArr));


        int sayac = 0;
        System.out.println("Kursa Secilen Ogrenciler:");
        for (int i = 0; i < ogrenciSayisi; i++) {
            if (cinsiyetArr[i].equals("k") && kiloArr[i] >= 50 && kiloArr[i] <= 70 && boyArr[i] >= 1.5) {
                System.out.println(isimArr[i]);
                sayac++;
            } else if (cinsiyetArr[i].equals("e") && kiloArr[i] >= 70 && kiloArr[i] <= 90 && boyArr[i] >= 1.6) {
                System.out.println(isimArr[i]);
                sayac++;
            }
        }

        if (sayac == 0) {
            System.out.println("Kursa secilen ogrenci yoktur!!!");
        }
    }
}
