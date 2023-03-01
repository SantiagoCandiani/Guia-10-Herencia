package entidades;

/**
  * @author scandiani
 */
public class Animal {

    protected String nombre;
    protected String alimento;
    protected Integer edad;
    protected String raza;

    public Animal(String nombre, String alimento, Integer edad, String raza) {
        this.nombre = nombre;
        this.alimento = alimento;
        this.edad = edad;
        this.raza = raza;
    }
    
    public void alimentarse(){
        System.out.println("Se alimeta de comida");
    }


}//class
