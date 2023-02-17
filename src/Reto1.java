import java.util.Scanner;

public class Reto1 {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        double numberF, numberC;
                
        System.out.println("Ingrese el numero en Fahrenheit");
        numberF = lectura.nextDouble();

        numberC = (numberF - 32) / 1.8;
        System.out.println("Resulta en Centigrados es " + numberC );
        
        lectura.close();
    }
}
