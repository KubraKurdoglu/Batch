package ssg_varargs;

public class Varargs02 {
    public static void main(String[] args) {


        //bir ogrencinin ismi , soyadi -, sinif , adresi ve yas icin bir metod yaziniz




    }
    public static void ogrenciBilgileri(int yas, int sinif,String... ogrenciadsoyadadres){

        for (String w:ogrenciadsoyadadres) {

            System.out.println(w + " ");
            System.out.println(yas);
            System.out.println(sinif);

        }



    }
}
