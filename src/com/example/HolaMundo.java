package com.example;

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
        ImprimirHolaMundo();
        TiposDeDatos();
    }

    private static void ImprimirHolaMundo() {
        System.out.println("Hola Mundo");
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
