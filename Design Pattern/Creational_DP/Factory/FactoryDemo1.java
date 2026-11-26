interface Payment{
    void pay();
}

class Bkash implements Payment{
    @Override 
    public void pay(){
        System.out.println("Payment through Bkash");
    }
}

class Nagad implements Payment{
    @Override 
    public void pay(){
        System.out.println("Payment through Nagad");
    }
}

class Rocket implements Payment{
    @Override 
    public void pay(){
        System.out.println("Payment through Rocket");
    }
}

class PaymentFactory{
    public static Payment getPayment(String type){
        if(type.equalsIgnoreCase("Bkash")){
            return new Bkash();
        }
        else if(type.equalsIgnoreCase("Nagad")){
            return new Nagad();
        }
        else if(type.equalsIgnoreCase("Rocket")){
            return new Rocket();
        }
        else{
            throw new IllegalArgumentException("Invalid payment type.");
        }
    }
}

public class FactoryDemo1 {
    public static void main(String[] args){
        Payment p1 = PaymentFactory.getPayment("Bkash");
        p1.pay();

        Payment p2 = PaymentFactory.getPayment("Nagad");
        p2.pay();

        Payment p3 = PaymentFactory.getPayment("Rocket");
        p3.pay();

        Payment p4 = PaymentFactory.getPayment("Invalid");
        p4.pay();
    }
}
