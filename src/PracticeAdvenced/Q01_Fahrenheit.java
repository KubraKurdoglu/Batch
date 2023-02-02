package PracticeAdvenced;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Q01_Fahrenheit {

    public static void main(String[] args) {

        // Fahrenheit degeri, celsisus degere ceviren kodu yaziniz
        // formul: c =(f-32)*5/9


        Scanner input = new Scanner(System.in);
        System.out.println("Fahrenheit degeri giriniz; ");
         double f = input.nextDouble();
         double c = (f-32)*5/9;

        System.out.println("Celcius: " + c);

       // asagida yukardaki islemde cikan
        // virgullu kismin belli bir ondliga kadar olanini almak icin bunu kullandik
        //"0.00" yaparak virgulden sonra iki basamak aldik

        DecimalFormat format = new DecimalFormat("0.00");
        String formattedCelcius = format.format(c);

        System.out.println("formatted celcius: "+ formattedCelcius);





    }
}
