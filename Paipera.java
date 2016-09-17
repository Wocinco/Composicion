public class Paipera{
//creamos dos variables del tipo privadas 
private String alimento;
private Paimanzana vencimiento;

//creamos un constructor y asignamos los parametros en ()
//paimanzana se vuelve un objeto
public Paipera(String elalimento, Paimanzana elvencimiento){

//dentro del constructor asignamos valores a nuestras variables privadas
alimento = elalimento;
vencimiento = elvencimiento;
}
//permite darle un formato a las variables
public String toString () {

//esto es o que nos va retornar
//%S va tomar la primera variable y la va a poner en ese lugar
return String.format("ESTE ALIMENTO ES DE: %s, Y SU VENCIMIENTO ES: %s", alimento, vencimiento);

}
}