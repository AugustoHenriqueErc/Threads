//import java.util.Vector;
public class Main {
    public static void main(String[] args) {
        //Vector<Integer> v = new Vector<>();
        A a = new A();
        B b = new B();

        System.out.printf("Testing sequencial process C, D\n");
        C.run();
        D.run();
        System.out.printf("Testing paralel process, threads A, B priority: %d, %d\n",a.getPriority(), b.getPriority());
        a.start();
        b.start();
//        a.setPriority(10);
//        b.setPriority(1);
//        System.out.printf("Testing paralel process, threads A, B priority: %d, %d\n",a.getPriority(), b.getPriority());
//        b.start();
//        a.start();

    }
}