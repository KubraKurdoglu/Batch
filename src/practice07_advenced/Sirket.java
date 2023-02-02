package practice07_advenced;

public class Sirket {

    static int kasa;//kasa static cunku tum departmanlar ilgilendiriyor
    int depButcesi; //bu non-static cunku onlara ozel ama butcelerini kasadan alacakalar


    public void kasadanButceyeParaAl(int alinacakPara) {
        depButcesi += alinacakPara;
        kasa -= alinacakPara;
        System.out.println("Kasadan " + alinacakPara + " lira alındı");
    }

    public void paraKazan(int kazanilanPara) {
        kasa += kazanilanPara;
        System.out.println(kazanilanPara + " lira kazanıldı");
    }

    public static void kasadanParaHarca(int harcanacakPara) {
        kasa -= harcanacakPara;
        System.out.println("Kasadan " + harcanacakPara + " lira harcandı");
    }

    public void departmanHarcamasi(int harcanacakPara) {
        depButcesi -= harcanacakPara;
        System.out.println("Departman bütçesinden " + harcanacakPara + " lira harcandı");


    }
}