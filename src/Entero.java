import java.util.Scanner;

public class Entero {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        int number;

        System.out.println("Ingrese un numero");
        number = lectura.nextInt();
        
        if(number>0){
            System.out.println("El numero es positivo");
        }else if (number==0){
            System.out.println("El numero es neutro");
        }else{
            System.out.println("El numero es negativo");
        }
        lectura.close();
    }
}
