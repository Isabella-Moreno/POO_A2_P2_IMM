package Ejercicio2;

import java.util.Scanner;

public class VehiculoPrueba {

    private Scanner sc = new Scanner(System.in);

    public void iniciar() {
        System.out.print("Marca del vehículo general: ");
        String marcaVehiculo = sc.nextLine();

        System.out.print("Marca de la bicicleta: ");
        String marcaBici = sc.nextLine();

        System.out.print("Número de cambios de la bicicleta: ");
        int cambios = sc.nextInt();

        Vehiculo vehiculo = new Vehiculo(marcaVehiculo);
        Vehiculo bicicleta = new Bicicleta(marcaBici, cambios);

        System.out.println("\n--- DEMOSTRACIÓN DE SOBRESCRITURA ---");
        vehiculo.moverse();
        bicicleta.moverse();
    }
}