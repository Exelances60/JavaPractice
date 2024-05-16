public class KronometreThread implements Runnable {
    private Thread thread;
    private String threadName;

    public KronometreThread(String threadName) {
        this.threadName = threadName;
        System.out.println("Thread oluşturuluyor: " + threadName);
    }

    @Override
    public void run() {
        System.out.println("Thread çalıştırılıyor: " + threadName);
        for (int i = 0; i < 10; i++) {
            try {
                System.out.println(threadName + ": " + i);
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Thread kesintiye uğradı: " + threadName);
            }
        }
        System.out.println("Thread bitti: " + threadName);
    }
    public void start() {
        System.out.println("Thread çalıştırılıyor: " + threadName);
        if (thread == null) {
            thread = new Thread(this, threadName);
            thread.start();
        }
    }
}
