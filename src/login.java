import java.util.Scanner;

public class login {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        
        String name;
        System.out.println("Ingrese el username ");
        name = lectura.next();

        String password;
        System.out.println("Ingrese una password ");
        password = lectura.next();

        if(name.equals("JaiderQ")&& password.equals("Jaider1234")){
            System.out.println("Bienvenido al sistema " + name );
        }
        else if(name!="JaiderQ" && password.equals("Jaider1234")){
            System.out.println("Algo paso con tus datos de acceso");
        }
        else if(name.equals("JaiderQ")&& password!="Jaider1234"){
            System.out.println("Parece que olvidaste tus credenciales de acceso");
        }
        else{
            System.out.println("Acceso denegado");
        }   
        lectura.close();
    }
}
