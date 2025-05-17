public class Main {
    public static void main(String[] args) {

        //Creacion de la declaracion de impuestos
        DeclaracionImpuestos declaracion = new DeclaracionImpuestos("MAXC02333335444", 9500.0);

        CuentaFiscal cuenta = new CuentaFiscal("MAXC02333335444", 8423);

        System.out.println("📄 Declaracion enviada por RFC: " + declaracion.rfcContribuyente() + "por $ " + declaracion.montoDeclarado());

        cuenta.mostrarCuenta();

        boolean rfcValido = cuenta.validarRFC(declaracion);
        System.out.println("¿RDC valido para esta cuenta " + rfcValido);
    }
}
