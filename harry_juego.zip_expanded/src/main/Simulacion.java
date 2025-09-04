package main;

import personajes.Harry;
import personajes.Ron;
import personajes.Hermione;
import personajes.Personaje;
import hechizos.Oculus_reparo;

public class Simulacion {
    public static void main(String[] args) {
        Personaje harry = new Harry();
        Personaje ron = new Ron();
        Personaje hermione = new Hermione();

        harry.lanzarHechizo();
        ron.lanzarHechizo();
        hermione.lanzarHechizo();

        // Hermione cambia su hechizo en tiempo de ejecución
        hermione.setHechizo(new Oculus_reparo());
        hermione.lanzarHechizo();
    }
}
