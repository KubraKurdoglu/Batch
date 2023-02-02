package interviewsorulari;

public class Calisma3 {
    public static void main(String[] args) {
        Integer z = 0;

        try {

            String s = "abcd";

            z = Integer.parseInt(s);

        }catch(NumberFormatException e) {

            System.out.println("Good");

        }

        System.out.println(z);


    }
}
