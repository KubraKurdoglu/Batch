package practice13;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Q01_Map_AyniUcret {
    public static void main(String[] args) {



    //Aşağıda verilen fiyat listesinden fiyatı 29.99 olan ürünlerin adlarını yazdırınız.

    Map<String, Double> urunler = new HashMap<>();

        urunler.put("Kemer", 19.99);
        urunler.put("Gomlek", 29.99);
        urunler.put("Kazak", 24.99);
        urunler.put("Pijama", 29.99);
        urunler.put("Ayakkabi", 89.99);
        urunler.put("Kravat", 19.99);
        urunler.put("Terlik", 29.99);

        System.out.println("urunler = " + urunler);//{Kemer=19.99, Kazak=24.99, Kravat=19.99, Ayakkabi=89.99, Terlik=29.99, Pijama=29.99, Gomlek=29.99}

        //1.YOL

        for (Map.Entry<String, Double> w: urunler.entrySet()){
            if (w.getValue()==29.99){
                System.out.println(w.getKey());// getvalue() veya getkey() yazmana gore ya sadece "key"leri yada sadece "valueler"i verecek
            }





        }
        Collection<Double> fiyatlar = urunler.values();
        System.out.println("fiyatlar = " + fiyatlar);
        Set<String> urunAdlari = urunler.keySet();
        System.out.println("fiyatlar = " + fiyatlar);

        //collection ve sette direk olarak belirli bir index'e sahip elemani alamazsin.
        //Array'e cevirip alabilirsin

        for (int i=0; i<fiyatlar.size(); i++){

            if (fiyatlar.toArray()[i].equals(29.99)){//fiyatlari bir "ARRAY" e cevirdi. index aldi. index==29.99 ise al diyor.

                System.out.println();
            }

        }

    }
}