package com.example;

public class Bucles {

    public static void bucleFor(int n){
        for (int i = 0; i < n; i++) {
            System.out.println("For-Numero: "+i);
        }
    }
    public static void bucleWhile(int n){
        int i = 0;
        while(i<n){
            if(i == 4) continue;

            System.out.println("While-Numero: "+i);
            i++;
        }
    }
}
