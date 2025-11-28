class ThreadSayHii extends Thread{
    public void run(){
        for(int i = 0 ; i < 10; i++){
            System.out.println("HII");

//            try {
//                Thread.sleep(10);
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }
        }}
}// In order to create a thread we have to extends the thread class
class ThreadSayHello extends Thread{
    public void run(){
        for(int i = 0 ; i < 10; i++){
            System.out.println("Hello");
//            try {
//                Thread.sleep(9);
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }
        }
    }
}

public class O85_Threads {
    public static void main(String[] args) throws InterruptedException {
        ThreadSayHii obj1 = new ThreadSayHii();
        ThreadSayHello obj2 = new ThreadSayHello();

        // in order to start the thread we have to use .start() method of thread class
        // this .start() method calls the .run() method to run the thread
        // hence your thread class must have a run() method
        obj1.start();
        obj1.join();// wait for thread1 to complete before running the other thread
        obj2.start();
        obj2.join();


        obj2.setPriority(Thread.MAX_PRIORITY);// this is from main thread

        System.out.println(obj1.getPriority());
        System.out.println(obj2.getPriority());



    }
}
