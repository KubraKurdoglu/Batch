package dailytravail1;

import java.util.Arrays;

public class ElemanSil {
    public static void main(String[] args) {
        int ar[]={3,4,2,3,5,7,3,8,5,2,4};

        int counter=0;
        for (int i = 0; i < ar.length; i++) {
            if (ar[i]!=3){
                counter++;
            }


        }
        System.out.print(Arrays.toString(ar));
        System.out.println();
        System.out.println(counter);


        int newb[]=new int[counter];
        int idx=0;
        for (int w:ar) {
            if (ar[w]!=3){
                newb[idx]=w;
                idx++;

            }
        }


        System.out.println(Arrays.toString(newb));




    }
    }

