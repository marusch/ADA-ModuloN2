import Entidades.Operaciones;
import Entidades.Persona;

public class Main {
    public static void main(String[] args) {


        //Instancia de la clase Operaciones, creando con ella el objeto "operaciones"
        Operaciones operaciones = new Operaciones();

	//Instancia de la clase Persona, creando con ella los objetos "person1" y "person2"
	//Se pueden crear la cantidad de objetos que sean necesarios, siempre con distinto nombre
        Persona person1 = new Persona();
        Persona person2 = new Persona();

	//Metodos de la clase Operaciones, accedidos desde el objeto "operaciones"
        operaciones.Suma();
        operaciones.multiplicacion();

        System.out.println(operaciones.Suma());

	//Accedemos a los atributos y metodos de la clase Persona desde sus objetos creados
        person1.nombre = "Maru";
      
        System.out.println("Soy " + person1.nombre);
        person1.Saludar();

        person2.nombre = "Fer";
        System.out.println("Soy " + person2.nombre);
        person2.Saludar();



    }
}