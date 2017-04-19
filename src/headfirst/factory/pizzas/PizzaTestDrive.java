package headfirst.factory.pizzas;

public class PizzaTestDrive{
  public static void main(String[] args){
    SimplePizzaFactory f=new SimplePizzaFactory();
    PizzaStore store= new PizzaStore(f);
    
    Pizza pizza=store.orderPizza("cheese");
    System.out.println("We ordered a "+pizza.getName()+ "\n");
    
    Pizza pizza2=store.orderPizza("potato");
    System.out.println("We ordered a "+pizza2.getName()+ "\n");
  }
}