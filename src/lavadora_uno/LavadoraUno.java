package lavadora_uno;

import funciones.Funciones;

import java.util.Scanner;

public class LavadoraUno {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("**************************************************");
        System.out.println("*** Seleccione el tipo de ropa que desea lavar ***");
        System.out.println("**************************************************");
        System.out.println("Opcion 1 Ropa Blanca.\nOpción 2 Ropa de Color.");
        int tipoDeRopa = entrada.nextInt();

        System.out.println("***************************************************");
        System.out.println("******* ¿Cuántos kilos de ropa desea lavar? *******");
        System.out.println("***************************************************");
        int kilos = entrada.nextInt();

        Funciones llamado = new Funciones(kilos, tipoDeRopa);
        llamado.CicloFinalizado();

    }
}
