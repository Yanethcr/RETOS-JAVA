import java.util.Scanner;

public class Principal {
    public static void main(String[] args){
        //Creacion del objeto paciente con entrada de datos
        Scanner objetop= new Scanner(System.in);
        Paciente paciente1 = new Paciente();

        //Solicitud del nombre
        System.out.println("Ingrese el nombre del paciente: ");
        paciente1.namePaciente = objetop.nextLine();

        //solicitud de la edad
        System.out.println("Ingrese la edad del paciente: ");
         paciente1.edad = objetop.nextInt();
        objetop.nextLine();

        //Solicitud del número del expediente
        System.out.print("Ingrese el número de expediente: ");
        paciente1.numExp = objetop.nextLine();

        objetop.close(); // cerrar el scaner y no dejar ningun buffer abierto

        System.out.println();

        paciente1.mostrarInformacion();

    }
}
