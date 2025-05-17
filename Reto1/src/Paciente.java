import java.util.Scanner;

public class Paciente {
    //Atributos
    String namePaciente;
    int edad;
    String numExp;

    //Metodos

    public void mostrarInformacion() {

        //Ingresar el nombre del paciente
        System.out.println("Paciente: " + namePaciente);

        //Ingresar la edad del paciente
        System.out.println("Edad: " + edad);

       //Ingresar el espediente
        System.out.println("Expediente: " + numExp );
    }


}
