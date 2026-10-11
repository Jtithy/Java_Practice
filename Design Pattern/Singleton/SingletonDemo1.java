class SingletonDemo {
    //private static instance
    private static SingletonDemo instance = null;
    int counter = 0;
    //private constructor
    private SingletonDemo(){
        
        counter++;
        System.out.println("Singleton instance created!");
    }

    //static method to get istance
    public static SingletonDemo getInstance(){
        if(instance == null){
            instance = new SingletonDemo();
        }
        return instance;
    }
}

public class SingletonDemo1{
    public static void main(String[] args) {
        //Available object
        SingletonDemo obj1 = SingletonDemo.getInstance();
        SingletonDemo obj2 = SingletonDemo.getInstance();
        SingletonDemo obj3 = SingletonDemo.getInstance();

        System.out.println(SingletonDemo.getInstance().counter);

        //Check if all are same instances
        if(obj1 == obj2 && obj2 == obj3){
            System.out.println("All are same instances.");
        }
    }
}