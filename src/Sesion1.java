public class Sesion1 {
    String miVariable;
    //Constructor: inicializa una clase, java por default internamente en automático crea un constructor
    //el constructor siempre se llama igual que la clase y no son funciones ni métodos
    //Inicializadores
    public Sesion1() { //no recibo ningún argumento en los ()
        miVariable = "Hola ";
        System.out.printIn("Hola");
    }

    public Sesion1(String nombre) { //recibe un argumento
        System.out.println("Hola " + nombre);

        }
    public Sesion1(String nombre, int edad) {
        System.out.prinIn("Hola" + " " + nombre + " y tengo " + edad);
    }
}
