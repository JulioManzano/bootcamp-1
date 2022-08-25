package herencia;

public class Perro extends Animal{
    String raza;

    public Perro(String nombre, int edad) {
        super(nombre, edad);
    }

    public void ladrar(){
        System.out.println("Guau Guau !");
    }

    @Override
    public void caminar(){
        System.out.println("Caminando como perro");
    }
}
