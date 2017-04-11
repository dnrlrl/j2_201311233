package headfirst.decorator.starbuzz;

public class StarbuzzCoffee{
  public static void main(String args[]){
    Beverage be=new Espresso();
    System.out.println(be.getDescription()+" $"+be.cost());
    
    Beverage be2=new DarkRoast();
    be2=new Mocha(be2);
    be2=new Mocha(be2);
    be2=new Whip(be2);
    String cost=String.format("%.2f",be2.cost());
    System.out.println(be2.getDescription()+" $"+cost);
    
    Beverage be3=new HouseBlend();
    be3=new Soy(be3);
    be3=new Mocha(be3);
    be3=new Whip(be3);
    String cost2=String.format("%.2f",be3.cost());
    System.out.println(be3.getDescription()+" $"+cost2);
    
    Beverage be4=new CaramelMacchiato();
    be4=new Soy(be4);
    be4=new Mocha(be4);
    be4=new Whip(be4);
    String cost3=String.format("%.2f",be4.cost());
    System.out.println(be4.getDescription()+" $"+cost3);
  }
}