package headfirst.factory.Pizzafm;

public class PizzaTestDrive{
  public static void main(String[] args){
    PizzaStore nyStore = new NYPizzaStore();
    PizzaStore SMStore = new SMPizzaStore();
    Pizza pizza = nyStore.orderPizza("cheese");
    System.out.println("Ethan ordered a " + pizza.getName() + "\n");
    pizza = SMStore.orderPizza("cheese");
    System.out.println("Joel ordered a " + pizza.getName() + "\n");
    pizza = nyStore.orderPizza("clam");
    System.out.println("Ethan ordered a " + pizza.getName() + "\n");
    pizza = SMStore.orderPizza("clam");
    System.out.println("Joel ordered a " + pizza.getName() + "\n");
    pizza = nyStore.orderPizza("pepperoni");
    System.out.println("Ethan ordered a " + pizza.getName() + "\n");
    pizza = SMStore.orderPizza("pepperoni");
    System.out.println("Joel ordered a " + pizza.getName() + "\n");
    pizza = nyStore.orderPizza("veggie");
    System.out.println("Ethan ordered a " + pizza.getName() + "\n");
    pizza = SMStore.orderPizza("veggie");
    System.out.println("Joel ordered a " + pizza.getName() + "\n");
  }
}