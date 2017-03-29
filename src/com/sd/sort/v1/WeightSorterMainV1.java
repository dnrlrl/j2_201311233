package com.sd.sort.v1;
import java.util.Arrays;

public class WeightSorterMainV1 {
    public static void main(String[] args){
        Weight[] weights=new Weight[3];
        weights[0]=new Weight(55);
        weights[1]=new Weight(45);
        weights[2]=new Weight(75);
        Arrays.sort(weights);
        for(Weight w:weights)
            System.out.println(w.toString());
    }
}