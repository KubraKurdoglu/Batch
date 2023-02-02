package pratiksulehoca;

import java.util.Scanner;

public class ForLoop {

    //baslangic ve bitis sayilari arasindaki, artis miktarinca artirilarak
    // verilen tum sayilari virgul koyarak yazdirin
    // int baslangic = 10;
    // int bitis = 50;
    // int artisMiktari = 5;

    // 10, 15, 20, 25, ....,50

    public static void main(String[] args) {

        int baslangic = 10;
        int bitis = 50;
        int artisMiktari = 5;

       for(int i= baslangic; i<=bitis; i+=artisMiktari){
           if(i<bitis){

               System.out.print(i+ ",");
           }else{
               System.out.println(i);// 50'den sonra gelen virgulu silmek icin bunu yaptik
           }


       }


       Scanner input = new Scanner(System.in);

        System.out.println("lutfen baslangic degeri olan 'b' yi giriniz");
       int b = input.nextInt();

        System.out.println("lutfen bitis degeri olan 't' yi giriniz");
        int t=input.nextInt();

        System.out.println("lutfen artis miktarini giriniz");
        int artisMiktari2=input.nextInt();

        for (int i = b; i<=t; i +=artisMiktari2){
            if (i<t){

                System.out.print(i+ ",");

            }else{

                System.out.print(i);
            }
        }









    }




}
