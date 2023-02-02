package practice07_sulehoca;

public class Test2 {



        String str = "a";
        void a() {//=====> 3. adim
            try {
                str = str + "b";//======>4.adim, bunun sonucu olarak==> ab oluyor
                b();//======> 5. adim b'ye git, b methoduna git
            } catch (Exception e) {
                str = str + "c";
            }
        }
        void b() throws Exception {//=====> 6. adim
            try {
                str = str + "d";//====>7.adim
                c();//========> 8.adim
            } catch (Exception e) {//======>11.adim
                str = str + "e";
            } finally {
                str = str + "f";
            }
            str = str + "g";
        }
        void c() throws Exception {//=====>9.adim
            System.out.println(12/0);///======> 10. adim burasi hata verdi. bu yazilan kod beni hatanin handle edildigi yere gonderir
            //bu adim bizi catch e' ye gonderir.
        }
        void display() {
            System.out.println(str);
        }

        public static void main(String[] args) {//====> ilk olarak main method 'a bak
            Test2 object = new Test2();//==========>1.adim object olustrurmu
            object.a();//==========>2.adim "a" methoduna git
            object.display();//abdefg
        }
    }




