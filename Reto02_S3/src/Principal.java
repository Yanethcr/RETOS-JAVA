public class Principal {
    public static void main(String[] args){
    Factura facturaRFC = new Factura(2500.00,"Servicio de consultoría","LYSE258985RFT");
    Factura facturasinRFC = new Factura(1800,"Reparacion de equipo", null);

    //impresion de los resultados
        System.out.println(facturaRFC.getResumen());
        System.out.println(facturasinRFC.getResumen());

    }
}
