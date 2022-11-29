package entidades;

public class operaciones {

    public int a=2;
    public int b=2;

    public int Sumar(){
        int sum;
        sum = a+b;
        System.out.println("El resultado de la suma es: " + sum);
        return sum;
    }
    public int resta(){
        int resta;
        resta=a-b;
        System.out.println("El valor de la resta es: " + resta);
        return resta;
    }

    public int multiplicacion(){
        int multi;
        multi=a*b;
        System.out.println("El valor de la multiplicacion es: " + multi);
        return multi;
    }
}
