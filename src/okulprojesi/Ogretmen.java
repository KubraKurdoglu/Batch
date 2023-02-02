package okulprojesi;

public class Ogretmen {
    //Ogretmen Bilgileri

    private String ogretmenAdSoayad;
    private String ogretmenId;
    private int ogretmenYas;
    private String ogretmenBrans;
    private int ogretmanSicilNo;


    public void OkulOgrenciOgretmenBilgileri(String ogretmenAdSoayad, String ogretmenId, int ogretmenYas, String ogretmenBrans, int ogretmanSicilNo) {
        this.ogretmenAdSoayad = ogretmenAdSoayad;
        this.ogretmenId = ogretmenId;
        this.ogretmenYas = ogretmenYas;
        this.ogretmenBrans = ogretmenBrans;
        this.ogretmanSicilNo = ogretmanSicilNo;
    }


    public String getOgretmenAdSoayad() {
        return ogretmenAdSoayad;
    }

    public void setOgretmenAdSoayad(String ogretmenAdSoayad) {
        this.ogretmenAdSoayad = ogretmenAdSoayad;
    }

    public String getOgretmenId() {
        return ogretmenId;
    }

    public void setOgretmenId(String ogretmenId) {
        this.ogretmenId = ogretmenId;
    }

    public int getOgretmenYas() {
        return ogretmenYas;
    }

    public void setOgretmenYas(int ogretmenYas) {
        this.ogretmenYas = ogretmenYas;
    }

    public String getOgretmenBrans() {
        return ogretmenBrans;
    }

    public void setOgretmenBrans(String ogretmenBrans) {
        this.ogretmenBrans = ogretmenBrans;
    }

    public int getOgretmanSicilNo() {
        return ogretmanSicilNo;
    }
    public void setOgretmanSicilNo(int ogretmanSicilNo) {
        this.ogretmanSicilNo = ogretmanSicilNo;
    }



}
