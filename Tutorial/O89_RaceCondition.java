// Race condition occurs when tow or more thread access shared data at the same time
// without synchronization
//-> this lead inconsistant or unexpected result
class NCounter {
    int count= 0 ;
    synchronized void increment(){
        count++;
    }
}

public class O89_RaceCondition {
    public static void main(String[] args) throws InterruptedException {
        NCounter c = new NCounter();

        Thread t1 = new Thread(() -> {
            for(int i=0; i<10000; i++) c.increment();// single line for loop
        });

        Thread t2 = new Thread(()->{
            for(int i = 0 ; i < 10000;i++) {
                c.increment();
            }
        });
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println(c.count);// this will give us some incorrect outpupt
//        as increment will not happen if tow thread tries to increse count together
        // to solve this we use synchronized in the method name



    }
}
