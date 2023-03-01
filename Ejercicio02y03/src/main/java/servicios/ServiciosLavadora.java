/*
• Método crearLavadora (): este método llama a crearElectrodomestico() de la clase
padre, lo utilizamos para llenar los atributos heredados del padre y después llenamos
el atributo propio de la lavadora.
• Método precioFinal(): este método será heredado y se le sumará la siguiente
funcionalidad. Si tiene una carga mayor de 30 kg, aumentará el precio en $500, si la
carga es menor o igual, no se incrementará el precio. Este método debe llamar al
método padre y añadir el código necesario. Recuerda que las condiciones que hemos
visto en la clase Electrodoméstico también deben afectar al precio.
 */
package servicios;

import entidades.Electrodomestico;
import entidades.Lavadora;

/**
 * @author scandiani
 */
public class ServiciosLavadora extends ServicioElectrodomestico {

    public Lavadora crearLavadora() {

        Lavadora lava = new Lavadora();

        super.crearElectrodomestico(lava);
        
        System.out.println("Ingrese la carga de la lavadora: ");
        lava.setCarga(leer.nextInt());

        precioFinal(lava);

        System.out.println(lava);

        return lava;
    }

    @Override
    public void precioFinal(Electrodomestico electro) {

        Lavadora lava = (Lavadora) electro; // asi se castea, creo la lavadora

        super.precioFinal(lava);

        if (lava.getCarga() > 30) {
            lava.setPrecio(lava.getPrecio() + 500);
        }
    }

}//class
