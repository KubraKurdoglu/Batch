package practice_sulehoca_08;

public class Browser {


    public static void main(String[] args) {

        String adresCubugu = "Her Browser'da adres cubugu vardir";

        Edge edge = new Edge();//obje olustururken class ismi yazdi once, sonra objenin adini yazdi
        edge.search();
        edge.sifreKaydetme();
        edge.get();

        Edge edge2 = new Edge(adresCubugu);
        System.out.println(edge2.adresCubugu);


    }


    public void get(){
        System.out.println("Browserlar web sayfasina gider");
    }

    public void search(){
        System.out.println("Browser'lar web sayfasinda arama yapar");
    }

    public void sifreKaydetme(){
        System.out.println("Browserlar istenildiginde sifre kaydeder");
    }
}
