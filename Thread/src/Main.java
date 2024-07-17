public class Main {
    public static void main(String[] args) {
        KronometreThread kt1 = new KronometreThread("Thread 1");
        KronometreThread kt2 = new KronometreThread("Thread 2");
        KronometreThread kt3 = new KronometreThread("Thread 3");

        kt1.start();
        kt2.start();
        kt3.start();
    }
}