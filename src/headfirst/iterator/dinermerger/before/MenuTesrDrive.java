package headfirst.iterator.dinermerger.before;

import java.util.ArrayList;
public class MenuTesrDrive{
  public static void main(String args[]){
    PancakeHouseMenu p=new PancakeHouseMenu();
    DinerMenu d=new DinerMenu();
    ArrayList breakfast=p.getMenuItem();
    for(int i=0;i<breakfast.size();i++){
      MenuItem m=(MenuItem)breakfast.get(i);
      System.out.print(m.getName());
      System.out.println("\t\t"+m.getPrice());
      System.out.println("\t"+m.getDescription());
    }
    MenuItem[] lunch=d.getMenuItems();
    for(int i=0;i<lunch.length;i++){
      MenuItem m=lunch[i];
      System.out.print(m.getName());
      System.out.println("\t\t"+m.getPrice());
      System.out.println("\t"+m.getDescription());
    }
  }
}