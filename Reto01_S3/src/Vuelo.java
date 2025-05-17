//Diseñar un sistema basico de reservas de vuelo
//Simular un sistema donde un pasajero puede reservar un asiento, en un vuelo
//-Consultar su itinerario  y cancelar la reserva


public class Vuelo {

    //Atributos
    final String codigoVuelo;
    String destino;
    String horaSalida;
    Pasajero asientoReservado;

    //Constructor
    public Vuelo(String codigo,String destino, String horaSalida){
        this.codigoVuelo = codigo;
        this.destino = destino;
        this.horaSalida = horaSalida;
        this.asientoReservado = null;
    }

    //Metodos
    public boolean reservarAsiento(Pasajero p){
        if (asientoReservado == null){
            asientoReservado = p;
            return true;
        } else {
            return  false;
        }
    }
    //Metodo sobrecargado
    public boolean reservarAsiento(String nombre, String pasaporte){
        Pasajero nPasajero = new Pasajero(nombre, pasaporte);
        return reservarAsiento(nPasajero);//digamos que realiza la asignacion del asiento al nuevo pasajero
    }

    //Metodo para cancelar el asiento reservado
    public void cancelarReserva(){
        asientoReservado = null ;
    }

    //Merodo para obtener la informacion del vuelo y del pasajero
    public String obtenerItinerario(){
        String info = "✈Itinerario de vuelo: \n";
        info += "Código: " + codigoVuelo + "\n";
        info += "\nDestino: " + destino;
        info += "\nSalida: " + horaSalida;
        if (asientoReservado != null){
            info += "\nPasajero: " + asientoReservado.nombre;
        }else{
            info += "\nPasajero: [Sin reserva]";
        }
        return info;
    }




}
