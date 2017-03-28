package com.sd.sort.v0;

public class Stringsort{
  String data2[];
  public Stringsort(String d[]){
    this.data2=d;
  }
  public void result(String data2[]){
    for(int i=data2.length-1;i>=0;i--) {
    int indexOfMax=0;
    for(int j=1;j<=i;j++) {
        if(data2[j].compareTo(data2[indexOfMax])>0)
            indexOfMax=j;
    }
    String temp=data2[i];
    data2[i]=data2[indexOfMax];
    data2[indexOfMax]=temp;
}

for(int i=0; i<data2.length; i++)
    System.out.println("data2["+i+"]="+data2[i]);
  }
}