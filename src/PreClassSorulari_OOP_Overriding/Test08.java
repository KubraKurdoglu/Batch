package PreClassSorulari_OOP_Overriding;

public class Test08 {
    public static void main(String[] args) {
        X x = new X();
        Y y = new Y();

        y.m2();
        x.m1();
        y.m1();
        x=y;
        x.m1();




    }
}
