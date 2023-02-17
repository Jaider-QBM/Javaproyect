import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner lectura = new Scanner(System.in);
        int number1, number2, resultado;

        System.out.println("Ingrese un numero");
        number1 = lectura.nextInt();

        System.out.println("Ingresa un numero");
        number2 = lectura.nextInt();

        resultado = number1 + number2;
        System.out.println("El resultado es " + resultado);
        lectura.nextInt(); //limpieza de buffer

        String name;
        System.out.println("Ingrese su nombre");
        name = lectura.nextLine();

        System.out.println("El nombre ingresado es: " + name);
        
        lectura.close();
    }
}
