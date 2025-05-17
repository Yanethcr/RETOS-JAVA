//declaracion de la libreria scanner
import java.util.Scanner;

public class SimuFarmacia {
    public static void main(String[] args){
        //Se declara la clase scanner que permitira ingresar los datos, solo se declara una vez
        Scanner scanner = new  Scanner(System.in);

        //Solicitando los datos al usuario
        System.out.print("Nombre del medicamento: ");
        String medicamento = scanner.nextLine();

        System.out.print("Precio unitario: ");
        double precioUnitario = scanner.nextDouble();

        System.out.println("Cantidad de piezas: ");
        int cantidad = scanner.nextInt();

        //Calculo del total de los medicamentos
        double sinDescuento = precioUnitario * cantidad;

        // Se evalua la condición para aplicar descuento
        var aplicaDescuento = sinDescuento > 500; // aplica para imprimir true o false
        double descuento  = aplicaDescuento ? sinDescuento * 0.15 : 0;

        //Total a pagar
        double totalDescuento = sinDescuento - descuento;

        //Se manda a imprimir
        System.out.println("\n Resumen de compra: ");
        System.out.println("Medicamento: " + medicamento);
        System.out.println("Cantidad: " + cantidad);
        System.out.println("Precio unitario: " + precioUnitario);
        System.out.println("Total sin descuento: " + sinDescuento);
        System.out.println("¿Aplica descuento?: " + aplicaDescuento);
        System.out.println("Descuento: " + descuento);
        System.out.print("Total a pagar: " + totalDescuento);

        scanner.close();

    }
}
