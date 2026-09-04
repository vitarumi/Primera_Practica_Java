import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

       Estudiante estudiante = new Estudiante("Ana", "Ingeniería",25);

       estudiante.mostrarInformacion();

       Scanner scanner =new Scanner(System.in);


        System.out.println("Ingrese nombre: ");
        String nombre = scanner.nextLine();


        System.out.println("Ingrese carrera");
        String carrera = scanner.nextLine();

        System.out.print("Ingrese edad: ");
        int edad = scanner.nextInt();


    }
}