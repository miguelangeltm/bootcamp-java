/*
Vamos a crear una clase llamada Persona. Sus atributos son:
id, nombre, edad, fecha de nacimiento y DNI.
Construye los siguientes métodos para la clase:
Un constructor, donde los datos pueden estar vacíos.
Los setters y getters para cada uno de los atributos.
mostrar(): Muestra los datos de la persona.
esMayorDeEdad(): Devuelve un valor lógico indicando si es mayor de edad.
 */

public class Persona {
    int id;
    String nombre;
    int edad;
    String fechaNacimiento;
    int dni;

    public Persona(int id, String nombre, int edad, String fechaNacimiento, int dni) {
        this.nombre = nombre;
        this.edad = edad;
        this.fechaNacimiento = fechaNacimiento;
        this.dni = dni;
    }

    public Persona() {

    }


    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public int getDni() {
        return dni;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public void mostrar() {
        System.out.println("Los datos de " + nombre + "son:\n "
                + "nombre: " + nombre + "\n"
                + "Edad:" + edad + "\n"
                + "Fecha de nacimiento: " + fechaNacimiento + "\n"
                + "DNI: " + dni + "\n"
                + "Es mayor de edad :" + (esMayorDeEdad() ? "Si":"No"));
    }

    public Boolean esMayorDeEdad(){
        return edad >= 18;
    }
}
