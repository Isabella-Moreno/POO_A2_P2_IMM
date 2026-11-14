package Ejercicio1;

public class Profesor extends Persona {

    private String asignatura;

    public Profesor(String nombre, String asignatura) {
        super(nombre);
        this.asignatura = asignatura;
    }

    @Override
    public void presentarse() {
        System.out.println("Buenos días, soy el profesor " + nombre + " y doy clases de " + asignatura + ".");
    }
}