public class Paimanzana{

//estas solo son para esta clase y no se pueden compartir
//solo se pueden compartir atravez de metodos
private int dia;
private int mes;
private int año;

//usamos un costructor e indicamos los argumentos detro de los ()
public Paimanzana(int d, int m, int a){

//asignamos esos valores a las variables privadas
dia = d;
mes = m;
año = a;

}
//creamos otro metodo, se tiene que llamar asi xq es algo q java ya tiene predefinido
//se tiene que llamar toString y este sirve para obtener valores ya sean enteros etc les aplica formato y los vuelve cadena 
public String toString(){

//el .format sirve para dar el formato que va tomar
return String.format("%d/%d/%d",dia, mes,año);
}
}


