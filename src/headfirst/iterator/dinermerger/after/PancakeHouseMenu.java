package headfirst.iterator.dinermerger.after;
import java.util.ArrayList;
public class PancakeHouseMenu implements Menu{
  ArrayList menuItems;
  public PancakeHouseMenu(){
    menuItems=new ArrayList();
    addItem("BLT","Bacon, Lettuce, Tomato",true, 2.99);
    addItem("Salad","Salad, Lettuce, Tomato",true, 2.99);
  }
  public void addItem(String n, String d,boolean v, double p){
    MenuItem m=new MenuItem(n,d,v,p);
    menuItems.add(m);
  }
  public ArrayList getMenuItem(){
    return menuItems;
  }
  public Iterator createIterator(){
    return new PancakeHouseMenuIterator(menuItems);
  }
  
}