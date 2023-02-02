package practice07_sulehoca;

public class C01_Exceptions {
    public static void main(String[] args) {

        double result = karakterSayisiniKarsilastir("Tester", "Developer");

        System.out.println(result);

        double r2 = karakterSayisiniKarsilastir("Tester", "");

        System.out.println(r2);

        double r3 = karakterSayisiniKarsilastir("", "Developer");

        System.out.println(r3);
    }

    //ctrl+alt+t====> try catch finally i otomatik yazdirmak icin

    private static double karakterSayisiniKarsilastir(String str1, String str2) {
        double result = 0;

        try {
          result = str1.length()/str2.length();
            System.out.println(result);//burda verilen hatayi handle etmek icin catch calsisiyor

        }catch (ArithmeticException e) {

            System.err.println("Payda sifir olamaz ==> " + e.getMessage());//e.getMessage() mutlaka sout icind olmali

        }catch (NullPointerException e){

            System.err.println("lenght() Methodu null ile hata verir==> "+e.getMessage());//e.getMessage() mutlaka sout icind olmali
            e.getStackTrace();

        }finally {//herhalukarda hersey yolunda gitse de "finally" bolumu calissin diye yaziliyor bu
            //"finally" in hata ile ilgisi yok calismasini istedigin kodlar icin yaziliyor

            System.out.println("Database ile baglanti kesilsin...");

        }

     return result;


    }
}
