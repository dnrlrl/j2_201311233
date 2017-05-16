package headfirst.singleton.dcl;

public class Singleton{
  //private static Singleton uniqueInstance;
  private volatile static Singleton uniqueInstance;
  private static int numCalled=0;
  private Singleton(){
  }
  //public static synchronized Singleton getInstance(){
  public static Singleton getInstance(){
    if(uniqueInstance==null){
      synchronized(Singleton.class){
        if(uniqueInstance==null){
          System.out.println("Creating");
          uniqueInstance=new Singleton();
        }
      }
    }
    //System.out.println("Creating");
      //uniqueInstance=new Singleton();
      System.out.println("Returning ");
      System.out.println("number called "+numCalled++);
      return uniqueInstance;
  }
}