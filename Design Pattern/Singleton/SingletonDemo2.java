class Singleton{
    //private static instance
    private static Singleton instance = null;
    //private int counter
    private int counter = 0;
    
    //private constructor
    private Singleton(){
        counter++;
        System.out.println("Singleton isntance created!");
    }

    //Static method to get instance
    public static Singleton getInstance(){
        try{
            if(instance == null){
                instance = new Singleton();
            }
            return instance;
        }
        catch(Exception e){
            System.out.println("Error occurred while creating Singleton instance.");
        }
        return instance;
    }

    //Method to show message
    public void showMessage(String message){
        System.out.println(message);
    }

    public int getCounter(){
        return counter;
    }
}

public class SingletonDemo2 {
    public static void main(String[] args){

        //Get the only object available
        Singleton s1 = Singleton.getInstance();
        s1.showMessage("You can create only one instance.");
        //Create another instance
        Singleton s2 = Singleton.getInstance();
        s2.showMessage("Here you are.");

        //Check if both are same instances
        System.out.println("Counter Value: " +Singleton.getInstance().getCounter());
    }
}
