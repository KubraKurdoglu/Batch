package dailytravail1;

public class StringBuilder_SilinenEleman {
    public static void main(String[] args) {


        StringBuilder strBld = new StringBuilder("John ");
        strBld.append("Woo ").append("Leo").deleteCharAt(6);
        System.out.println(strBld);



            StringBuilder str = new StringBuilder(7);
            str.append("Java");
            System.out.println(str.capacity() + "," + str.length());



            String str1 = "Learn";
            str1 = str1 + "Java";
            System.out.println(str1);
            System.out.println(str1 + "Java");



        StringBuilder sb3 = new StringBuilder("Learn");
        System.out.println("Before trim: " + sb3.capacity());// capacity ilk basta "5", fakat biz bunu parantezin
        //icinde vermedigimiz icin bize "16" daha verdi, tplamda "21" oldu kapasite
        sb3.trimToSize();//Trim tum bosluklari sil demek, boslullar bize verilen"16" eleman oluyor
        System.out.println("After trim: " + sb3.capacity());


        //yukarda trim'den once ve trim'den soneraki kapasiteyi soruyor
        // bosluk verilen 16 deger cunku onlari dlduracak eleman yok, trim'le bosluklari kes dedigi icin
        // elimizde "5" tane eleman kaliyor

        StringBuilder sb = new StringBuilder(9);
        System.out.println(sb.length() + " - " + sb.capacity());

        StringBuilder sb1 = new StringBuilder("Java");
        System.out.println(sb1.length() + " - " + sb1.capacity());

        StringBuilder sb2 = new StringBuilder();
        System.out.println(sb2.length() + " - " + sb2.capacity());

        StringBuilder sb4 = new StringBuilder("StringBuilder");
        System.out.println(sb4.delete(3, 6).toString() + " - " + sb4.length());

    }



}
