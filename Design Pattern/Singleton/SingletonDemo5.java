//Double-Locker Singleton Implementation
class SimpleCalc{
    int a; int b;
    private static SimpleCalc obj = null;

    private SimpleCalc(){
        System.out.println("Calcualtor created successfully.");
    }

    public static SimpleCalc getInstance(){
        if(obj == null){
            synchronized (SimpleCalc.class){
                if(obj == null){
                obj = new SimpleCalc();
                }
            }
        }
        return obj;
    }

    public int sum(){
        return a+b;
    }
}

public class SingletonDemo5 {
    public static void main(String[] args){
        Thread t1 = new Thread(() ->{
            SimpleCalc c1 = SimpleCalc.getInstance();
            c1.a = 5; c1.b = 10;
            System.out.println("Sum = " + c1.sum());
        });

        Thread t2 = new Thread(() ->{
            SimpleCalc c2 = SimpleCalc.getInstance();
            c2.a = 15; c2.b = 20;
            System.out.println("Sum = " + c2.sum());
        });

        Thread t3 = new Thread(() ->{
            SimpleCalc c3 = SimpleCalc.getInstance();
            c3.a = 25; c3.b = 30;
            System.out.println("Sum = " + c3.sum());
        });

        Thread t4 = new Thread(() ->{
            SimpleCalc c4 = SimpleCalc.getInstance();
            c4.a = 35; c4.b = 40;
            System.out.println("Sum = " + c4.sum());
        });

        Thread t5 = new Thread(() ->{
            SimpleCalc c5 = SimpleCalc.getInstance();
            c5.a = 45; c5.b = 50;
            System.out.println("Sum = " + c5.sum());
        });

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
    }
}
