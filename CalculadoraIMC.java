import java.util.Scanner;

public class CalculadoraIMC {
    public static void main (String [] args) {
        System.out.println("Por ingrese su peso en Kilogramos: ");
        Scanner cargaDeDatos = new Scanner(System.in);
        double peso = cargaDeDatos.nextDouble();
        System.out.println("Por favor ingrese su altura en Metros: ");
        double altura = cargaDeDatos.nextDouble();

        double indiceMasaCorporal = peso / (altura * altura);
        System.out.println("Tu indice de masa corporal es: "+indiceMasaCorporal);

        if (indiceMasaCorporal >= 30) {
            System.out.println("Estas en estado de Obesidad");
        }
        if (indiceMasaCorporal >= 25 && indiceMasaCorporal < 30) {
            System.out.println("Estas en estado de sobrepeso");
        }
        if (indiceMasaCorporal >= 18.5 && indiceMasaCorporal < 25) {
            System.out.println("Estas en estado de peso normal");
        }
        if ( indiceMasaCorporal < 18.6) {
            System.out.println("Estas en un peso menor al normal");
        }
    }
}
