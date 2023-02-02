package PreClassSorulari_OOP_Overriding;

public class Test07 extends Super{

    public Integer getLenght(){
        return (5);
    }

    public static void main(String[] args) {
        Super sooper = new Super();
        Test07 sub = new Test07();

        System.out.println(sooper.getLenght().toString()+ ","+sub.getLenght().toString());

    }

}
