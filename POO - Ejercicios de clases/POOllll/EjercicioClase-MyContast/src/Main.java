import entidades.MyContast;

public class Main {
    public static void main(String[] args) {

        MyContast clase1 = new MyContast();

        clase1.counter = 44;
        System.out.println("El valor de la variable es: " + clase1.counter);
        clase1.MostrarTexto();

    }
}