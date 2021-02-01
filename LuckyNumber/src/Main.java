/*
Se desea conocer el lucky number (numero de la suerte) de cualquier persona.
El numero de la suerte se consigue reduciendo la fecha de nacimiento a un numero de
un solo digito. Por ejemplo, la fecha de nacimiento de Emma es la siguiente: 16-08-1973 = 1997
--> 1+9+9+7 = 26 --> 2+6 = 8. El numero de la suerte de Emma es el 8

 * Nombre del programa: DividiendoyMultiplicando
 * Analisis
 * 	Entrada: - nombre //Nombre de la persona
 * 			 - dia //Dia de nacimiento de la persona
 * 			 - mes //Mes de nacimiento de la persona
 * 			 - anho //Anho de nacimiento de la persona
 *
 * 	Salida: - Mensajes con el usuario
 * 			- Eco de los datos
 * 			- Resultado del numero de la suerte de la persona
 *
 * 	Requisitos: - El numero de la suerte de la persona esta comprendido entre 0 y 9 inclusive
 * 	            - El dia de nacimiento de la persona esta comprendido entre 1 y 31 inclusive
 *              - El mes de nacimiento de la persona esta comprendido entre 1 y 12 inclusive
 * 	            - El anho de nacimiento de la persona esta comprendido entre 0 y 2100 inclusive
 * 	            - El nombre de la persona no puede estar vacio
 *
 * PG Level 0
 * Inicio
 * 	LeerNombrePersona
 *  LeerDiaNacimiento
 *  LeerMesNacimiento
 *  LeerAnhoNacimiento
 *  NumeroDeLaSuerte
 * Fin
 */

public class Main {
    public static void main (String[] args) {
        //Declaracion de variables
        String nombre = "";
        int dia = 0;
        int mes = 0;
        int anho = 0;

        //LeerNombrePersona
        System.out.println("Bienvenido a Lucky Number");
        nombre = Funcionalidades.dimeTuNombre();
        System.out.println("Hola " + nombre);

        //LeerDiaNacimiento
        System.out.println("Ahora te mostrare tu numero de la suerte, necesito tu fecha de nacimiento");
        dia = Funcionalidades.dimeTuDiaDeNacimiento();

        //LeerMesNacimiento
        mes = Funcionalidades.dimeTuMesDeNacimiento();

        //LeerAnhoNacimiento
        anho = Funcionalidades.dimeTuAnhoDeNacimiento();

        //NumeroDeLaSuerte
        System.out.println("Tu numero de la suerte es: " + Funcionalidades.numeroSuerte(dia, mes, anho));

    }
}
