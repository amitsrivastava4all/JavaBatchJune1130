package com.srivastava.apps;

class XQuantity {
    
    
    
    boolean isProduce = false; // Production not Done
    int quan;
    
    synchronized void put(int quan) {
        if(isProduce) {
            try {
                this.wait();
            } catch (InterruptedException e) {
                System.out.println("In Put "+e);
                e.printStackTrace();
            }
        }
        this.quan = quan;
        System.out.println("Quantity Put By Producer "+this.quan);
        isProduce = true;
        this.notify();
    }
    synchronized int get() {
        if(isProduce==false) {
            try {
                this.wait();
            } catch (InterruptedException e) {
                System.out.println("In Get "+e);
                e.printStackTrace();
            }
            
        }
        System.out.println("Quantity Get By Consumer "+this.quan);
        isProduce = false;
        notify();
        return this.quan;
    }
    
}
class Producer1 implements Runnable {
    XQuantity quan = null;
    Producer1 (XQuantity q) {
        this.quan = q;
        Thread t = new Thread(this,"Producer");
       // t.setPriority(Thread.MAX_PRIORITY);
        //t.run();
        //t.setDaemon(true);
        t.start();
       // t.start();
        //t.isAlive();
    }
    public void run() {
        int i = 0;
        while(true) {
            this.quan.put(i++);
        }
    }
}
class Consumer1 implements Runnable {
    XQuantity quan = null;
    Consumer1 (XQuantity q) {
        this.quan = q;
        Thread t = new Thread(this,"Consumer");
        t.start();
    }
    public void run() {
        int i = 0;
        while(true) {
        	//Thread.yield();
//        	try {
//				//Thread.sleep(1000);
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
            this.quan.get();
        }
    }
}
public class InterThread {
    public InterThread() {
    }

    public static void main(String[] args) {
        XQuantity obj = new XQuantity();
        Producer1 producer = new Producer1(obj);
        Consumer1 consumer = new Consumer1(obj);
        
    }
}
