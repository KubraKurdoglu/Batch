package practice05_Advenced;

public class Q06_Arrays_Simetrik {


    // Bir Array'in simetrik olup olmadığını kontrol eden bir method oluşturunuz.

    public static void main(String[] args) {


        int[] arr = {1, 2, 3, 4, 5,6,5, 4, 3, 2, 1};


        System.out.println(isSimetrik(arr));


    }

    public static boolean isSimetrik(int[] arr) {

        boolean isSimetrik = false;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] == arr[arr.length - 1 - i]) {//burda ilk indeks ile ona denk gelen
                // sonadan ayni siradaki index'i karsilastiriyor

                isSimetrik = true;
            } else {
                isSimetrik = false;
                break;
            }

        }
        return isSimetrik;

    }
    //  if (arr[i] == arr[arr.length - 1 - i])
    // bura i=0 iken bir sey degismeyecek ama
    // i=1 icin, sondan "-1" inci degeri karsilasy-tirmasi gerekiyor
    // bunu bulambilmke icin [arr.length - 1 - i]==> dedi








}
