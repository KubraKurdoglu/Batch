package practice07_sulehoca;

import static practice07_sulehoca.MyExceptions.str;

public class RunnerExceptions {
    public static void main(String[] args) {

     MyExceptions my = new MyExceptions(str);//my objesi olusturdu. myexceptions a git str al
        // burdan myexceptions  calss 'ina gitti orda argumanli olan metodu calistirdi



        try {//9.ADIM
            int x = 100, y=5;//10.ADIM


            float ortalama = (float) x/ (float) y;//11.ADIM

            if(ortalama<50) {//12.ADIM

                throw new IllegalArgumentException("Ortalama cok dusuk");//13. adim bura throw new gorduysen devam edemezsin
                // yan yazdiracagi seyi goremez "catch" bloguna gecersin
            }
        } catch (Exception e) {//14.ADIM

            System.out.println("Sorunun kaynagi ne ==>" +e.getMessage());//15.ADIM

            e.printStackTrace();// bu consol'da yazan kirmizili kimsin gelmesini neden oldu

        } finally {

            System.out.println(str);//15.adim final olarak kimsenin degistiremeyecegi ilk deger yaziliyor
        }//16.ADIM ==> bu parantez beni main methoda gonderdi


     }



    }

