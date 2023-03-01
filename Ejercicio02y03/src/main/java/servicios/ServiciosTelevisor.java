/*
• Método crearTelevisor(): este método llama a crearElectrodomestico() de la clase
padre, lo utilizamos para llenar los atributos heredados del padre y después llenamos
los atributos del televisor.
• Método precioFinal(): este método será heredado y se le sumará la siguiente
funcionalidad. Si el televisor tiene una resolución mayor de 40 pulgadas, se
incrementará el precio un 30% y si tiene un sintonizador TDT incorporado, aumentará
$500. Recuerda que las condiciones que hemos visto en la clase Electrodomestico
también deben afectar al precio.
 */
package servicios;

import entidades.Electrodomestico;
import entidades.Televisor;

/**
 * @author scandiani
 */
public class ServiciosTelevisor extends ServicioElectrodomestico {

    public Televisor crearTelevisor() {

        Televisor tele = new Televisor();

        super.crearElectrodomestico(tele);

        System.out.println("Ingrese las pulgadas del televisor:");
        tele.setPulgadas(leer.nextInt());

        System.out.println("El televisor tiene sintonizador TDT (SI/NO)?");
        String flag = leer.next();

        if (flag.equalsIgnoreCase("SI")) {
            tele.setSintonizador(Boolean.TRUE);
        } else {
            tele.setSintonizador(false);
        }

        precioFinal(tele);

        System.out.println(tele);

        return tele;
    }

    @Override
    public void precioFinal(Electrodomestico electro) {

        Televisor tele = (Televisor) electro; // asi se castea, creo el tele

        super.precioFinal(tele);
        if (tele.getPulgadas() > 40) {
            tele.setPrecio(tele.getPrecio() * 1.3f);
        }
        if (tele.getSintonizador()) {
            tele.setPrecio(tele.getPrecio() + 500);
        }
    }
}//class
