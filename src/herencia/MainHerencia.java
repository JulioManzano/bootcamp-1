package herencia;

public class MainHerencia {

    public static void main(String[] args) {
        Animal gato = new Gato("Michi", 3);
        Animal animal = new Animal("Pajaro",2);
        Perro perro = new Perro("Lucky", 3);

        perro.ladrar();
        gato.caminar();
        animal.caminar();
    }
}
