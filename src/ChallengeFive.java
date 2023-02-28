import java.util.Scanner;

public class ChallengeFive {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
         
        

        String name;
        System.out.println("Hola, como te llamas?");
        name = lectura.nextLine();

        String lastname;
        System.out.println(name + " Como es tu apellido");
        lastname = lectura.nextLine();

        System.out.println("La longitud de tu nombre es de: " + name.length() + " y la de tu apellido es de: " + lastname.length() );

        String fullname = name.toUpperCase()+ " " + lastname.toLowerCase();
        System.out.println("Tu nombre combre es: " + fullname);

        System.out.println("Tu primeras letras de tu nombre es: " + name.substring(0, 2) + " con tu apellido  es " + name.substring(0, 2) + lastname);

    }
}
