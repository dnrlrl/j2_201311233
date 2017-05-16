package headfirst.singleton.stat;

public class Singleton{
  private static Singleton uniqueInstance=new Singleton();;
  private static int numCalled=0;
  private Singleton(){}
  public static Singleton getInstance(){
    System.out.println("Returning ");
    System.out.println("number called "+numCalled++);
    return uniqueInstance;
  }
}