package Ejercicio3;

public class SobrescrituraIncorrectaPrueba {

    public void iniciar() {
        Dispositivo tel = new Telefono();
        tel.encender(3);
        tel.apagar();

        System.out.println("\n--- ANÁLISIS EJERCICIO 3 ---");
        System.out.println("1. Cambio de firma: Al modificar los parámetros de 'encender', deja de ser sobrescritura "
                + "(pasa a ser sobrecarga). Usar @Override obliga al compilador a detenerse y avisar el error.");
        System.out.println("2. Omitir @Override: Aunque 'apagar()' compila sin la anotación, es una mala práctica "
                + "porque se pierde la verificación del compilador ante errores tipográficos o cambios futuros en la clase base.");
    }
}