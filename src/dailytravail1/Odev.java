package dailytravail1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Odev {
    public static void main(String[] args) {


        /* TASK :
         * Bir bakkalın 7 günlük tüm kazançlarını günlük olarak gösteren bir program yazınız.
         * Ayrıca bakkalın bu hafta ortalama kazandığı miktarı gösteren bir method yazınız.
         * Ayrıca bakkalın hangi günler ortalamanın üstüne kazandığını gösteren bir method yazınız.
         * Ayrıca bakkalın hangi günler ortalamanın altında kazandığını gösteren bir method yazınız.
         *
         * 1. Adım : Günleri içeren bir tane ArrayList oluşturun. (gunler)
         * 2. Adım : Günlük kazançları ekleyeceğimiz bir tane ArrayList oluşturun. (gunlukKazanclar)
         * 3. Adım : While döngüsü ile kullanıcıdan 7 günlük kazançları tekek teker alıp gunlukKazanclar ArrayList'e ekle.
         * 4. Adım : getOrtalamaKazanc() adlı method ile ortalama kazancı alın.
         * 5. Adım : getOrtalamaninUstundeKazancGünleri() adlı method oluşturun.
         *           for döngüsü ile tüm günleri ortalama kazanç ile karşılaştır
         *           ortalama kazançtan yüksekse o günleri return yap.
         * 6. Adım : getOrtalamaninAltindaKazancGünleri() adlı method oluşturun.
         *           for döngüsü ile tüm günleri ortalama kazanç ile karşılaştır
         *           ortalama kazançtan aşağıysa o günleri return yap.
         * */


        List<String> gunler = new ArrayList<>();

        gunler.add("Pazartesi");
        gunler.add("Sali");
        gunler.add("Carsmba");
        gunler.add("Persembe");
        gunler.add("Cuma");
        gunler.add("Cumartesi");
        gunler.add("Pazar");

        List<Double> gunlukKazanclar  = new ArrayList<>();
        Scanner input = new Scanner(System.in);




        int i = 0;

        while (i<gunler.size()){
            System.out.println("Lutfen Gunluk kazancinizi " + gunler.get(i)+ " gunu icin giriniz");

            double gunlukKazanc = input.nextDouble();
            gunlukKazanclar.add(gunlukKazanc);
            i++;

        }



        System.out.println("gunluk Kazanclar= " +gunlukKazanclar);


        getOrtalamaKazanc(gunlukKazanclar);


    }


    public static void getOrtalamaKazanc(List<Double> gunlukKazanclar){
        double ortalamaKazanc =0;
        double toplamKazanc=0;

        int idx = 0;
        for (double w: gunlukKazanclar) {
            toplamKazanc += gunlukKazanclar.get(idx);
            ortalamaKazanc=toplamKazanc/ gunlukKazanclar.size();

            idx++;
        }

        System.out.println(toplamKazanc);
        System.out.println("ortalamaKazanc= "+ortalamaKazanc);


        }



        //5. Adım : getOrtalamaninUstundeKazancGünleri() adlı method oluşturun.
    //         *           for döngüsü ile tüm günleri ortalama kazanç ile karşılaştır
    //         *           ortalama kazançtan yüksekse o günleri return yap.


    public static void  getOrtalamaninUstundeKazancGünleri( List<Double> gunler){
        for (int i=0; i< gunler.size(); i++){
            
        }

    }

    }

