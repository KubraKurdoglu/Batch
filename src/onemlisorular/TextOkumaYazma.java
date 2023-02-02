package onemlisorular;

import java.io.*;

public class TextOkumaYazma {
    //Bir text dosyasındaki her satırın kelime sayısını o dosyada her satırın sonun yazdıran bir kod yazınız.


    public static void main(String[] args) throws IOException {

        FileReader fileReader = new FileReader("/Users/kubrasimsek/Desktop/HelloWorld.txt");

        BufferedReader bufferedReader = new BufferedReader(fileReader);

        String satir = bufferedReader.readLine();

        String yeniDosya = "";

        while (satir!=null){

            yeniDosya+=satir+"==> Satir Kelime Sayisi: " + satir.split(" ").length+"\n";

            satir = bufferedReader.readLine();
        }


        System.out.println("yeni dosya =  "+yeniDosya);
        bufferedReader.close();

        FileWriter fileWriter  = new FileWriter("/Users/kubrasimsek/Desktop/HelloWorld.txt");

        fileWriter.write(yeniDosya);
        fileWriter.close();

    }

}
