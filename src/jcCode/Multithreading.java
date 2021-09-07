package jcCode;

class Controller {

    public static void main(String[] args) {
        System.out.println("Main method start");

        MultiThreading thread = new MultiThreading("JC First Thread");
        MultiThreading thread2 = new MultiThreading("JC Second Thread");
        MultiThreading thread3 = new MultiThreading("JC Third Thread");
        System.out.println("Main method end");
    }

}

class MultiThreading implements Runnable {
    Thread thread;

    public MultiThreading(String name) {
        thread = new Thread(this, name);
        thread.start();
    }

    @Override
    public void run() {
        try{

            for(int loop = 0; loop <= 5; loop++) {
                System.out.println("Hello Multithreading" + thread.getName());
                Thread.sleep(200);
            }
        }

        catch(InterruptedException exc) {
            System.out.println(thread.getName() +" interrupted");
        }
    }
}
