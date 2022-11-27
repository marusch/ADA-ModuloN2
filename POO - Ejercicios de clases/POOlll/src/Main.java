import Entidades.Cuenta;

public class Main {
    public static void main(String[] args) {

        Cuenta cuenta1 = new Cuenta("Fernando");

        cuenta1.ingresar(300);

        cuenta1.retirar(100);


        System.out.println(cuenta1);



    }
}