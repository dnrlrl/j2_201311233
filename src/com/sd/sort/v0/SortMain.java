package com.sd.sort.v0;

public class SortMain{
  public static void main(String[] args){
    Integer[] data={new Integer(5), new Integer(1), new Integer(4), new Integer(2)};
    Integersort Is= new Integersort(data);
    System.out.println("Integer ������� ����: ");
    Is.result(data);
    String[] data2={"Lee", "Bang", "Lim", "kang", "Yu"};
    Stringsort ss=new Stringsort(data2);
    System.out.println("String ������� ����: ");
    ss.result(data2);
  }
}
    