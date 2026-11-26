//Synchronized(Thread-safe) Singleton Implementation

class SimpleCalculator{
    int a; int b;
    private static SimpleCalculator obj = null;

    private SimpleCalculator(){
        System.out.println("Calcualtor created.");
    }

    public synchronized static SimpleCalculator getInstance(){
        if(obj == null){
            obj = new SimpleCalculator();
        }
        return obj;

    }

    public int sum(){
        return a+b;
    }
}

public class SingletonDemo4 {
    public static void main(String[] args){
        Thread t1 = new Thread(() -> {
            SimpleCalculator c1 = SimpleCalculator.getInstance();
            c1.a = 5; c1.b = 10;
            System.out.println("Sum = " + c1.sum());
        });

        Thread t2 = new Thread(() -> {
            SimpleCalculator c2 = SimpleCalculator.getInstance();
            c2.a = 15; c2.b = 20;
            System.out.println("Sum = " + c2.sum());
        });



        t1.start();
        t2.start();
    }  
}

