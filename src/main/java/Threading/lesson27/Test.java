package Threading.lesson27;

import java.util.concurrent.*;

public class Test {
    public static void main(String[] args) throws InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(20);
        for (int i = 0; i < 20; i++){
            executorService.submit(new Runnable() {
                @Override
                public void run() {
                    Connection connection = Connection.getConnection();
                    connection.work();
                }
            });
        }

        executorService.shutdown();
        executorService.awaitTermination(1000, TimeUnit.DAYS);
    }
}
