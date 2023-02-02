package practice12;

public class Q04_Random_AdOlusturma {

    //Rastgele alınan harfleri bir Stringe ekleyerek adınızı oluşturan ve
    // bunu kaç deneme ile yaptığını yazdıran bir kod yazınız.


    public static void main(String[] args) {


        //isimde bosluk olma ihtimaline karsi alfabenin sonuna bosluk ekledi==> ALi Can gibi
        //bura lenght'i kullanmasinin nedeni alfabedeki toplam harf kadar ihtimali var o nedenle
        // bir de random class'ta rastgele sayi 0-1 arasinda oluyordu. bunu 10 ile carparsan
        //1 ile 10 arasinda bir rakam verecek ama 1'i vermeyecek, bu kurladan dolayi hoca lenght-1 yerine
        //lenght kullandi
        //rastgele bir sayi aliyor cunku o rastgele sayi ile rastgele bir harf alacak
        //ve bir de int e cevirdi cunku tam sayi almak istiyor
        //ama dikkat et tamamini int'e cevirdi

        String alfabe = "abcçdefgğhıijklmnoöpqrstuüvwxyzABCÇDEFGĞHIIJKLMNOÖPQRSTUÜVWXYZ ";

        int rastgeleIdx = (int)Math.random()*alfabe.length();
         String isim = "a";
         String yeniIsim = "";

        int sayac = 0;

        for (int i=0; i<isim.length(); i++){



            while (true){
                char rastgeleHarf = alfabe.charAt((int)(Math.random()*alfabe.length()));
                sayac++;
                if (isim.charAt(i)==rastgeleHarf){
                    yeniIsim += rastgeleHarf;
                    System.out.println("yeniIsim: "+yeniIsim);
                    System.out.println("sayac: "+ sayac);
                    break;
                }
            }

        }






    }




}
