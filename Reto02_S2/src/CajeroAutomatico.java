import java.util.Scanner;

public class CajeroAutomatico {
    public static void main (String[] args){

        Scanner scanner = new Scanner(System.in);
        //Definicion del saldo inicial
         var saldo = 1000.0;
         int eleccion;

        //Creacion del menu
        do{
            System.out.println("\n💳 Bienvenido al cajero automático");
            System.out.println("\n 1.Consultar saldo");
            System.out.println("\n 2.Depositar dinero");
            System.out.println("\n 3.Retirar dinero");
            System.out.println("\n 4.Salir");

            System.out.print("\nSelecciona una opción: ");
            eleccion = scanner.nextInt();

            switch(eleccion){
               case 1 -> {
                   System.out.println("🔎 Tu saldo actual es: $" + saldo);
               }
               case  2 -> {
                   System.out.println("💰 Ingresa el monto a depositar: ");
                   double deposito = scanner.nextDouble();

                   if (deposito <= 0){
                       System.out.println("⚠ El monto debe ser mayor a 0");
                       continue;
                   }
                   saldo += deposito;
                   System.out.println("✅ Depósito realizado. Saldo actualizado: $" + saldo);
               }
               case 3 -> {
                   System.out.println("💸 Ingresa el monto a retirar: ");
                   double retiro = scanner.nextDouble();

                   if (retiro <= 0 ){
                       System.out.println("⚠ El monto debe ser mayor a 0");
                       continue;
                   }
                   if (retiro > saldo){
                       System.out.println("❌ Saldo insuficiente. Tu saldo es: $" + saldo);
                   } else {
                       saldo -=retiro;
                       System.out.println("✅ Retiro exitoso. Saldo restante: $" + saldo);
                   }
               }
               case 4 -> {
                   System.out.println("👋 Gracias por usar el cajero. ¡Hasta pronto!");
               }
                default -> {
                   System.out.println("🚫 Opcion inválida. Intenta nuevamente.");
                }
            }
        } while (eleccion != 4);
        scanner.close();

    }
}
