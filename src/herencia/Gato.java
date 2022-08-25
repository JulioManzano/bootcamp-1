package herencia;

public class Gato extends Animal {
    String pedigri;

    public Gato(String nombre, int edad) {
        super(nombre, edad);
    }

    public  void maullar(){
        System.out.println("Miau Miau! ");
    }
    public void comer(){
        System.out.println("Comiendo como gato");
    }
    public void caminar(){
        System.out.println("Caminando como gato");
    }
}
