package estructuraDatos;

import java.util.Scanner;
import java.util.Vector;

public class ChallengeOne {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        double promedio, resultado, suma;

        int cantidad;
        resultado =0;
        suma =0;

        System.out.println("Digite la cantidad de notas");
        cantidad = lectura.nextInt();

        double[] nota = new double[cantidad];
        
        for(int p=0; p<nota.length; p++){
            System.out.println("Digite las notas de dicha materia ");
            nota[p] = lectura.nextDouble();

            suma = suma + nota[p];
        }

        promedio = suma / nota.length;
        resultado = resultado + promedio;

        if(resultado<=3.0){
            System.out.println("Reprobaste, el promedio fue de: " + promedio );
        }
        else if(resultado<=4.0){
            System.out.println("Pasaste Raspando, el promedio fue de: " + promedio);
        }
        else if(resultado>=4.0){
            System.out.println("Aprobaste con buenos resultados, el promedio fue de: " + promedio);
        }

        lectura.close();
    }
}
