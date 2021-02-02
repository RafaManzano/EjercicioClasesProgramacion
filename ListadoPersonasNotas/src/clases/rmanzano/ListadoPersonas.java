package clases.rmanzano;

import java.util.Scanner;

/*
 * A una lista de personas mostraremos la siguiente informacion en un menu
 *    - Un listado de las personas por sexo introducido
 *    - Un listado de las personas aprobadas unicamente
 *    - Un listado de las personas que mayores de edad
 *    - Un listado de todas las personas del sistema
 *
 * Nombre del programa: ListadoPersonas
 * Analisis
 * 	Entrada: - Cinco personas
 *           - Un caracter (sexo)
 *           - Un numero (opcion)
 *
 * 	Salida: - Mensajes con el usuario
 * 			- Eco de los datos
 * 			- Diferentes listados correspondientes al menu
 *
 * 	Requisitos: - El caracter debe ser h, m o n
 *              - El numero debe estar comprendido de 0 a 4 inclusive
 *
 * PG Level 0
 * Inicio
 *  DeclaracionVariables
 *  MenuPricipal
 * Fin
 *
 * MenuPrincipal
 * Inicio
 *  Hacer
 *      Segun opcion
 *          caso 1:
 *              PersonasPorSexo
 *          caso 2:
 *              PersonasAprobadas
 *          caso 3:
 *              PersonasMayoresEdad
 *          caso 4:
 *              TodasPersonas
 *      Fin Segun
 *  Mientras no quiera salir
 * Fin
 */
public class ListadoPersonas {

    public static void main(String[] args) {
        //DeclaracionVariables
        Persona[] listPersonas = Funcionalidades.crearListadoPersonas();
        int opcion = 0;
        char sexo = ' ';
        Scanner teclado = new Scanner(System.in);

        //MenuPrincipal
        do {
            Funcionalidades.menuPrincipal();
            opcion = teclado.nextInt();
        }
        while (opcion < 0 || opcion > 4);

        while (opcion != 0) {
            switch (opcion) {
                case 1:
                    //PersonasPorSexo
                    do {
                        System.out.println("Elige el sexo que desea");
                        sexo = teclado.next().charAt(0);
                    }
                    while (sexo != 'h' && sexo != 'm' && sexo != 'n' && sexo != 'H' && sexo != 'M' && sexo != 'N');

                    Funcionalidades.personasPorSexo(listPersonas, Funcionalidades.cambiarSexoPorEnum(sexo));
                    break;

                case 2:
                    break;

                case 3:
                    break;

                case 4:
                    break;

            }

            //LeeryValidarOpcion
            do {
                Funcionalidades.menuPrincipal();
                opcion = teclado.nextInt();
            }
            while (opcion < 0 || opcion > 4);
        }
    }
}
