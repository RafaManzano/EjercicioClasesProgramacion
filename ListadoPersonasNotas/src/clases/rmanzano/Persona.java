package clases.rmanzano;

/*
 * Nombre de la clase: Persona
 *
 * Propiedades Basicas
 *
 * Nombre
 * Tipo: String
 * Consultable: Si
 * Modificable: Si
 *
 * Edad
 * Tipo: Int
 * Consultable: Si
 * Modificable: Si
 *
 * DNI
 * Tipo: String
 * Consultable: Si
 * Modificable: No
 *
 * Sexo
 * Tipo: TipoSexo
 * Consultable: Si
 * Modificable: Si
 *
 * Peso
 * Tipo: Int
 * Consultable: Si
 * Modificable: Si
 *
 * Altura
 * Tipo: Int
 * Consultable: Si
 * Modificable: Si
 *
 * Nota
 * Tipo: Int
 * Consultable: Si
 * Modificable: Si
 *
 * Propiedades Derivadas
 * No hay
 *
 * Propiedades Compartidas
 * ID
 * Tipo: Int
 * Consultable: Si
 * Modificable: No
 *
 * Get and Set
 * Nombre
 * public String getNombre()
 * public void setNombre (String nombre)
 *
 * Edad
 * public int getEdad()
 * public void setEdad(int edad)
 *
 * DNI
 * public String getDNI()
 *
 * Sexo
 * public TipoSexo getSexo()
 * public void setSexo (TipoSexo sexo)
 *
 * Peso
 * public int getPeso()
 * public void setPeso(int peso)
 *
 * Altura
 * public int getAltura()
 * public void setAltura(int altura)
 *
 * ID
 * public int getID()
 *
 * Nota
 * public int getNota()
 * public void setNota(int nota)
 *
 * Resticciones
 * Edad mayor que 0
 * Peso mayor que 0
 * Altura mayor que 0
 * Nota tiene que estar comprendida entre 0 y 10 inclusive
 *
 * Metodos añadidos
 * No hay
 */

public class Persona implements Cloneable, Comparable<Persona> {

    //Atributos
    private String nombre;
    private int edad;
    private String DNI;
    private TipoSexo sexo;
    private int peso;
    private int altura;
    private int idPersona;
    private int nota;
    private static int id = 1;


    //Constructores
    public Persona() { //Por defecto
        nombre = " ";
        edad = 0;
        DNI = " ";
        sexo = sexo.NODEFINIDO;
        peso = 0;
        altura = 0;
        nota = 0;
        idPersona = id++;
    }

    public Persona(String nombre, int edad, String DNI, TipoSexo sexo, int peso, int altura, int nota) { //Con parametros
        this.nombre = nombre;
        this.edad = edad;
        this.DNI = DNI;
        this.sexo = sexo;
        this.peso = peso;
        this.altura = altura;
        this.nota = nota;
        idPersona = id++;
    }

    public Persona(Persona copia) { //De copia
        this.nombre = copia.getNombre();
        this.edad = copia.getEdad();
        this.DNI = copia.getDNI();
        this.sexo = copia.getSexo();
        this.peso = copia.getPeso();
        this.altura = copia.getAltura();
        this.nota = copia.getNota();
        this.idPersona = id++;
    }

    //Get and Set
    //Nombre
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    //Edad
    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    //DNI
    public String getDNI() {
        return DNI;
    }

    //Sexo
    public TipoSexo getSexo() {
        return sexo;
    }

    public void setSexo(TipoSexo sexo) {
        this.sexo = sexo;
    }

    //Peso
    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) throws ExcepcionPersona {

        if (peso > 0) {
            this.peso = peso;
        } else {
            throw new ExcepcionPersona("El peso tiene que ser mayor que 0");
        }
    }

    //Altura
    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) throws ExcepcionPersona {

        if (altura > 0) {
            this.altura = altura;
        } else {
            throw new ExcepcionPersona("La altura debe ser mayor a 0");
        }
    }

    //Nota
    public int getNota() {
        return nota;
    }

    public void setNota(int nota) throws ExcepcionPersona {
        if (nota >= 0 && nota <= 10) {
            this.nota = nota;
        } else {
            throw new ExcepcionPersona("La nota debe estar comprendida entre 0 y 10");
        }
    }

    //ID
    public int getIDPersona() {
        return idPersona;
    }

    //Metodos de la clase object
    //toString
    @Override
    public String toString() {
        return id + " " + nombre + " " + edad + " " + DNI + " " + sexo + " " + peso + " " + altura;
    }

    //hashCode
    @Override
    public int hashCode() {
        return 1892544 * id - edad + peso * altura * 200 - 10;
    }

    //Equals
    @Override
    public boolean equals(Object obj) {
        boolean res = false;

        //1. Comprobamos que obj no es el mismo objeto, si lo es, devolveremos true
        if (this == obj) {
            res = true;
        }

        //2. Comprobamos que obj no vale null (no esta instanciado) y que pertenece es el mismo tipo de dato, si no, devolveremos false
        else if (obj != null && obj instanceof Persona) {

            //3. Casteamos obj al tipo de dato
            Persona otro = (Persona) obj;

            //4. Comparamos los atributos uno a uno y si todos coinciden, devolveremos true
            if (this.nombre == otro.getNombre() &&
                    this.id == otro.getIDPersona() &&
                    this.edad == otro.getEdad() &&
                    this.DNI == otro.getDNI() &&
                    this.sexo == otro.getSexo() &&
                    this.peso == otro.getPeso() &&
                    this.altura == otro.getAltura()) {
                res = true;
            }
        }
        return res;
    }

    //clone
    @Override
    public Persona clone() {
        Persona copia = null;

        try {
            copia = (Persona) super.clone();
        } catch (CloneNotSupportedException error) {
            System.out.println("Objeto no clonado");
        }
        return copia;
    }

    //compareTo
    //Comparamos a las personas por su altura
    // -1 primera persona mas baja que la segunda
    // 0 las personas tienen la misma estatura
    // 1 la primera persona es mas alta que la segunda


    public int compareTo(Persona segunda) {
        int res = -1;

        if (this.getAltura() > segunda.getAltura()) {
            res = 1;
        } else if (this.getAltura() == segunda.getAltura()) {
            res = 0;
        }
        return res;
    }


    public void pintarNombreYSexo() {
        System.out.println(this.nombre + " " + this.sexo);
    }
}

