package okulprojesi;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ogrenci {
   static Scanner scanner = new Scanner(System.in);

//Ogrenci Bilgileri

    private String ogrenciAdSoyad;
    private String ogrenciId;
    private int ogrenciYas;
    private int ogrenciNumara;
    private int ogrenciSinif;

    public void OkulOgrenciOgretmenBilgileri(String ogrenciAdSoyad, String ogrenciId, int ogrenciYas, int ogrenciNumara, int ogrenciSinif) {
        this.ogrenciAdSoyad = ogrenciAdSoyad;
        this.ogrenciId = ogrenciId;
        this.ogrenciYas = ogrenciYas;
        this.ogrenciNumara = ogrenciNumara;
        this.ogrenciSinif = ogrenciSinif;
    }


    public String getOgrenciAdSoyad() {
        return ogrenciAdSoyad;
    }

    public void setOgrenciAdSoyad(String ogrenciAdSoyad) {
        this.ogrenciAdSoyad = ogrenciAdSoyad;
    }

    public String getOgrenciId() {
        return ogrenciId;
    }

    public void setOgrenciId(String ogrenciId) {
        this.ogrenciId = ogrenciId;
    }

    public int getOgrenciYas() {
        return ogrenciYas;
    }

    public void setOgrenciYas(int ogrenciYas) {
        this.ogrenciYas = ogrenciYas;
    }

    public int getOgrenciNumara() {
        return ogrenciNumara;
    }

    public void setOgrenciNumara(int ogrenciNumara) {
        this.ogrenciNumara = ogrenciNumara;
    }

    public int getOgrenciSinif() {
        return ogrenciSinif;
    }

    public void setOgrenciSinif(int ogrenciSinif) {
        this.ogrenciSinif = ogrenciSinif;
    }


    }


