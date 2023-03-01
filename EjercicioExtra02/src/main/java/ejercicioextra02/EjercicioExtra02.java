/*
Crear una superclase llamada Edificio con los siguientes atributos: ancho, alto y largo. La clase
edificio tendrá como métodos:
• Método calcularSuperficie(): calcula la superficie del edificio.
• Método calcularVolumen(): calcula el volumen del edifico.
Estos métodos serán abstractos y los implementarán las siguientes clases:
• Clase Polideportivo con su nombre y tipo de instalación que puede ser Techado o
Abierto, esta clase implementará los dos métodos abstractos y los atributos del padre.
• Clase EdificioDeOficinas con sus atributos número de oficinas, cantidad de personas
por oficina y número de pisos. Esta clase implementará los dos métodos abstractos y
los atributos del padre.
De esta clase nos interesa saber cuántas personas pueden trabajar en todo el edificio, el
usuario dirá cuántas personas entran en cada oficina, cuantas oficinas y el número de piso
(suponiendo que en cada piso hay una oficina). Crear el método cantPersonas(), que muestre
cuantas personas entrarían en un piso y cuantas en todo el edificio.
Por último, en el main vamos a crear un ArrayList de tipo Edificio. El ArrayList debe contener
dos polideportivos y dos edificios de oficinas. Luego, recorrer este array y ejecutar los
métodos calcularSuperficie y calcularVolumen en cada Edificio. Se deberá mostrar la
superficie y el volumen de cada edificio.
Además de esto, para la clase Polideportivo nos interesa saber cuántos polideportivos son
techados y cuantos abiertos. Y para la clase EdificioDeOficinas deberemos llamar al método
cantPersonas() y mostrar los resultados de cada edificio de oficinas.
 */
package ejercicioextra02;

import entidades.Edificio;
import entidades.EdificioOficinas;
import entidades.Polideportivo;
import java.util.ArrayList;

/**
 *
 * @author scand
 */
public class EjercicioExtra02 {

    public static void main(String[] args) {

        ArrayList<Edificio> listaEdificios = new ArrayList();

        listaEdificios.add(new Polideportivo("Polideportivo 1", "Techado", 20, 10, 30));
        listaEdificios.add(new Polideportivo("Polideportivo 2", "Abierto", 30, 15, 40));

        listaEdificios.add(new EdificioOficinas(10, 20, 5, 50, 20, 40));
        listaEdificios.add(new EdificioOficinas(20, 15, 8, 60, 25, 50));

        for (Edificio edifAux : listaEdificios) {
            System.out.println("Superficie de " + edifAux.getClass().getSimpleName() + ": " + edifAux.calcularSuperficie()+"m2.");
            System.out.println("Volumen de " + edifAux.getClass().getSimpleName() + ": " + edifAux.calcularVolumen()+"m3.");
            if (edifAux instanceof Polideportivo) {
                Polideportivo polideportivo = (Polideportivo) edifAux;
                if (polideportivo.getTipoInstalacion().equals("Techado")) {
                    System.out.println(polideportivo.getNombre() + " es un polideportivo techado.");
                } else {
                    System.out.println(polideportivo.getNombre() + " es un polideportivo abierto.");
                }
            } else if (edifAux instanceof EdificioOficinas) {
                EdificioOficinas edificioDeOficinas = (EdificioOficinas) edifAux;
                edificioDeOficinas.cantPersonas();
            }
            System.out.println();
        }

    }//main
}//class
