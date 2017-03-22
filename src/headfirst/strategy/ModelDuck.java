package headfirst.strategy;

public class ModelDuck extends Duck{
  public ModelDuck(){
    setFlyBehavior(new FlyRocketPowered());
    setQuackBehavior(new Quack());
    //flyBehavior=new FlyWithWings();
  }
  public void display(){
    System.out.println("Model...");
  }
}