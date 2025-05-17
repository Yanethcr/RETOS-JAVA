
public record Entrada_Record(String nombreEvento, double precioEntrada ) {
    public void mostrarInformacion(){
        System.out.println("Evento: " + nombreEvento + "| Precio: $" + precioEntrada);
    }

}