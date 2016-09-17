//clase principal
public class Pai{


public static void main (String[]args){

//creamos un objeto para enlazar a la clase y le damos valores 
//cuando se crean objetos para trabajar con costructores se le asignan los valores al objeto

Paimanzana delisioso = new Paimanzana(5,10,2016);
Paipera jugodepera = new Paipera("MANZANA", delisioso);

System.out.print(jugodepera);
}}