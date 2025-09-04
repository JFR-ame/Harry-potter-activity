package hechizos;

public class Expelliarmus implements Hechizo {
    @Override
    public void ejecutar() {
        System.out.println("¡Expelliarmus! El enemigo suelta su varita.");
    }
}