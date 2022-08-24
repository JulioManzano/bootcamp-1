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
