//Decorator Design Pattern Example

//Component Interface
interface Pizza {

    String getDescription();

    double getCost();
}

//Contrete Component Class
class SimplePizza implements Pizza {

    @Override
    public String getDescription() {
        return "Simple Pizza";
    }

    @Override
    public double getCost() {
        return 150.00;
    }
}

//Decorator Abstract Class
abstract class PizzaDecorator implements Pizza {

    protected Pizza pizza;

    public PizzaDecorator(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public String getDescription() {
        return pizza.getDescription();
    }

    @Override
    public double getCost() {
        return pizza.getCost();
    }
}

//Contrete Decorator Class
class Cheese extends PizzaDecorator {

    public Cheese(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", Extra Cheese";
    }

    @Override
    public double getCost() {
        return super.getCost() + 50.00;
    }
}

class Pepperoni extends PizzaDecorator {

    public Pepperoni(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", Pepperoni";
    }

    @Override
    public double getCost() {
        return super.getCost() + 70.00;
    }
}

class Olives extends PizzaDecorator {

    public Olives(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", Olives";
    }

    @Override
    public double getCost() {
        return super.getCost() + 40.00;
    }
}

//Client Class
public class DecoratorDemo1 {

    public static void main(String[] args) {
        Pizza pizza = new SimplePizza();
        System.out.println(pizza.getDescription() + " Cost: " + pizza.getCost());

        pizza = new Cheese(pizza);
        System.out.println(pizza.getDescription() + " Cost: " + pizza.getCost());

        pizza = new Pepperoni(pizza);
        pizza = new Olives(pizza);
        System.out.println(pizza.getDescription() + " Cost: " + pizza.getCost());
    }
}
