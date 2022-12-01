package entidades;

import java.util.Scanner;

public class Agenda {

    private String nombre;
    private String numero;
    private int DNI;

    public Agenda() {
    }


    public Agenda(String nombre, String numero, int DNI) {
        this.nombre = nombre;
        this.numero = numero;
        this.DNI = DNI;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public int getDNI() {
        return DNI;
    }

    public void setDNI(int DNI) {
        this.DNI = DNI;
    }

    public void CrearContacto(){
        Scanner input = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese el nombre del contacto");
        nombre = input.nextLine();
        System.out.println("Ingrese el numero del contacto");
        numero = input.nextLine();
        System.out.println("Ingrese el DNI del contacto sin puntos, ni espacios");
        DNI = input.nextInt();
    }


    public void MostrarAgenda(){
        System.out.println("El nombre del contacto es: " + nombre);
        System.out.println("El numero del contacto es: " + numero);
        System.out.println("El dni del contacto es: " + DNI);
    }
}
