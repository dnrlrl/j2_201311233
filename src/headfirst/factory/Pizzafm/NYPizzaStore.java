package headfirst.factory.Pizzafm;

public class NYPizzaStore extends PizzaStore{
  Pizza createPizza(String item) {
    Pizza pizza =null;
    if (item.equals("cheese")) {
      pizza = new NYStyleCheesePizza();
    }
    else if(item.equals("veggie")){
      pizza=new NYStyleCheesePizza();
    }
    else if(item.equals("clam")){
      pizza=new NYStyleCheesePizza();
    }
    else if(item.equals("pepperoni")){
      pizza=new NYStyleCheesePizza();
    }
    return pizza;
  }
}