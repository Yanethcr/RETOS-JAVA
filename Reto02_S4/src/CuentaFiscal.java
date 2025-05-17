import java.util.Objects;

public class CuentaFiscal {

    //Atributos
    private String rfc;
    private double saldoDisponible;

    public CuentaFiscal(String rfc, double saldoDisponiblle){
        this.rfc = rfc;
        //validacion de saldo
        if(saldoDisponiblle >= 0){
            this.saldoDisponible = saldoDisponiblle;
        } else {
            System.out.println("❌ El saldo no puede ser negativo. Se asigna 0.");
            this.saldoDisponible = 0;
        }
    }

    //getters
    public String getRfc(){ return rfc; }
    public double getSaldoDisponible(){ return saldoDisponible; }
    public boolean validarRFC(DeclaracionImpuestos d){return Objects.equals(this.rfc, d.rfcContribuyente());}

    //Validacion del RFC
    public void mostrarCuenta(){
        System.out.println("🏦 Cuenta fiscal registrada con RFC: " + rfc + ",saldo disponible: $" + saldoDisponible);
    }
}
