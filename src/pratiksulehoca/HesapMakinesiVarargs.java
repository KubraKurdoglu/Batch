package pratiksulehoca;

public class HesapMakinesiVarargs {
    public static void main(String[] args) {

        // hesap makinesindeki methodlari cagirabilmek icin
        // "constructer" a ihtiyacimiz var
        // "obje" kullanmamiz gerekiyor
        //asagidakiler "void" oldugu icin burda kullandigin degerleri sadece ekranda gorebilirisin
        // onlarla islem yapamazsin


        //DIKKAT==> burda class'tan class'a gittik
        // Hesap_Makinesi==> boyle diyerek diger class'dan cagirdik



        Hesap_Makinesi islem =  new Hesap_Makinesi();// yeni bir sey olusturduk

        islem.toplamaMethodu(3,5,7,89,-56,99);
        islem.cikarmaMethodu(10,0,70,45,761,1);
        islem.carpmaMethodu(65,87,1,3,-12);
        islem.bolmeMethodu(40,10);






    }
}
