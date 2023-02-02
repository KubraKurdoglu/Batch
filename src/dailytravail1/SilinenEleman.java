package dailytravail1;

import java.util.Arrays;
import java.util.Scanner;

public class SilinenEleman {
    public static void main(String[] args) {

        // Soru 7:Verilen bir Arrayden istenen elemeneti silip kalanlari yeni bir array olarak yazdiran yeni bir method olusturun
        //  int arr[]={3,4,2,3,5,7,3,8,5,2,4}; silinecek element=3

        int arr[]={3,4,2,3,5,7,3,8,5,2,4};



        System.out.println(Arrays.toString(isteneniSil(arr)));




    }



    public static int[] isteneniSil(int [] arr){
        Scanner input = new Scanner(System.in);
        System.out.println("lutfen silinecek degeri giriniz");
        int silinecekElement =input.nextInt();
        int lenght = 0;

        for (int w: arr){
            if(w!=silinecekElement){
               lenght++;

            }
        }

        System.out.println(lenght);
         int [] brr = new int[lenght];
         int index = 0;
         for (int q : arr){
             if (q!=silinecekElement){
                 brr [index] =q;
                 index++;
             }
         }
         return brr;

    }




}
