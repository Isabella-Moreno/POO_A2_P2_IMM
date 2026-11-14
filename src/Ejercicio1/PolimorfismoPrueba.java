package Ejercicio1;

public class PolimorfismoPrueba {

    public void iniciar() {
        
        Persona personaGeneral = new Persona("Carlos");
        Persona estudiante = new Estudiante("Isabella", "Ingeniería de Software");
        Persona profesor = new Profesor("John Arrieta", "Programación Orientada a Objetos");

        System.out.println("--- PRESENTACIÓN MEDIANTE POLIMORFISMO ---");
        personaGeneral.presentarse();
        estudiante.presentarse();
        profesor.presentarse();
    }
}