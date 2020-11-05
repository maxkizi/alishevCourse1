package Threading.lesson28;

import java.util.Random;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Persson {
    private Account account1 = new Account();
    private Account account2 = new Account();

    private Lock lock1 = new ReentrantLock();
    private Lock lock2 = new ReentrantLock();


    public synchronized void firstThread() {
        Random random = new Random();
        for (int i = 0; i < 10000; i++) {
//            lock1.lock();
//            lock2.lock();
            try{
                Account.transfer(account2, account1, random.nextInt(100));
            }finally {
//                lock2.unlock();
//                lock1.unlock();
            }
        }
    }

    public synchronized void secondThread() {
        Random random = new Random();
        for (int i = 0; i < 10000; i++) {
//            lock1.lock();
//            lock2.lock();
            try{
                Account.transfer(account1, account2, random.nextInt(100));
            }finally {
//                lock2.unlock();
//                lock1.unlock();
            }
        }
    }

    public void finished() {
        System.out.println(account1.getBalance());
        System.out.println(account2.getBalance());
        System.out.println("Total balance is " + (account2.getBalance() + account1.getBalance()));

    }

}
