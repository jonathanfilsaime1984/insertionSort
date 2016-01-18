package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        int[] a = {200,1,2,3,4,6,7,8,9,15,5,12,10,13,50,45,32,100,};

        for(int i = 0 ; i < a.length ; i++){
            int key = a[i];
            int j = i - 1;

            while(j >= 0 && a[j] >= key) {
                a[j + 1] = a[j];
                j = j - 1;
            }

            a[ j + 1 ] = key;
        }


        for(int i = 0; i < a.length; i++){
            System.out.print(a[i] + ",");
        }
    }
}
