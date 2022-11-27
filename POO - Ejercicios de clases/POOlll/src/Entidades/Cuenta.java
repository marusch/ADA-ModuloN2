package Entidades;

/*Crea una clase llamada Cuenta que tendrá los siguientes atributos: titular y
 cantidad (puede tener decimales).

  El titular será obligatorio y la cantidad es opcional.
  Crea dos constructores que cumpla lo anterior.

  Crea sus métodos get, set y toString.

  Tendrá dos métodos especiales:

  ingresar(double cantidad): se ingresa una cantidad a la cuenta,
  si la cantidad introducida es negativa, no se hará nada.
  retirar(double cantidad): se retira una cantidad a la cuenta,
  si restando la cantidad actual a la que nos pasan es negativa,
  la cantidad de la cuenta pasa a ser 0.
*/

public class Cuenta {

    //Atributos con modificar de acceso privado - Utilizamos set y get
    private String titular;
    private double cantidad;

    //Constructor 1
    public Cuenta(String titular){

        this(titular,0); //sobrecarga(Modificaremos su valor previo)
    }


    //Constructor 2 con parametros o argumentos
    public Cuenta(String titular, double cantidad){

        this.titular = titular;

        if (cantidad<0){
            this.cantidad=0;

        }else{
            this.cantidad = cantidad;
        }
    }


    //Metodos Set y Get (Set=Agrega valores, Get= recupera valores)

    public String getTitular(){
        return titular;
    }

    public void setTitular(String titular){
        this.titular=titular;
    }

    public double getCantidad() {
        return cantidad;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }

	
    //Metodos ingresar y retirar dinero

    public void ingresar(double cantidad){
        if (cantidad>0){
            this.cantidad += cantidad;
        }
    }

    public void retirar(double cantidad){
        if (this.cantidad - cantidad<0){
            this.cantidad=0;
        }else {
            this.cantidad -= cantidad;
        }
    }



    //ToString -> Recupera los valores de la clase para ser imprimidos en la clase main o principal

    @Override
    public String toString() {
        return "Cuenta{" +
                "titular='" + titular + '\'' +
                ", cantidad=" + cantidad +
                '}';
    }
}
