package arabakiralamaprojesi;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArabaVeMusteriBilgisi extends AracIsteme {

    static List<AracIsteme> aracTalepListesi = new ArrayList<>();

    static Scanner scanner = new Scanner(System.in);

    int kiralanacakGunSayisi=0;

    public static void aracTalepEt() {


        System.out.println("Lutfen araci alacaginiz sehri yaziniz");
        String alinacakSehir = scanner.nextLine();

        System.out.println("Lutfen araci alacaginiz gunu yaziniz (Ornek 12.05): ");
        String alinacakGun = scanner.nextLine();

        System.out.println("Lutfen alis saatini yaziniz (Ornek 15:00): ");
        String alisSaati = scanner.next();

        System.out.println("Lutfen araci teslim edeceginiz gunu yaziniz (Ornek 12.05): ");
        String teslimGunu = scanner.nextLine();

        System.out.println("Lutfen araci teslim edeceginiz saati yaziniz (Ornek 12:05): ");
        String teslimSaati = scanner.nextLine();

        //burda bilgileri verecgimiz ekrani hazirliyoruz
        System.out.println("\033[33m \n********************************************** \033[0m");

        String aGun = alinacakGun.substring(0, 2);// burda 12.05 'in 12 kismini almak icin yapti
        int intAGun = Integer.parseInt(aGun);// String i integer a cevirdi

        String aAy = alinacakGun.substring(3);// burda da ay kismini lamak icin yapti.3. index'ten sonra
        int intAAy = Integer.parseInt(aAy);

        System.out.println(" Alis tarihi: " + intAGun + "." + intAAy);

        String tGun = teslimGunu.substring(0, 2);//15.05
        int intTGun = Integer.parseInt(aGun);// String i integer a cevirdi

        String tAy = teslimGunu.substring(3);// burda da gun kismini almak icin yapti.3. index'ten sonra
        int intTAy = Integer.parseInt(aAy);


        // Simdi alis tarihini teslim gununden once olmesini engelliyoruz
        if ((intAAy > intTAy)) {
            System.out.println("Araci aldiginiz ay teslim tarihinden sonra olamaz");
            aracTalepEt(); // burda kullanicin tekrar giris yapmasini sagliyoruz

        } else if (intAGun > intTGun) {
            System.out.println("Araci aldiginiz gun teslim tarihinden sonra olamaz");


        } else {

        }
        int kiralanacakGunSayisi = (intTAy - intAAy) * 30 + (intTGun - intAGun);
        System.out.println("\033[36m Arac toplam " + kiralanacakGunSayisi + " gün kiralanmistir. \033[0m");

        System.out.println("\033[33m ********************************************** \033[0m");


    }
    // Simdi arabalari isteyecegiz

    private static void getAraba(String mercedes, String mayBach, String diesel, String aotomatic, int i) {
    }

    public static void arabaOzellikleri() {
        AracIsteme mercedesMaybach = new AracIsteme("MERCEDES", "maybach", "Diesel", "Automatic", 250);
        AracIsteme audi = new AracIsteme("AUDI", "R8", "Diesel", "Automatic", 350);
        AracIsteme teslaModelY = new AracIsteme("TESLA", "Model Y", "Electric", "Automatic", 150);
        AracIsteme bmwX5 = new AracIsteme("BMW", "X5", "Essence", "Manuel", 100);
        AracIsteme bmwI3 = new AracIsteme("BMW", "I3", "Electric", "Automatic", 150);
        AracIsteme renaultZOE = new AracIsteme("RENAULT", "ZOE", "Electric", "Automatic", 75);
        AracIsteme CitroenC5 = new AracIsteme("Citroen", "C5", "Essence", "Manuel", 100);


        //bu araclari olusturdugumuz arac lsitesin ekleiyoruz

        aracTalepListesi.add(mercedesMaybach);
        aracTalepListesi.add(audi);
        aracTalepListesi.add(teslaModelY);
        aracTalepListesi.add(bmwX5);
        aracTalepListesi.add(bmwI3);
        aracTalepListesi.add(renaultZOE);
        aracTalepListesi.add(CitroenC5);

        System.out.println("\033[33m *********************Arac Talep Listesi************************* \033[0m");
        System.out.println("Lutfen talep ettiginiz araci seciniz." +

                "\n 1. MERCEDES - MayBach - Diesel - Automatic - €250" +
                "\n 2. AUDI R8 - R8 - Diesel - Automatic - €350" +
                "\n 3. TESLA -  Model Y - Electric - Automatic- €150" +
                "\n 4. BMW - X5 - Essence - Manuel - €100" +
                "\n 5. BMW - I3 - Electric - Automatic - €150" +
                "\n 6. RENAULT - ZOE - Electric - Automatic - €75" +
                "\n 7. CITROEN - C5 - Essnce - Manuel - 100");

        int secim=0;
        try{
            secim = scanner.nextInt();

        }catch (Exception e){
            e.printStackTrace();
        }


      



    }


}



