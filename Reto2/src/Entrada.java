
public class Entrada {

    String nombreEvento;
    double precioEntrada;

    //Creacion del constructor que reciba el nombre del evento y el costo
    public Entrada(String nombreEvento, double precioEntrada){
        this.nombreEvento = nombreEvento;
        this.precioEntrada = precioEntrada;
    }
    //Metodo publico para mostrar informacion
    public void mostrarInfromacion(){
        System.out.println("Evento: " + nombreEvento + " | " + " Precio: $" + precioEntrada);
    }
}


