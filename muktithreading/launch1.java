class car implements Runnable {
     public void  run() {
        try{
        System.out.println(Thread.currentThread().getName()+" Has entered the parking the lot");
        Thread.sleep(2000);
        synchronized (this){
        System.out.println(Thread.currentThread().getName()+" Got into car to drive");
        Thread.sleep(2000);
        System.out.println(Thread.currentThread().getName()+" Started the car to drive");
        Thread.sleep(2000);
        System.out.println(Thread.currentThread().getName()+" came back and parked the car");
        Thread.sleep(2000);
        }
        }
        catch (Exception e) {
            // TODO: handle exception
        }
    }
}

public class launch1 {
    public static void main(String[] args) {
        car c = new car();
        Thread t1 =new Thread(c);
        Thread t2 =new Thread(c);
        Thread t3 =new Thread(c);
        
        t1.setName("Son-1");
        t2.setName("Son-2");
        t3.setName("Son-3");
        t1.start();
        t2.start();
        t3.start();
    }
}
