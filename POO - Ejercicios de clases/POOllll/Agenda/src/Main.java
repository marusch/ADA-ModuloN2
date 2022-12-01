import entidades.Agenda;

public class Main {
    public static void main(String[] args) {

        Agenda contac1 = new Agenda();
        contac1.CrearContacto();

        Agenda contac2 = new Agenda();
        contac2.CrearContacto();

        contac1.MostrarAgenda();
        System.out.println("");
        contac2.MostrarAgenda();
    }
}