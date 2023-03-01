package entidades;

/**
 * @author scandiani
 */
public class Gato extends Animal {

    public Gato(String nombre, String alimento, Integer edad, String raza) {
        super(nombre, alimento, edad, raza);
    }

    @Override
    public void alimentarse() {
        System.out.println(nombre + " es un " + raza + ", tiene " + edad +  " y se alimeta de " + alimento);
    }

}//class
