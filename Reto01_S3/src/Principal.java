

public class Principal {
    public static void main(String[] args){

        //Creacioon del pasajero y el vuelo
        Pasajero pasajero = new Pasajero("Karla Cruz", "P199724");

        Vuelo vuelo = new Vuelo("NY0225", "Nueva York", "12:40");

        //Resevacion del asiento
        boolean reservado = vuelo.reservarAsiento(pasajero);
        if(reservado){
            System.out.println("✔ Reserva realizada con éxito.\n");
        } else {
            System.out.println("❌ No se pudo realizar la reserva.\n");
        }

        //Mostrar el itinerario
        System.out.println(vuelo.obtenerItinerario());

        //Cancelar la reserva
        System.out.println("❌ Cancelando reserva...\n");
        vuelo.cancelarReserva();

        //Mostrar el itinerario nuevo
        System.out.println(vuelo.obtenerItinerario());

        //Nueva reservacion
        vuelo.reservarAsiento("Alejandra Capetillo", "P202502");

        //Mostrar el itinerario actualizado
        System.out.println(vuelo.obtenerItinerario());
    }
}
