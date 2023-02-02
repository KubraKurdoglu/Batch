package dailytravail1;

public class ForDongusu {
    public static void main(String[] args) {


        for(int i=1; i<4; i++) {
            for(int k=3; k>1; k--) {
                System.out.println(i + "==>" + k);
            }

        }


        int a[] = {1, 2};
        int b[] = {3, 2, 1};
        for(int w : a) {
            for(int m : b) {
                System.out.print(w + m + " ");
            }
        }




    }
}
