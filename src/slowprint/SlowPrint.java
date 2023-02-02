package slowprint;

public class SlowPrint {


    //Slow yazdirmak icin bu methidu kopyaliyorsun
    // sonra methodu cagirip, sout'un icine yazmak istedigin sey ve nano sanoyeyei yaziyorsun

    public static void slowPrint(String text, int delay) {
        for (char c : text.toCharArray()) {
            System.out.print(c);
            try {
                Thread.sleep(delay);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
