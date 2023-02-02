package pratiksulehoca;

import java.util.Arrays;

public class Arrays_IkiTaneIfIle {
    public static void main(String[] args) {

        // Bu soruda dikkat etmen gereken bir sey var
        // iki if var ve "break" demiyor
        // o nedenle  sartlar uygunsa her iki "if" de calisiyor
        // ilk "if" in sonucu ikinci "if" in sartini sagliyorsa,ilk "if"in sonucunu da ikici
        // "if" calistiracak


                int arr[][] = { {3,2,1},{1,2,3} };


                for (int i = 1; i < arr.length; i++) {


                    for (int k = 1; k < arr[0].length; k++) // burda da sifirinci indeksin uzunlugun al diyor
                    {
                        if (arr[i][k] % 2 == 1){
                        arr[i][k] = arr[i][k] + 1; }


                        if (arr[i][k] % 2 == 0){ arr[i][k] = arr[i][k] * 2;
                        } }
                }
                System.out.println(Arrays.deepToString(arr)); }






    }

