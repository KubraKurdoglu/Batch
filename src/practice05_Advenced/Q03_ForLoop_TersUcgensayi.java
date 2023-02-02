package practice05_Advenced;

public class Q03_ForLoop_TersUcgensayi {

    /*
        Şekli Yazdırınız:
          1 2 3 4 5 6
           2 3 4 5 6
            3 4 5 6
             4 5 6
              5 6
               6
    */
    public static void main(String[] args) {




        for (int i=1; i<=6; i++){//Satir Kontrolu

            for(int bosluk = 1; bosluk<i; bosluk++ ){//bosluklar icin

                System.out.print( " ");// "ln" i sildi cunku bosluklari yanyana yazdirsin istedi
            }


            for (int j= i; j<=6; j++){//sutunlar icin, j=i yaptik cunku zaten i hep artiyor

                System.out.print(j + " ");
            }
            System.out.println();// bunu alt satira inmek icin yazdik
            // ic for alti kez calisacagi icin bu sout bizi alti kez asagi atacak

        }






    }

    // hoca burda yaptigi her asamada yazdirarak gitti
    //





}
