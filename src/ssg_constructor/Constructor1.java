package ssg_constructor;

import interviewsorulari.C;

public class Constructor1 {

    String isim;
    int yas;

    Constructor1(String isim, int yas){
        this.isim=isim;
        this.yas=yas;


    }

    public Constructor1(String isim) {
    }

    public static void main(String[] args) {

        Constructor1 obj1 = new Constructor1("Mehmet Ali", 21);
        System.out.println(obj1.isim);
        System.out.println(obj1.yas);

        Constructor1 obj2 = new Constructor1("Omer Faruk");
        System.out.println(obj2.isim+" "+obj2.yas);//obj2==> constructor'unde yas obje si olmadigi icin
        // onun degerini sifir olarak gosterecek



    }



}
