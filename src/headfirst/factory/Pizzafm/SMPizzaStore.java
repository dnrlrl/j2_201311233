package headfirst.factory.Pizzafm;

public class SMPizzaStore extends PizzaStore{
  Pizza createPizza(String item) {
    Pizza pizza =null;
    if (item.equals("cheese")) {
      pizza = new SMStylepotatoPizza();
    }
    else if(item.equals("veggie")){
      pizza=new SMStylepotatoPizza();
    }else if(item.equals("clam")){
      pizza=new SMStylepotatoPizza();
    }else if(item.equals("pepperoni"))
      pizza=new SMStylepotatoPizza();
    return pizza;
  }
}