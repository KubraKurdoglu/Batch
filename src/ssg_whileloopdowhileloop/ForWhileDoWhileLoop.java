package ssg_whileloopdowhileloop;

public class ForWhileDoWhileLoop {
    public static void main(String[] args) {

        //Example 1: 1'den 5'e kadar tum sayilari yazdirin

        for (int i=1; i<=5; i++){
            System.out.print(i + " ");
        }

        //2.yol (while loop)

        int j=1;

        while (j<=5){
            System.out.print(j +" ");

            j++;

        }

        //3.YOL do while loop

        int k =1;
        do{
            System.out.println(k +" ");
            k++;
        }while (k<=5);


        //4.ornek

        int m =1;
        do{
            System.out.println(m +" ");
            k++;
        }while (m>=5);


        //yukarda buyuk esut dedik
        // eger "m" degerine 4 verirsen "k++;" ile bir artiracagi icin
        // ve boylece de 5'den buyuk olma sartini saglayacagi icin "SONSUZ DONGUYE' girer



    }
}
