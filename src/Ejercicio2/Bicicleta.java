package Ejercicio2;

public class Bicicleta extends Vehiculo {

    private int cambios;

    public Bicicleta(String marca, int cambios) {
        super(marca);
        this.cambios = cambios;
    }

    @Override
    public void moverse() {
        System.out.println("La bicicleta " + marca + " de " + cambios + " cambios avanza pedaleando.");
    }
}