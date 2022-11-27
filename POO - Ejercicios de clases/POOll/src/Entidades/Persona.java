package Entidades;

public class Persona {

    //Atributos
    public String nombre;

    private String apellido; 
   //Private-> Modificador de acceso privado que solo puede ser accedido con Set y Get.


    //Metodo con modificador publico de la clase, que retorna un mensaje en pantalla o consola

    public void Saludar(){
        System.out.println("Hola!");
    }
}
