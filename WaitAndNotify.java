public class WaitAndNotify {
    public static void main(String[] args) {
        Alpha obj = new Alpha();
        FirstThread th1 = new FirstThread("Thread", obj);
        SecondThread th2 = new SecondThread("", obj);
        th1.t.start();
        try{
            Thread.sleep(1000);
        }
        catch(InterruptedException e) {

        }
        th2.t.start();
        try {
            th1.t.join();
            th2.t.join();
        }   
        catch(InterruptedException e) {
            System.out.println("Thread Interrupted");
        }

    }
}
class Alpha {
    synchronized void sleepermeth(String name, int i) {
        System.out.println(name + " : " + i);
        try {
            wait();
        }
        catch(InterruptedException e) {
            System.out.println("Thread Interrupted");
        }
    }
    synchronized void wakermeth()  {
        notify();
    }
}
class FirstThread implements Runnable {
    Thread t;
    String name;
    Alpha obj;
    FirstThread(String name, Alpha obj) {
        this.t = new Thread(this, name);
        this.name = name;
        this.obj = obj;
    }
    @Override
    public void run() {
        for(int i = 1; i < 6; i++){
            this.obj.sleepermeth(this.name, i);
            try {
                Thread.sleep(1000);
            }
            catch(InterruptedException e) {
                System.out.println("Thread Interrupted");
            }
        }
        
    }
}
class SecondThread implements Runnable {
    Thread t;
    String name;
    Alpha obj;
    SecondThread(String name, Alpha obj) {
        this.t = new Thread(this, name);
        this.name = name;
        this.obj = obj;
    }
    @Override
    public void run() {
        for(int i = 1; i < 8; i++){
            this.obj.wakermeth();
            try {
                Thread.sleep(1000);
            }
            catch(InterruptedException e) {
                System.out.println("Thread Interrupted");
            }
        }
    }
}
