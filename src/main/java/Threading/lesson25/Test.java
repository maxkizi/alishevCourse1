package Threading.lesson25;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Test {
    public static void main(String[] args) throws InterruptedException {
        CountDownLatch countDownLatch = new CountDownLatch(3);

        ExecutorService executorService = Executors.newFixedThreadPool(3);
        for(int i = 0; i < 3; i++){
            executorService.submit(new Processor(countDownLatch));
        }
        executorService.shutdown();
        countDownLatch.await();
        System.out.println("Latch has been opened, main thread is proceeding");
    }
}