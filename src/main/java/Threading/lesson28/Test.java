package Threading.lesson28;

public class Test {
    public static void main(String[] args) throws InterruptedException {

        Persson person1 = new Persson();

        Thread  thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                person1.firstThread();
            }
        });

        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                person1.secondThread();
            }
        });

        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();

        person1.finished();
    }
}
