package Threading.lesson18;

public class Test {
    public static void main(String[] args) {
//        MyThread myThread = new MyThread();
//        myThread.start();
//
//        MyThread myThread1 = new MyThread();
//        myThread1.start();

        Thread thread = new Thread(new Runner());
        thread.start();
    }
}

class Runner implements Runnable{

    @Override
    public void run() {
        for (int i = 0; i < 1000; i++){
            System.out.println("Hello from MyThread" + i );
        }
    }
}


class MyThread extends Thread{
    public void run(){
        for (int i = 0; i < 1000; i++){
            System.out.println("Hello from MyThread" + i );
        }
    }
}
