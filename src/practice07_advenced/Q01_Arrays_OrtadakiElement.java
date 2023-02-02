package practice07_advenced;

import java.util.Arrays;
import java.util.Scanner;

public class Q01_Arrays_OrtadakiElement {


    //Elementlerini kullanıcandan aldığınız bir integer array içindeki orta elementi bulan bir kod yazınız.
    //    Example: (12, 5, 8) ==> (5, 8, 12) ==> Output=8
    //    (12, 5, 8, 13) ==> (5, 8, 12, 13) ==> Output=(8+12)/2 = 10

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Array limitini giriniz");
        int limit = input.nextInt();
        int[] arr = new int[limit];
        //System.out.println(Arrays.toString(arr));==> bu "sout" burda olsaydi
        //limit sayisi kadar sifir gorecektik

        for (int i = 0; i <limit ; i++) {// sinir olarak arr.lenght'de yazabilirdin
            System.out.println(i+1 +" . Elementi giriniz");
            arr[i] = input.nextInt();

        }
        System.out.println(Arrays.toString(arr));


        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        int ortaIdx = arr.length/2; //limit/2'de yazabiliridin`
        //index her zaman integer olmak zorunda
        //3/2 bize 1.5 verir amam index her zaman integer, virgulden sonrasini sildi

        if (arr.length%2!=0){
            System.out.println("Orta element= "+ arr[ortaIdx]);
        }else{
            System.out.println("orta element=  "+ ((arr[ortaIdx]+arr[ortaIdx-1])/2.0));//sona
            //2.0 koydu, cunku normalde index double olmamaz, ama sona "2" yi "2.03 diye yazarsak
            // double bir deger almis oluruz

        }



    }
}
