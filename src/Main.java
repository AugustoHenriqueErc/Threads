//import java.util.Vector;
public class Main {
    public static void main(String[] args) {
        //Vector<Integer> v = new Vector<>();
        A a = new A();
        B b = new B();

        System.out.println("Testing sequencial process C, D");
        C.run();
        D.run();
        System.out.println("Testing paralel process, threads A, B");
        a.start();
        b.start();

    }
}