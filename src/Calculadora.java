import java.util.Scanner;

import javax.swing.plaf.multi.MultiButtonUI;


public class Calculadora {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        double number1 , number2, respuesta;
        int opcion;
        
        System.out.println("Ingrese un numero");
        number1 = lectura.nextDouble();

        System.out.println("Ingrese otro numero");
        number2 = lectura.nextDouble();

        System.out.println("Elige una opcion");
        System.out.println("1. suma");
        System.out.println("2. resta");
        System.out.println("3. multiplicacion");
        System.out.println("4. division");
        System.out.println("5. potencia");
        System.out.println("6. raiz cuadrada");
        System.out.println("Elige");
        
        opcion = lectura.nextInt();

        switch (opcion){
            case 1:
                respuesta = number1 + number2;
                System.out.println("El resultado de la suma es "+ respuesta);
                break;
            
            case 2:
                respuesta = number1 - number2;
                System.out.println("El resulrado de la resta fue " + respuesta );
                break;
            
            case 3:
                respuesta = number1*number2;
                System.out.println("El resultado de la multiplicacion es " + respuesta);
                break;
            
            case 4:
                respuesta = number1 / number2;
                System.out.println("El resultado de la division es " + respuesta);
                break;

            case 5:
                respuesta =Math.pow(number1,number2);
                System.out.println("El resultado de la potencia es " + respuesta);
                break;
            
            case 6:
                respuesta = Math.sqrt(number2 );
                System.out.println("El resultado de la raiz cuadrada " + respuesta);
                break;    

            default:
                System.out.println("La opcion elegida no es valida ");

        }
        
        lectura.close();
    }
}
