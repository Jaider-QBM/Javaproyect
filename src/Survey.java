import java.util.Scanner;

public class Survey {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        int contadorH, contadorM;

        String genero;

        contadorH =0;
        contadorM =0;

        for(int x=1; x<=10; x++){
            System.out.println("Ingrese eres mujer o hombre");
            genero = lectura.nextLine();

            if(genero.equalsIgnoreCase("Hombre")){
                contadorH = contadorH+1;
            }
            else if(genero.equalsIgnoreCase("Mujer")){
                contadorM = contadorM+1;
            }
        }

        System.out.println("El total de hombres es de " + contadorH);
        System.out.println("El total de mujeres es de " + contadorM);

        lectura.close();
    }
}
