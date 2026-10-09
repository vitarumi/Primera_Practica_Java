import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


       Scanner scanner =new Scanner(System.in);


        System.out.println("Ingrese nombre: ");
        String nombre = scanner.nextLine();


        System.out.println("Ingrese carrera");
        String carrera = scanner.nextLine();

        System.out.print("Ingrese edad: ");
        int edad = scanner.nextInt();

        Estudiante estudiante = new Estudiante(nombre, carrera, edad);

        if (edad >= 18) {
            System.out.println("Acceso autorizado.");
        } else if (edad < 25) {
            System.out.println("Estudiante joven");
        }
        else {
            System.out.println("Estudiante adulto.");
        }


        estudiante.mostrarInformacion();
    }
}