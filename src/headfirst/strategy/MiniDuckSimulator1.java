package headfirst.strategy;

public class MiniDuckSimulator1{
  public static void main(String[] args){
    Duck mallard=new MallardDuck();
    mallard.display();
    mallard.performFly();
    mallard.performQuack();
    Duck modelDuck = new ModelDuck();
    modelDuck.display();
    modelDuck.performFly();
    modelDuck.performQuack();
  }
}

