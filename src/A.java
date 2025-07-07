public class A extends Thread {
    @Override
    public void run(){
        for (int i = 0; i < 500; i++) {
            System.out.print("A");
        }
        System.out.println();
    }
}
