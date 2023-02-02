package ssg_varargs;

public class Varargs01 {
    public static void main(String[] args) {
        //birden fazla syiyi toplayan metod olustrur

        int [] arr = {3,3,5,7,9,12};

        toplamaIslemi(arr);

    }


    public static void toplamaIslemi(int... a){//method icerisinde olusturulan dger local variable dir
        int sum = 0;

            for (int w:a) {

                sum += w;// sum= sum+ w;

            }
        System.out.println(sum);

    }
}

//static variable
//local variable
// initial variable