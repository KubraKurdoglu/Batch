package practice06_advenced;

public class Q04_MethodOverloading_Hacim {

    //Küp, kare prizma ve dikdörtgen prizmanın hacmini hesaplayan bir method oluşturunuz.(Method overloading kullanınız)


    public static void main(String[] args) {

        // Hacim klasindan objeyi cekmek icin, "new Hacim();"
        //unutma her class bir data tipidir
        // ama her data bir class degildir
        // Hacim klasini kullanabilmek icin
                //obje olusturdu

       Hacim obje =new Hacim();
      int kupunHacmi= obje.hacimHesapla(5);// obje yazdik noktaya bastik, direk methodu cagirdi
        System.out.println("kupun hacmi "+ kupunHacmi);

        int karePrizmaninHacmi = obje.hacimHesapla(6,8);
        System.out.println("karePrizmaninHacmi "+ karePrizmaninHacmi);

        //method cagirirken ayni adda hangisini cagirdiginin onemi yok
        // o zaten girdigin deger sayisina gore methodu cekyor

        int dikdortgenprizmaHacmi = obje.hacimHesapla(6,7,9);
        System.out.println("dikdortgenprizmaHacmi " +dikdortgenprizmaHacmi);


    }
}
