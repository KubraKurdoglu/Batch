package practice08_advanced;

import java.util.Arrays;
import java.util.Scanner;

public class Q02_Arrays_SesliHarfler {

    public static void main(String[] args) {

        /*Kullanıcıdan alınan bir kelimedeki sesli harfleri kapatıp her bir karakteri bir array
         elemanı olarak yazdıran bir kod yazınız.
    Örn:
    input: Merhaba
    output: [M, *, r, h, *, b, *]
    */

        /*
        Scanner scan  = new Scanner(System.in);
System.out.println("Bir string degeri giriniz");
String a = scan.nextLine();

String[] arr = a.split("");

for (int i = 0; i < arr.length; i++) {

    switch (arr[i]){
        case "a":
        case "e":
        case "i":
        case "o":
        case "u":

            arr[i] = "*";
    }

}
System.out.println(Arrays.toString(arr));
         */

        /*
        Scanner scan = new Scanner(System.in);
System.out.println("Lutfen bir kelime giriniz");
String s = scan.next();
String arr[] = s.replaceAll("[aeiouAEIOU]", "*").split("");

System.out.println(Arrays.toString(arr));
         */


            Scanner input = new Scanner(System.in);
            System.out.println("Bir kelime giriniz");
            String str = input.nextLine();

            String[] arr = new String[str.length()];
            int idx=0;

            for(String w : str.split("")){

                if(w.equalsIgnoreCase("a")||w.equalsIgnoreCase("e")||w.equalsIgnoreCase("i")||w.equalsIgnoreCase("o")||w.equalsIgnoreCase("u")){
                    arr[idx] = "*";
                    idx++;
                }else {
                    arr[idx]=w;
                    idx++;
                }
            }

            System.out.println(Arrays.toString(arr));






    }




}
