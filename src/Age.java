import java.util.Scanner;

public class Age {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        int age;

        System.out.println("Ingrese edad");
        age= lectura.nextInt();
        if(age>=18){
                System.out.println("Bienvenido siga");
            
        } else {
            System.out.println("Pa la casa");
        }
    
        lectura.close();
    
    }
}
