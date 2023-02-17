import java.util.Scanner;

public class NumberOne {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        int numberOne, numberTwo, resultado;

        System.out.println("Ingrese un numero ");
        numberOne = lectura.nextInt();

        System.out.println("Ingrese otro numero");
        numberTwo = lectura.nextInt();

        if(numberOne>numberTwo){
            resultado = numberOne + numberTwo;
            System.out.println("Si el numero uno es mayo "+ numberOne + "Si el numero dos es menor " + numberTwo + "Resultado es " + resultado);
        }else{
            resultado = numberTwo - numberOne;
            System.out.println("Si el numero dos es mayor " + numberTwo + "si el numeor ono es menor " + numberOne +"Resultado es " + resultado);
        }
        lectura.close();
    }
}
