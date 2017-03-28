package com.sd.sort.v0;

public class Integersort{
  Integer data[];
  public Integersort(Integer d[]){
    this.data=d;
  }
  public void result(Integer data[]){
    for(int i=data.length-1;i>=0;i--) {
    int indexOfMax=0;
    for(int j=1;j<=i;j++) {
        if(data[j] > data[indexOfMax])
            indexOfMax=j;
        }
    Integer temp=data[i];
    data[i]=data[indexOfMax];
    data[indexOfMax]=temp;
    }
    for(int i=0; i<data.length; i++)
      System.out.println("data["+i+"]="+data[i]);
  }
}