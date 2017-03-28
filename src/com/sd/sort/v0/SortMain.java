package com.sd.sort.v0;

public class SortMain{
  public static void main(String[] args){
    Integer[] data={new Integer(5), new Integer(1), new Integer(4), new Integer(2)};
    Integersort Is= new Integersort(data);
    System.out.println("Integer 순서대로 정렬: ");
    Is.result(data);
    String[] data2={"Lee", "Bang", "Lim", "kang", "Yu"};
    Stringsort ss=new Stringsort(data2);
    System.out.println("String 순서대로 정렬: ");
    ss.result(data2);
  }
}
    