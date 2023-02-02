package practice07_advenced;

public class Matrix_ucgen {
    public static void main(String[] args) {
/*

0  0  0  0  1  0  0  1  1  1
 1  1  0  0  0  1  1  0  1
  1  0  1  0  0  0  0  1
   1  0  0  0  1  0  0
    0  1  1  0  1  0
     0  0  1  1  0
      0  1  0  0
       0  0  1
        0  1
         0



 */
    int k;


    for(int i=10; i>0; i--){
        for (int j=i; j<10; j++){

            System.out.print(" ");

        }
        for (k=1; k<=i; k++){
            System.out.print((int) (Math.random()*2)+ " ");
            System.out.print(" ");
        }

        System.out.println();
    }



}
}