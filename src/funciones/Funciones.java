/**
 * Clase con las funciones lógicas de las lavadoras
 */
package funciones;

import java.util.Scanner;

/**
 * @author Gabriel Alexander
 */
//Declaramos el nombre de nuestras variables que serán los atributos de esta clase
public class Funciones {
    Scanner entrada = new Scanner(System.in);

    private int kilos = 0;
    private int tipoDeRopa = 0;
    private int llenadoCompleto = 0;
    private int lavadoCompleto = 0;
    private int secadoCompleto = 0;

    // Creamos el constructor para que puedan instanciar la clase, pasamos los parametros que se recibirán de la clase Main
    public Funciones(int kilos, int tipoDeRopa) { // la palabras "this" hace referencia a que las variables de esta clase serán iguales a las de la clase Maiin
        this.kilos = kilos;
        this.tipoDeRopa = tipoDeRopa;
    }

    private void Llenado() { // Este Método se encarga de realizar el llenado
        while (kilos < 1 || kilos > 12) {
            System.out.println("Haz excedido el líminte de carga de la lavadora\nReduce la carga.");
            System.out.print("Ingrese los Kilos de ropa que desea lavar: ");
            kilos = entrada.nextInt();
        }
        System.out.println("Llenando...");
        System.out.println("Llenado Completo!");
        System.out.println("___________________________________________________");
        llenadoCompleto = 1;

    }

    private void Lavado() { // Este método se encarga de realizar el lavado dependiendo del tipo de ropa.
        Llenado();
        if (llenadoCompleto == 1) {
            if (tipoDeRopa == 1) {
                System.out.println("Ropa Blanca / Lavado Suave!");
                System.out.println("Lavando...");
                System.out.println("___________________________________________________");
                lavadoCompleto = 1;
            } else if (tipoDeRopa == 2) {
                System.out.println("Ropa de Color / Lavado Intenso!");
                System.out.println("Lavando...");
                System.out.println("___________________________________________________");
                lavadoCompleto = 1;
            } else {
                System.out.println("El tipo de ropa no está disponible.\nSe lavará como ropa de color / Lavado intenso");
                System.out.println("Lavando...");
                System.out.println("___________________________________________________");
                lavadoCompleto = 1;
            }
        }
    }

    private void Secado() { // Este método se encarga realizar el secado de la ropa
        Lavado();
        if (lavadoCompleto == 1) {
            System.out.println("Secando...");
            System.out.println("Secado Finalizado!");
            System.out.println("___________________________________________________");
            secadoCompleto = 1;
        }
    }

    public void CicloFinalizado() { // Este método es público y es al que se tendrá acceso desde la clase Main
        Secado();
        if (secadoCompleto == 1) {
            System.out.println("Tu Ropa está lista!\nPuedes retirarla de la lavadora.");
            System.out.println("___________________________________________________");
        }
    }

}
