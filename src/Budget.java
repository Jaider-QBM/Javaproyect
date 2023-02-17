import java.util.Scanner;

public class Budget {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);

        Double ancho, largo, area,  presupuesto;
  
        System.out.println("Ingrese el ancho");
        ancho = lectura.nextDouble();
  
        System.out.println("Ingrese el largo");
        largo = lectura.nextDouble();
  
        area = largo*ancho;
        presupuesto = 45000*area;
        
        System.out.println("la supercifie a cubrir es "+ ancho + "metros ancho" + largo + "con metros cuadrados"+ area + "metros cuadrados" + "el presupuesto del proyecto es" + presupuesto );  
  
        lectura.close();
    }
}
