package com.company;

import java.util.Arrays;
import java.util.List;

public class BubbleSort implements Strategy{
    public int[] sort (int[] nombres){
        int j = nombres.length - 1;
        int s ;
        boolean  sort = true;
        while (sort && j>0) {
            sort = false;
            for ( int k = 0; k<j; k++){
                if (nombres[k]>nombres[k+1]){
                    s= nombres[k];
                    nombres[k] = nombres[k+1];
                    nombres[k+1] = s;
                    sort = true;
                }
            }
            j = j-1;
        }
        return nombres;
    }
}
