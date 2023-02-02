package practice12;

public class Q03_FoorLoop_UsAlma {
    public static void main(String[] args) {

        ///System.out.println(kuvvetiniAl(5,0));==> bu secenekte sonucu bir verdi, ust sifir oldugu icin calismayacak
        // sonucta 1 atandigi icin bir verecek.

        System.out.println(kuvvetiniAl(5, 2));//0.125===> bu 1/8 yapar


    }

    public static double kuvvetiniAl(double taban, int us){

        double sonuc =1;
        if(taban==0 && us==0){
            throw  new ArithmeticException("Taban ve us ayni anda sifir olamaz");
        }

        if (us>=0) {

            for (int i = 0; i < us; i++) {

                sonuc *= taban;
            }
            return sonuc;
        }else {
            for (int i = 0; i < Math.abs(us); i++) {

                sonuc *= taban;
            }
            return 1/sonuc;
        }

    }



}
