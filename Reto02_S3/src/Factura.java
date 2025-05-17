import java.util.Optional;

public class Factura {

    //Atributos
    double monto;
    String descripcion;
    Optional<String>rfc;

    //Metodos publicos
    public Factura(double monto, String descripcion, String rfc){
        this.monto = monto;
        this.descripcion = descripcion;
        this.rfc = Optional.ofNullable(rfc);
    }

    public String getResumen(){
        String resumen = "📄 Factura generada:\n";
        resumen += "Descripción: " + descripcion + "\n";
        resumen += "Monto: " + monto + "\n";

        //Mensaje en caso de que se encuentre o no el rfc
        resumen += "RFC: " + rfc.orElse("[No proporcionado]") + "\n";

        return resumen;
    }
}
