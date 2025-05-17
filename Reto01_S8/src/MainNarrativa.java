public class MainNarrativa {
    public static void main(String[] args) {
        // Simulación inicial
        Narrativo paquete = new Narrativo("Inicio del viaje");

        TransicionHistoria transicion = new TransicionSimple();
        GestorDialogo dialogo = new DialogoTexto();
        LogicaDecision decision = new DecisionBinaria();

        dialogo.mostrarDialogo(paquete);
        String accion = decision.tomarDecision();
        transicion.realizarTransicion(accion);
    }
}