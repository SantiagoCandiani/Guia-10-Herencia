/*
Siguiendo el ejercicio anterior, en el main vamos a crear un ArrayList de Electrodomésticos
para guardar 4 electrodomésticos, ya sean lavadoras o televisores, con valores ya asignados.
Luego, recorrer este array y ejecutar el método precioFinal() en cada electrodoméstico. Se
deberá también mostrar el precio de cada tipo de objeto, es decir, el precio de todos los
televisores y el de las lavadoras. Una vez hecho eso, también deberemos mostrar, la suma del
precio de todos los Electrodomésticos. Por ejemplo, si tenemos una lavadora con un precio de
2000 y un televisor de 5000, el resultado final será de 7000 (2000+5000) para
electrodomésticos, 2000 para lavadora y 5000 para televisor.
 */
package ejercicio03;

import entidades.Electrodomestico;
import entidades.Lavadora;
import entidades.Televisor;
import java.util.ArrayList;
import servicios.ServiciosLavadora;
import servicios.ServiciosTelevisor;

/**
 * @author scandiani
 */
public class Ejercicio03 {

    public static void main(String[] args) {

        //---------------MAIN PARA EJERCICIO 03---------------//
        ServiciosLavadora serv1 = new ServiciosLavadora();
        ServiciosTelevisor serv2 = new ServiciosTelevisor();

        ArrayList<Electrodomestico> listaElectrodomesticos = new ArrayList();

        Lavadora lava1 = new Lavadora(110, 85000f, "Marron", "Z", 200f);
        listaElectrodomesticos.add(lava1);
        Lavadora lava2 = new Lavadora(50, 5000f, "Rojo", "D", 30f);
        listaElectrodomesticos.add(lava2);
        Televisor tele1 = new Televisor(29, false, 15000f, "Rosa", "Z", 80f);
        listaElectrodomesticos.add(tele1);
        Televisor tele2 = new Televisor(75  , true, 200000f, "Azul", "A", 120f);
        listaElectrodomesticos.add(tele2);

        float contLavas = 0;
        float contTeles = 0;
        float contTodos = 0;

        for (Electrodomestico auxElectro : listaElectrodomesticos) {
            if (auxElectro instanceof Lavadora) {
                Lavadora lav = (Lavadora) auxElectro;
                serv1.precioFinal(lav);
                System.out.println("Precio Lavadora: " + lav.getPrecio());
                contLavas += lav.getPrecio();
                contTodos += lav.getPrecio();
                continue;
            }

            if (auxElectro instanceof Televisor) {
                Televisor tv = (Televisor) auxElectro;
                serv2.precioFinal(tv);           
                System.out.println("Precio Televisor: " + tv.getPrecio());
                contTeles += tv.getPrecio();
                contTodos += tv.getPrecio();
            }
        }
        
        System.out.println("");
        System.out.println("La suma de precios de todas las LAVADORAS es: $" + contLavas + ".");
        System.out.println("La suma de precios de todos los TELEVISORES es: $" + contTeles + ".");
        System.out.println("La suma de precios de todos los ELECTRODOMESTICOS es: $" + contTodos + ".");

    }//main
}//class
