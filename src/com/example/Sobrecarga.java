package com.example;

public class Sobrecarga {

    public static void sobrecarga(){
        System.out.println("Hola Mundo");
    }
    public static void sobrecarga(String saludo){
        System.out.println(saludo);
    }
    public static void sobrecarga(String saludo, String nombre){
        System.out.println(saludo+" "+nombre);

    }
    public static int sobrecarga(int a, int b){
        System.out.println("Sumatoria: ");
        return a + b ;
    }

}
