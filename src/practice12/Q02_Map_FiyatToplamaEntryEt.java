package practice12;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class Q02_Map_FiyatToplamaEntryEt {
    public static void main(String[] args) {

        /*
    Bir map içerisinde verilen fiyatların toplamını bulan bir kod yazınız.(for each loop kullanınız)
    Örn: {Kemer=19.99, Gömlek=29.99, Ayakkabı=89.99, Kazak=24.99, Kravat=19.99} ==> Toplam: 184.95
    */

        Map<String, Double> urunlerFiyatlar= new HashMap<>();

        urunlerFiyatlar.put("ayakkabi", 89.99);
        urunlerFiyatlar.put("kravat", 19.99);
        urunlerFiyatlar.put("gomlek", 19.99);
        urunlerFiyatlar.put("kazak", 19.99);

        fiyatToplami(urunlerFiyatlar);




    }

    public static double fiyatToplami(Map<String, Double> map){
        System.out.println("Urunler ve fiyatlari : " +map);

        Collection<Double> fiyatlar = map.values();
        System.out.println("fiyatlar: "+fiyatlar);


        double sum=0;

        for (Map.Entry<String, Double> w:map.entrySet()) {//burda map'i entry set'e cevirdi

            sum += w.getValue();//toplama degerleri almak icin value'leri aldik

        }
        return sum;
       


    }
}

