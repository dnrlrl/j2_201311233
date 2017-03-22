package headfirst.strategy;
public abstract class Duck {
  FlyBehavior flyBehavior;
  QuackBehavior quackBehavior;
  public Duck(){
  }
  public void setFlyBehavior(FlyBehavior fb){
    flyBehavior=fb;
  }
  public void setQuackBehavior(QuackBehavior qb){
    quackBehavior=qb;
  }
  public void performFly(){
    flyBehavior.fly();
  }
  abstract void display();
  public void performQuack(){
    quackBehavior.quack();
  }
}
