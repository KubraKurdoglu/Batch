package practice13;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Q02_Map_Aile {


        //Ad-Soyad-Yaş ve kardeşler listesini tek bir Map içerisinde saklayan bir kod yazınız.


    public static void main(String[] args) {


        Aile ali = new Aile("Ali","Can",12,"Ahmet","hayriye");
        System.out.println("ali.getAileMap() = " + ali.getAileMap());


        Aile veli = new Aile("Veli","Han", 34, "HAsan","Huseyin");
        System.out.println("veli.getAileMap() = " + veli.getAileMap());

        Aile ayse = new Aile("Ayşe","Kan",35,"Fatma");
        System.out.println("ayse = " + ayse);
    }
}
