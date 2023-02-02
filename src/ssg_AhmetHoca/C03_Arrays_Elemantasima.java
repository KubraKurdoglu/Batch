package ssg_AhmetHoca;

import java.util.Arrays;

public class C03_Arrays_Elemantasima {
    public static void main(String[] args) {

        int arr[] = {1,2,3};
        int atanacaksayi = arr[0];

        for (int i = 0; i <arr.length-1 ; i++) {// burada ilk index'i ikinci index ile degistirdi
            arr[i] = arr[i+1];


        }
        arr[arr.length-1]= atanacaksayi;// yukarda index leri degistirdi fakat, "1" i sona nasil alacagiz
        // onu bununla yapiyor
        System.out.println(Arrays.toString(arr));//[2, 3, 1]



    }
}
