import java.util.Scanner;

import javax.swing.plaf.multi.MultiButtonUI;


public class Calculadora {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        double number1 , number2, answer;
        int opction;
        
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
        
        opction = lectura.nextInt();

        switch (opction){
            case 1:
                answer = number1 + number2;
                System.out.println("El resultado de la suma es "+ answer );
                break;
            
            case 2:
                answer = number1 - number2;
                System.out.println("El resulrado de la resta fue " + answer );
                break;
            
            case 3:
                answer = number1*number2;
                System.out.println("El resultado de la multiplicacion es " + answer);
                break;
            
            case 4:
                answer = number1 / number2;
                System.out.println("El resultado de la division es " + answer);
                break;

            case 5:
                answer =Math.pow(number1,number2);
                System.out.println("El resultado de la potencia es " + answer);
                break;
            
            case 6:
                answer = Math.sqrt(number2 );
                System.out.println("El resultado de la raiz cuadrada " + answer);
                break;    

            default:
                System.out.println("La opcion elegida no es valida ");

        }
        
        lectura.close();
    }
}
