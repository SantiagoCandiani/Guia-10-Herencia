/*
Tenemos una clase padre Animal junto con sus 3 clases hijas Perro, Gato, Caballo.
La clase Animal tendrá como atributos el nombre, alimento, edad y raza del Animal.
Crear un método en la clase Animal a través del cual cada clase hija deberá mostrar luego un
mensaje por pantalla informando de que se alimenta. Generar una clase Main que realice lo
siguiente:
 */
package ejercicio01;

import entidades.Animal;
import entidades.Caballo;
import entidades.Gato;
import entidades.Perro;

/**
 *
 * @author scand
 */
public class Ejercicio01 {

    public static void main(String[] args) {

        Animal perro1 = new Perro("Stich", "Carne", 15, "Doberman");
        Animal perro2 = new Perro("Teddy", "Croquetas", 10, "Chihuahua");
        Animal gato1 = new Gato("Pelusa", "Galletas", 15, "Siames");
        Animal caballo1 = new Caballo("Spark", "Pasto", 25, "Fino");
        
        perro1.alimentarse();
        perro2.alimentarse();
        gato1.alimentarse();
        caballo1.alimentarse();
    
    }//main
}//class
