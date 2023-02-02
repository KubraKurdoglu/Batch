package dailytravail_29_01;

public class StaticKeyword {

    public static void main(String[] args) {



        int fiyat = 100;

        System.out.println(indirim(fiyat));
        System.out.println(fiyat);
    }

    private static int indirim(int fiyat){
        fiyat*=0.90;
        return fiyat;

    }

}
