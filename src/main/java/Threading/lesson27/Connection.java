package Threading.lesson27;

import java.util.concurrent.Semaphore;

public class Connection {
    private static Connection connection = new Connection();
    private int connectionsCount;
    private Semaphore semaphore = new Semaphore(10);

    private Connection() {
    }


    public static Connection getConnection() {
        return connection;
    }

    public void doWork()  {
        synchronized (this) {
            System.out.println("увеличиваю...");
            connectionsCount++;
            System.out.println(connectionsCount);
        }

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        synchronized (this) {
            System.out.println("уменьшаю...");
            connectionsCount--;
            System.out.println(connectionsCount);
        }

    }

    public void work()  {

        try {
            semaphore.acquire();
            doWork();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        finally {
            semaphore.release();
        }
    }
}
