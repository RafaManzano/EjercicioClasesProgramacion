import java.util.ArrayList;
import java.util.Scanner;

public class Funcionalidades {
    static Scanner sc = new Scanner(System.in);
    /*
     * Nec: Nada
     * Dev: Una palabra
     * Nec/Dev: No hay
     * Requisitos: La palabra no puede estar vacia
     *
     * Interfaz Java
     * Nombre: dimeTuNombre
     * Comentario: Recoge desde teclado el nombre de la persona
     * Cabecera: String dimeTuNombre()
     * Precondiciones: No hay
     * Entrada: - No hay
     * Salida:  - String nombre
     * E/S: No hay
     * Postcondiciones: Por valor, el nombre de la persona
     */

    static public String dimeTuNombre() {
        String nombre = "";
        do {
            System.out.println("Me puedes decir como te llamas, para poder dirigirme a ti");
            nombre = sc.nextLine();
        } while (nombre.isEmpty());
        return nombre;
    }

    /*
     * Nec: Nada
     * Dev: Un entero
     * Nec/Dev: No hay
     * Requisitos: El entero tiene que ser mayor que 0 y menor a 31
     *
     * Interfaz Java
     * Nombre: dimeTuDiaDeNacimiento
     * Comentario: Recoge desde teclado el dia de nacimiento de la persona
     * Cabecera: int dimeTuDiaDeNacimiento()
     * Precondiciones: No hay
     * Entrada: - No hay
     * Salida:  - int dia
     * E/S: No hay
     * Postcondiciones: Por valor, el dia de nacimiento de la persona
     */
    static public int dimeTuDiaDeNacimiento() {
        int dia = 0;
        do {
            System.out.println("Dia de nacimiento: ");
            dia = sc.nextInt();
        } while (dia < 0 || dia > 31);
        return dia;
    }

    /*
     * Nec: Nada
     * Dev: Un entero
     * Nec/Dev: No hay
     * Requisitos: El entero tiene que ser mayor que 0 y menor a 12
     *
     * Interfaz Java
     * Nombre: dimeTuMesDeNacimiento
     * Comentario: Recoge desde teclado el mes de nacimiento de la persona
     * Cabecera: int dimeTuDiaDeNacimiento()
     * Precondiciones: No hay
     * Entrada: - No hay
     * Salida:  - int mes
     * E/S: No hay
     * Postcondiciones: Por valor, el mes de nacimiento de la persona
     */
    static public int dimeTuMesDeNacimiento() {
        int mes = 0;
        do {
            System.out.println("Mes de nacimiento: ");
            mes = sc.nextInt();
        } while (mes < 1 || mes > 12);
        return mes;
    }

    /*
     * Nec: Nada
     * Dev: Un entero
     * Nec/Dev: No hay
     * Requisitos: El entero tiene que ser mayor que 0 y menor a 2100
     *
     * Interfaz Java
     * Nombre: dimeTuAnhoDeNacimiento
     * Comentario: Recoge desde teclado el anho de nacimiento de la persona
     * Cabecera: int dimeTuAnhoDeNacimiento()
     * Precondiciones: No hay
     * Entrada: - No hay
     * Salida:  - int anho
     * E/S: No hay
     * Postcondiciones: Por valor, el anho de nacimiento de la persona
     */
    static public int dimeTuAnhoDeNacimiento() {
        int anho = 0;
        do {
            System.out.println("Anho de nacimiento: ");
            anho = sc.nextInt();
        } while (anho < 0 || anho > 2100);
        return anho;
    }

    /*
     * Nec: Tres enteros
     * Dev: Un entero
     * Nec/Dev: No hay
     * Requisitos: - int dia (dia mayor que 0 y menor que 31)
     *             - int mes (mes mayor que 0 y menor que 12)
     *             - int anho (anho mayor que 0 y menor que 2100)
     *             - int numSuerte (numSuerte mayor que 0 inclusive y menor que 9 inclusive)
     *
     * Interfaz Java
     * Nombre: numeroSuerte
     * Comentario: Con el dia, mes y anho, devolvemos el valor del numero de la suerte
     * Cabecera: int numeroSuerte(int dia, int mes, int anho)
     * Precondiciones: - int dia (dia mayor que 0 y menor que 31)
     *                 - int mes (mes mayor que 0 y menor que 12)
     *                 - int anho (anho mayor que 0 y menor que 2100)
     * Entrada: - int dia //El dia de nacimiento de la persona
     *          - int mes //El mes de nacimiento de la persona
     *          - int anho //El anho de nacimiento de la persona
     * Salida:  - int numSuerte
     * E/S: No hay
     * Postcondiciones: Por valor, el numero de la suerte comprendido entre 0 y 9 inclusive
     */
    static public int numeroSuerte(int dia, int mes, int anho) {
        int valor = dia + mes + anho;
        int numSuerte = contarDigitos(valor);

        while (numSuerte < 0 || numSuerte > 9) {
            numSuerte = contarDigitos(numSuerte);
        }
        return numSuerte;
    }

    /*
     * Nec: Un entero
     * Dev: Un entero
     * Nec/Dev: No hay
     * Requisitos: El entero tiene que ser mayor que 0 y menor a 2100
     *
     * Interfaz Java
     * Nombre: contarDigitos
     * Comentario: Cuenta y suma los digitos del valor pasado por parametro
     * Cabecera:  int contarDigitos(int valor)
     * Precondiciones: No hay
     * Entrada: - int valor //El valor de la suma de la fecha de nacimiento
     * Salida:  - int numSuerte //El numero de la suerte de la persona
     * E/S: No hay
     * Postcondiciones: Por valor, El numero de la suerte de la persona
     */
    static public int contarDigitos(int valor) {
        int numSuerte = 0;
        ArrayList<Integer> array = new ArrayList<Integer>();
        while(valor > 0){
            array.add(valor % 10);
            valor /= 10;
        }
        for(int i = 0; i < array.size(); i++) {
            numSuerte += array.get(i);
        }
        return numSuerte;
    }
}
