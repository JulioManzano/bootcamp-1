package herencia;

public class Animal {
    String nombre;
    int edad;

    public Animal(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }
    public void caminar(){
        System.out.println("Caminar como animal");
    }
    public void comer(){
        System.out.println("Comiendo como animal");
    }
}
