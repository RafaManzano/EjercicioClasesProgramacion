package clases.rmanzano;

public class Funcionalidades {
    /*
     * Nec: No hay
     * Dev: Un array de personas
     * Nec/Dev: No hay
     * Requisitos: No hay
     *
     * Interfaz
     * Nombre: crearListadoPersonas
     * Comentario: Crea un array de personas y lo devuelve
     * Cabecera: Persona[] crearListadoPersonas()
     * Precondiciones: No hay
     * Entrada: No hay
     * Salida: - Persona[] listPersona //Un array completo de personas
     * E/S: No hay
     * Postcondiciones: Por valor, un array de personas completo
     */
    public static Persona[] crearListadoPersonas() {
        Persona p1 = new Persona("Rafa", 20, "1", TipoSexo.NODEFINIDO, 80, 180, 5);
        Persona p2 = new Persona("Lucia", 30, "2", TipoSexo.MUJER, 60, 160, 3);
        Persona p3 = new Persona("Maria", 22, "3", TipoSexo.MUJER, 75, 155, 8);
        Persona p4 = new Persona("David", 15, "4", TipoSexo.HOMBRE, 100, 170, 9);
        Persona p5 = new Persona("Daniel", 53, "5", TipoSexo.HOMBRE, 90, 200, 1);
        Persona[] listPersonas = new Persona[5];
        listPersonas[0] = p1;
        listPersonas[1] = p2;
        listPersonas[2] = p3;
        listPersonas[3] = p4;
        listPersonas[4] = p5;
        return listPersonas;
    }

    /*
     * Nec: No hay
     * Dev: No hay
     * Nec/Dev: No hay
     * Requisitos: No hay
     *
     * Interfaz
     * Nombre: menuPrincipal
     * Comentario: Pinta el menu
     * Cabecera: void menuPrincipal()
     * Precondiciones: No hay
     * Entrada: No hay
     * Salida: No hay
     * E/S: No hay
     * Postcondiciones: Solo pinta el menu principal
     */

    public static void menuPrincipal() {
        System.out.println("Elija una opcion");
        System.out.println("1. Personas Por Sexo");
        System.out.println("2. Personas Aprobadas");
        System.out.println("3. Personas Mayores de Edad");
        System.out.println("4. Todas las Personas");
        System.out.println("0. Salir");
    }

    /*
     * Nec: - Un listado de personas
     *      - Un tipo Sexo (sexo)
     * Dev: No hay
     * Nec/Dev: No hay
     * Requisitos: No hay
     *
     * Interfaz
     * Nombre: personasPorSexo
     * Comentario: Muestra en la pantalla las personas por el sexo introducido por parametros
     * Cabecera: void personasPorSexo(Persona[] listPersonas, TipoSexo sexo)
     * Precondiciones: No hay
     * Entrada: - Persona[] listPersonas //El listado de personas
     *          - TipoSexo sexo //El sexo de la persona que debemos mostrar
     * Salida: No hay
     * E/S: No hay
     * Postcondiciones: Pinta aquellas personas que coincidan con el sexo
     */
    public static void personasPorSexo(Persona[] listPersonas, TipoSexo sexo) {
        for (int i = 0; i < listPersonas.length; i++) {
            if (listPersonas[i].getSexo() == sexo) {
               listPersonas[i].pintarNombreYSexo();
            }
        }
    }

    /*
     * Nec: - char sexo
     * Dev: - TipoSexo tipo
     * Nec/Dev: No hay
     * Requisitos: No hay
     *
     * Interfaz
     * Nombre: cambiarSexoPorEnum
     * Comentario: Cambia el caracter por un tipo predefinido
     * Cabecera: TipoSexo cambiarSexoPorEnum(char sexo)
     * Precondiciones: No hay
     * Entrada: - char sexo //El sexo predefinido por una letra
     * Salida: - TipoSexo tipo //El tipo predefinido
     * E/S: No hay
     * Postcondiciones: Por valor, cambia el caracter por el tipo correspondiente
     */
    public static TipoSexo cambiarSexoPorEnum(char sexo) {
        TipoSexo tipo = TipoSexo.NODEFINIDO;
        switch (sexo) {
            case 'h', 'H':
                tipo = TipoSexo.HOMBRE;
                break;
            case 'm', 'M':
                tipo = TipoSexo.MUJER;
                break;
        }
        return tipo;
    }
}
