package practice07_sulehoca;

public class MyExceptions extends Exceptions{

    static final String str = "Sen Degerlisin";

    public MyExceptions(String str) {
        super(str);///2. adim
        System.out.println("Oyun Oynadi ");//3.ADIM
    }

    public MyExceptions() {
        super(str);
    }//8.ADIM beni geldigim class' a gonderdi



}
