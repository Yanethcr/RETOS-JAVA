
public class DialogoTexto implements GestorDialogo {
    public void mostrarDialogo(Narrativo paquete) {
        System.out.println("🎙️ Escena actual: " + paquete.getEscenaActual());
        System.out.println("Una figura misteriosa aparece y te ofrece dos caminos...");
    }
}
