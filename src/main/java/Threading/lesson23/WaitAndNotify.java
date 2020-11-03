package Threading.lesson23;

import java.util.Scanner;

public class WaitAndNotify {
    public void produce() throws InterruptedException {
        synchronized (this) {
            System.out.println("Producer thread is started...");
            wait();// 1- отдаем монитор, 2- ждем пока будет вызван notify();
            System.out.println("Producer thread is resumed...");
        }
    }

    public void consume() throws InterruptedException {
        Thread.sleep(2000);
        Scanner scanner = new Scanner(System.in);

        synchronized (this){
            System.out.println("Waiting for return key pressed");
            scanner.nextLine();
            notify();
        }
    }
}
