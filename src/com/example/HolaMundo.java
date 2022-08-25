package com.example;

import java.util.*;

public class HolaMundo {
    /**
     @author Julio
     * Comentario Metodo
     * @param args //Argumentos a recibir
     */
    public static void main(String[] args) {
        //Hola Mundo
        /*
        Multiples
        Lineas
        De
        Comentarios
         */
        //Funcion void
        ImprimirHolaMundo();
        //Funcion Retorno String
        System.out.println(returnHolaMundo());
        TiposDeDatos();
        //Operaciones - If
        Sumar(2,3);
        Restar(5,3);
        Dividir(8,2);
        Multiplicar(2,4);

        IterarEn(1);
        IterarEn(2);

        ListarStrings();
        Listas();
        Mapas();
    }

    private static void Mapas() {
        Map<String,String> personas = new HashMap<>();

        personas.put("1231231231","Juan Cruz");
        personas.put("312312","Julian Rodriguez");
        personas.put("213123","Roman Chialva");

        for (String key : personas.keySet()){
            System.out.println("Key: "+key);
        }
        for (String value : personas.values()){
            System.out.println("Value: "+value);
        }

        for (Map.Entry<String, String> persona : personas.entrySet()) {
            System.out.println(persona.getKey() + " = " + persona.getValue());
        }

        personas.forEach((key,value)->{
            System.out.println(key+" = "+value);
        });


    }

    private static void Listas() {

        List<String> nombres = new  ArrayList<>();
        nombres.add("Juan");
        nombres.add("Ernando");
        nombres.add("Julio");

        for (String nombre : nombres) {
            System.out.println(nombre);
        }
    }

    private static void ListarStrings() {
        String hola = "hola mundo";
        System.out.println("Cantidad de letras: "+hola.length());
        System.out.println("Todo Mayusculas: " +hola.toUpperCase());
        System.out.println("Todo Minusculas: "+hola.toLowerCase());
        System.out.println("Quitar espacios: "+hola.trim());
    }

    private static void IterarEn(int n){
        switch (n){
            case 1: Bucles.bucleWhile(7); break;
            case 2: Bucles.bucleFor(7); break;
        }
    }
    private static void Dividir(double a, double b) throws NumberFormatException{
        try{
            if(b == 0){
                throw new NumberFormatException();
            }
            System.out.println(a/b);
        }
        catch(Error e){
            throw new NumberFormatException();
        }
    }

    private static void Restar(double a, double b) {
        System.out.println(a-b);
    }

    private static void Sumar(double a, double b) {
        System.out.println(a+b);
    }

    private static void Multiplicar(double a, double b) {
        System.out.println(a*b);

    }

    private static void ImprimirHolaMundo() {
        System.out.println("Hola Mundo");
    }
    private static String returnHolaMundo(){
        return "Hola Mundo";
    }
    private static void TiposDeDatos() {
        byte number1 = 1;
        short number2 = 2;
        int number3 = 3;
        long number4 = 4;

        float decimal1 = 4.9f;
        double decimal2 = 32.3d;

        boolean verdader = true;
        boolean falso = false;

        String nombre = "Juan";
        Integer numero5 =  2;
        Integer numero6 = null;
        Long numero7 = 2L;
    }
}
