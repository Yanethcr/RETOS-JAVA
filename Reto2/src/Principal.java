public class Principal {

    public static void main(String[] args){
        //Crear dos objetos que en este caso son representados como eventos
        Entrada   entrada1 = new Entrada("Obra de teatro",250);
        Entrada entrada2 = new Entrada("Presentación Folcklorica", 150);

        //obtener informacion del metodo
        entrada1.mostrarInfromacion();
        entrada2.mostrarInfromacion();

        //Reto extra
        Entrada_Record entrada3 = new Entrada_Record("Concierto Latin Mafia", 1999.99);
        entrada3.mostrarInformacion();
    }
}
