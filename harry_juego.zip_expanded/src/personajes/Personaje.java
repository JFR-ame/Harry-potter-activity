package personajes;

import hechizos.Hechizo;

public abstract class Personaje {
    protected String nombre;
    protected Hechizo hechizo;

    public Personaje(String nombre, Hechizo hechizo) {
        this.nombre = nombre;
        this.hechizo = hechizo;
    }

    public void lanzarHechizo() {
        System.out.print(nombre + " lanza: ");
        hechizo.ejecutar();
    }

    public void setHechizo(Hechizo hechizo) {
        this.hechizo = hechizo;
    }
}
