package practice07_sulehoca;

public class C02_Exceptions {

      /*
rastgeleSayi isminde bir method oluşturunuz.
Bu method içerisinde iki int random sayı oluştursun. (0'dan 10 a kadar)
Bu iki random sayının toplamını yazdırın.
Eğer bu iki random sayının toplamı 12 den küçükse "Exception" versin ve mesaj olarak
("Sayı 12'den küçük ise hata verir") yazdırın.
  */

    public static void main(String[] args) {

        rastgeleSayi();

        System.out.println("Durmak Yok Yola Devam");//===> bu hata olmasina ragmen calisti
    }

    private static void rastgeleSayi() {


        int sayi1 = (int)(Math.random()*10);// bu integer ama random, double dondurur, o nedenle (int) 'a donusturduk
        // 10 ile carptik, cunku dogal sayi yapmak istedik, virgulden kurtardik

        int sayi2 = (int)(Math.random()*10);

        System.out.println(sayi1+ "=="+ sayi2);
        int toplam =0;

        try {
            toplam = sayi1+sayi2;
            System.out.println(toplam);
            if(toplam<12){
                throw new IllegalArgumentException(" Sayi 12'den kucuk olmali");
            }

        } catch (Exception e) {

            System.out.println("Toplam 12'den buyuk olmali" + e.getMessage());

        } finally {

            System.out.println("Database ile baglantiyi kes..");
        }




    }


}
