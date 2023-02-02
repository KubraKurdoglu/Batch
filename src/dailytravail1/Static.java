package dailytravail1;

public class Static {
    public static void main(String[] args) {



            int x = 5;
            change(x);
            System.out.println(x);
        }



            public static void change(int x){
                x = 20;
            }


            //burada method'un icinde sout yok, oyuzden 20'yi hic yazdirmadi.

            // direk ilk kismindaki "int x=5" i yazdirdi.




}
