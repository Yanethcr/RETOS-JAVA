public class Main {
    public static void main (String[] args){
        //Creacion de las facturas
        Factura factura1 = new Factura(" FAC001"," Samira Marquez", 1500.0);
        Factura factura2 = new Factura(" FAC001", " Obed Mendez", 1500.0);

        //impresion de los datos
        System.out.println(factura1);
        System.out.println(factura2);

        //Comparacion con equals
        System.out.println("¿Las facturas son iguales? " + factura1.equals(factura2));
    }
}
