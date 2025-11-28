//Runnale is a Interface whereas thread is a class
// Runnable is more prefered than thread because java doesnot support multiple inharitance so you can implement many interface but extend only one class
// we can both extend a class and implement Runnable in java
//example //

// NOTE: the runnable interface will not have the Thread Methods
//        Therefor : we need to create the saperate thread object to use it
class Counter implements Runnable{
    public void run(){
        for(int i = 0 ; i < 10 ;i++){
            System.out.println(i);
        }
    }
}
class hello implements Runnable {
    public void run(){
        for(int i = 0 ; i < 10; i++){
            System.out.println("Hello");
        }
    }
}

//IMP NOTE:  Runnable internally is a functional interface
// so we can directly create a annonymous class out of it
public class O88_RunnableVS_thread {

    public static void main(String[] args) {
        // in order to run the runnalbe thread we have to pass the runnable object
        // to the thread
        Runnable obj = new Counter();// 1st creating object
        Runnable obj1 =new hello();
        Thread t1 = new Thread(obj);// now passing the object to the saperate Thread
        Thread t2 = new Thread(obj1);

        t1.start();
        t2.start();

        Runnable AnnonymousObj = new Runnable() {
            @Override
            public void run() {
                for(int i  = 0 ; i < 5; i ++){
                    System.out.println("This is Annonymous class");
                }
            }
        };
        Thread t3 = new Thread(AnnonymousObj);
        t3.start();

        // we can also create a thread using lembda expression
        Runnable obj3 = ()-> {
            for (int i = 0; i < 10; i++) {
                System.out.println("lembda Expression");
            }

        };
        Thread t4 = new Thread(obj3);
        t4.start();

    }
}
