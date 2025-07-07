public class B extends Thread {
    @Override
    public void run(){
        for (int i = 0; i < 500; i++) {
            System.out.print("B");
        }
        System.out.println();
    }
}
