package ssg_varargs;

public class EnUzunIlce {
    public static void main(String[] args) {

        // Kac tane ill ismi verilirse verilsin
        // iclerinden en Uzun olani yazdiran bir method olusturun
        String ill1 = "Adana";//5
        String ill2 = "ankara";
        String ill3 = "Istanbul";
        String ill4 = "Bursa";
        String ill5 = "cihan";

        enUzunIl(ill1,ill2,ill3,ill4,ill5);
        enUzunIl("ankara","istanbul", "mersin", "trabzon","sanliurfa");

    }


    public static void enUzunIl(String... il){

        String enUzunIl = "";
        for (String w:il) {

            if(w.length()>enUzunIl.length()){

                enUzunIl = w;
            }
        }
        System.out.println(enUzunIl);

    }
}
