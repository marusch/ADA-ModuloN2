package Entidades;

//Ejercicio1

public class Animal {
    
    //Atributos con modificadores de acceso publicos(Pueden ser accedidos sin problema por otra clase)
    public String raza;
    public String color;
    public String nombre;


    //Metodos con modificadores de acceso publicos, que solo imprimen mensajes por consola o pantalla

    public void mover(){

        System.out.println("Estoy moviendome");
    }

    public void dormir(){

	System.out.println("Estoy durmiendo...");
    }

    public void comiendo(){
        System.out.println("Estoy comiendo");
    }


    //ToString -> Recupera los valores de la clase para ser imprimidos en la clase main o principal
    @Override
    public String toString() {
        return "Animal{" +
                "raza='" + raza + '\'' +
                ", color='" + color + '\'' +
                ", nombre='" + nombre + '\'' +
                '}';
    }
}
