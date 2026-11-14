package Ejercicio3;

public class Telefono extends Dispositivo {

    // --- CASO 1: CAMBIAR LA FIRMA CON @Override (ERROR DE COMPILACIÓN) ---
    // El método en Dispositivo recibe (int segundos). Al quitar el parámetro, ya no tienen la misma firma.
    // Descomenta para observar el error: "Method does not override method from its superclass"
    /*
    @Override
    public void encender() {
        System.out.println("El teléfono se enciende rápido.");
    }
    */

    // --- CASO 2: SOBRESCRIBIR SIN USAR @Override (MALA PRÁCTICA) ---
    // Compila y funciona, pero si te equivocas en una letra (ej. "apagarr") o si cambian
    // el método en la clase padre, Java no avisará y creará un método nuevo en lugar de sobrescribir.
    public void apagar() {
        System.out.println("El teléfono muestra pantalla de despedida y se apaga.");
    }
}