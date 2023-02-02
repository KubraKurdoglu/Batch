package ssg_whileloopdowhileloop;

public class SayiyiTamBolenSayilarveBolenleri {
    public static void main(String[] args) {


        // Kullanicidan bir sayi alin ve
        // bu sayiyi tam bolen sayilari ve toplam kac tane olduklarini ekranda yazdirin

        int input =100;
        int bolen =1;
        int sayac =0;
        int i=1;

        /*
        while (bolen<=input){
            if(input%bolen==0){
                System.out.println(bolen + " ");
                sayac++;
            }

            bolen++;
        }
        System.out.print(input + " sayisini bolen "+ sayac + " adet sayisi vardir.. ");

         */


        //DO WHILe ile cozumu


        do{
            if(input%bolen==0){
                System.out.println(bolen + " ");
                sayac++;
            }

            bolen++;
        } while (bolen<=input);
        System.out.print(input + " sayisini bolen "+ sayac + " adet sayisi vardir.. ");





    }
}
