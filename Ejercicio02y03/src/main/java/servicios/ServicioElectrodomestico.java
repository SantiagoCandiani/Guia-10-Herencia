/*
• Método comprobarConsumoEnergetico(char letra): comprueba que la letra es correcta,
sino es correcta usara la letra F por defecto. Este método se debe invocar al crear el
objeto y no será visible.
• Método comprobarColor(String color): comprueba que el color es correcto, y si no lo es,
usa el color blanco por defecto. Los colores disponibles para los electrodomésticos son
blanco, negro, rojo, azul y gris. No importa si el nombre está en mayúsculas o en
minúsculas. Este método se invocará al crear el objeto y no será visible.
• Metodo crearElectrodomestico(): le pide la información al usuario y llena el
electrodoméstico, también llama los métodos para comprobar el color y el consumo. Al
precio se le da un valor base de $1000.
• Método precioFinal(): según el consumo energético y su tamaño, aumentará el valor del
precio. Esta es la lista de precios:
LETRA PRECIO
A $1000
B $800
C $600
D $500
E $300
F $100
PESO PRECIO
Entre 1 y 19 kg $100
Entre 20 y 49 kg $500
Entre 50 y 79 kg $800
Mayor que 80 kg $1000
 */
package servicios;

import entidades.Electrodomestico;
import enums.Color;
import enums.Consumo;
import java.util.Scanner;

/**
 * @author scandiani
 */
public class ServicioElectrodomestico {

    public Scanner leer = new Scanner(System.in).useDelimiter("\n");
  

    private void comprobarConsumoEnergetico(Electrodomestico electro) {

        System.out.println("- CONSUMO ENERGETICO: Elija una letra de la siguiente lista:");
        for (Consumo aux : Consumo.values()) {
            System.out.println(aux);
        }
        String letraAux = leer.next();

        for (Consumo aux : Consumo.values()) {
            if (aux.toString().equalsIgnoreCase(letraAux)) {
                electro.setConsumoEnergetico(aux.toString().toUpperCase());
                break;
            } else {
                electro.setConsumoEnergetico("F");
            }
        }
    }

    private void comprobarColor(Electrodomestico electro) {
        System.out.println("- COLOR: Elija un color de la siguiente lista:");
        for (Color aux : Color.values()) {
            System.out.println(aux.getValorColor());
        }
        String colorAux = leer.next();

        for (Color aux : Color.values()) {
            if (aux.getValorColor().equalsIgnoreCase(colorAux)) {
                electro.setColor(aux.getValorColor());
                break;
            } else {
                electro.setColor("Blanco");
            }
        }
    }

    public void crearElectrodomestico(Electrodomestico electro) {

        electro.setPrecio(1000f);

        comprobarColor(electro);
        comprobarConsumoEnergetico(electro);

        System.out.println("Ingrese el peso:");
        Float peso = leer.nextFloat();
        electro.setPeso(peso);

    }

    public void precioFinal(Electrodomestico electro) {

        switch (electro.getConsumoEnergetico()) {
            case "A":
                electro.setPrecio(electro.getPrecio() + 1000);
                break;
            case "B":
                electro.setPrecio(electro.getPrecio() + 800);
                break;
            case "C":
                electro.setPrecio(electro.getPrecio() + 600);
                break;
            case "D":
                electro.setPrecio(electro.getPrecio() + 500);
                break;
            case "E":
                electro.setPrecio(electro.getPrecio() + 300);
                break;
            case "F":
                electro.setPrecio(electro.getPrecio() + 100);
                break;
        }

        float pesoAux = electro.getPeso();
        if (pesoAux >= 1 && pesoAux <= 19) {
            electro.setPrecio(electro.getPrecio() + 100);
        } else if (pesoAux >= 20 && pesoAux <= 49) {
            electro.setPrecio(electro.getPrecio() + 500);
        } else if (pesoAux >= 50 && pesoAux <= 79) {
            electro.setPrecio(electro.getPrecio() + 800);
        } else if (pesoAux >= 80) {
            electro.setPrecio(electro.getPrecio() + 1000);
        }
    }
}//class
