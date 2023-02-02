package pratiksulehoca;

public class Hesap_Makinesi {

    // ne kadar data kullanacagim belli degil
    //varrags ile istedigim kadar data koyabiliyorum
    // burda olustrudugumuz methodlarda "scope" dan sayesinde
    // butun degerlere "a" verebildik



    public void toplamaMethodu(int...a ){

        int toplam=0;


        for (int w: a) {

            toplam += w;

        }
        System.out.println(toplam);

    }

    public void cikarmaMethodu(int...a){

                int fark =0;

        for (int w: a){

            fark-= w;

        }
        System.out.println("fark ="+fark);

    }

    public void carpmaMethodu(int... a){

        int carpma= 1;

        for (int w: a){

            carpma *= w;



        }
        System.out.println("carpim= "+ carpma);
    }


    // bolme isleminde diger uc islemden farkli olarak, cok fazla hata verdigi icin
    // varrags kullanilmaz
    // cunku "12/3/4/5" ==> bu tarz islemi bolme de yapamiyoruz
    // o nedenle "varrargs" kullanilmar, yoksa hata verir


    public void bolmeMethodu(int a, int b){

      if(b==0){
          System.out.println("hicbir sayi 0'a bolunemez");

      }else {
          System.out.println("bolum: " + a/b);// concat yapar fakat java once mat. islemni alacagi icin parantez icini yapar
      }

    }


}
