package Singlton;


import org.testng.log4testng.Logger;

public class SingltonThread {

    private final Logger LOGGER = Logger.getLogger(this.getClass());
    private final static Logger LOGGER2 = Logger.getLogger(SingltonThread.class);

    public static void main(String[] args) throws InterruptedException {

        final int SIZE = 1000;
        Thread t[] = new Thread[SIZE];
        for (int i = 0; i < SIZE; i++) {
            t[i] = new Thread(new R());
            t[i].start();
        }
        for (int i = 0; i < SIZE; i++) {
            t[i].join();
        }
        LOGGER2.info(Singlton.counter);

    }

    static class R implements Runnable {
        @Override
        public void run() {
            Singlton.getInstance();
        }
    }

    static class Singlton {
        static int counter = 0;
        private static volatile Singlton instance;

        private Singlton() {
            counter++;
        }

        public static Singlton getInstance() {
            if(instance==null){
                synchronized (Singlton.class){
                    if (instance==null){
                        instance=new Singlton();
                    }
                }
            }
            return instance;
        }
    }





}




