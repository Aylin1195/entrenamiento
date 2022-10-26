//clase: es una plantilla que contiene elementos, objeto, métodos, funciones, variables
// public y class son palabras reservadas
//Nomenclatura nombre de clases - Pascal case primer letra empiece con mayúscula

public class Main {

    //Variable es una propiedad en una clase que se puede modificar en cualquier momento de la ejecución, son únicos
    //importa las mayúsculas y hay que poner que tipo de dato es y el nombre de la varibale
    //el nombre del tipo de dato no se puede utilizar como nombre de variable porque es una palabra reservada ej String (S mayúscula) es una clase
    //Variables camelCase
    String miVariable;
    static String miNombre = "Aylín";
    //es un solo caracter y va entre comillas simples
    Character miChar = 't';
    //tipo entero
    Integer miEdad = 27;
    double miFloat = 10.20; //valores con punto decimal
    Boolean miBoleano = true; //true =1 false =0


    //Métodos, funciones, variables y constructores
    public static void main(String[] args) {
        String miApellido = "Sanchez";
        //system out printIn nos indica una salida a pantalla, siempre manda caracteres, números
        //si se quiere concatenar algo hay que poner el signo de +
        //f10 para ejecutar o desde run
        //F9 salida a pantalla
        System.out.println("Hello world!" + miApellido);


        //instanciar una clase
        Sesion1 miSesionObjeto; //sin inicializar
        miSesionObjeto = new Sesion1();

        Sesion1 miSesionObjeto2 = new Sesion1("Aylin");
    }


}