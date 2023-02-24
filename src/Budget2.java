import java.util.Scanner;

public class Budget2 {
   public static void main(String[] args) {
    Scanner lectura = new Scanner(System.in);

    int spent, budget, totals, op, contador;

    op =1;
    budget = 100000;
    contador= 0;
    while(op==1 && contador<=3) {
        contador = contador +1;
        System.out.println("Ingrese el gasto");
        spent = lectura.nextInt();
        budget = budget-spent;

        System.out.println(" El gasto fue de " + spent + " El prosupuesto es de " + budget );
        
        System.out.println("Deseas registrar otro gasto ");
        System.out.println("1. Si");
        System.out.println("2. No");
        op= lectura.nextInt();

       
    }



    lectura.close();
   } 
}
