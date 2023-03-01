package entidades;

/**
 * @author scandiani
 */
public class Televisor extends Electrodomestico {

    private Integer pulgadas;
    private Boolean sintonizador;

    public Televisor() {
    }

    public Televisor(Integer pulgadas, Boolean sintonizador, Float precio, String color, String consumoEnergetico, Float peso) {
        super(precio, color, consumoEnergetico, peso);
        this.pulgadas = pulgadas;
        this.sintonizador = sintonizador;
    }

    public Integer getPulgadas() {
        return pulgadas;
    }

    public void setPulgadas(Integer pulgadas) {
        this.pulgadas = pulgadas;
    }

    public Boolean getSintonizador() {
        return sintonizador;
    }

    public void setSintonizador(Boolean sintonizador) {
        this.sintonizador = sintonizador;
    }

    @Override
    public String toString() {
        return "Televisor= " + "Precio: " + precio + ", Color: " + color + ", Consumo Energetico: " + consumoEnergetico + ", Peso: " + peso + "\n"
                + "Pulgadas: " + pulgadas + "'', Sintonizador: " + sintonizador + '.';
    }

}//class
