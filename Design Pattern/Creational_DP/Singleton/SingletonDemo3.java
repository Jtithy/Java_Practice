//Eager Singleton Implementation

class Calculator{
    int a; int b;
    private static Calculator obj = new Calculator();

    private Calculator(){
        System.out.println("Calcualtor for Summation.");
    }

    public static Calculator getInstance(){
        if(obj == null){
            obj = new Calculator();
        }
        return obj;

    }

    public int sum(){
        return a+b;
    }
}

public class SingletonDemo3 {
    public static void main(String[] args){
        Calculator c1 = Calculator.getInstance();
        c1.a = 10; c1.b = 20;
        System.out.println("Sum: "+c1.sum());

        Calculator c2 = Calculator.getInstance();
        c2.a = 30; c2.b = 40;
        System.out.println("Sum: "+c2.sum());
    }
}
