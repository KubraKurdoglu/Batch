package ssg_varargs;

public class VarargssizCozum {
    public static void main(String[] args) {
        // iki sayiyi toplayan bir metot olusturun

        toplama(3,5);// bur arguments ler var
    }

    public static void toplama(int a, int b){// method olusturuken yazdigin degerlere   "parametre deniyor"
        System.out.println(a+b);
    }

    public static void display(){//bu methodun parametresi yok
        System.out.println();

    }
}
