package Entidades;

public class Operaciones {

    //Atributos publicos 
    public int a = 8;
    public int b= 4;
    public int resultado=0;

    
    //Metodos con modificadores publicos de la clase, que retornan valores de tipo int

    public int Suma(){
        resultado = a+b;

        return resultado;
    }

    public int multiplicacion(){
        resultado = a*b;
        return resultado;
    }

}
