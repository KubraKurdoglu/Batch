package practice08_advanced;

public class Q03_Objeolusturma_Kutuphane {
    //Kütüphaneye eklemek istediğiniz kitapları, adı, yazar adı, sayfa sayısı, seri numarası ile yazdıran bir kod yazınız.

//Kütüphaneye eklemek istediğiniz kitapları, adı, yazar adı, sayfa sayısı, seri numarası ile yazdıran bir kod yazınız.

    public static void main(String[] args) {
        Kutuphane obj1 = new Kutuphane("Mağaradakiler", "Cemil Meriç", 285);
        obj1.kitapBilgileri();
        Kutuphane obj2 = new Kutuphane("Kırlangıç Çığlığı", "Ahmet Ümit", 400);
        obj2.sayfaSayisi = 405;
        obj2.kitapBilgileri();
    }
//object'leri kullanarak variable'lar uzerinde istegimiz degisikligi yapabiliriz



}


