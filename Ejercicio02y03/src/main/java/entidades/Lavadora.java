package entidades;

/**
 * @author scandiani
 */
public class Lavadora extends Electrodomestico {

    private Integer carga;

    public Lavadora() {
    }

    public Lavadora(Integer carga, Float precio, String color, String consumoEnergetico, Float peso) {
        super(precio, color, consumoEnergetico, peso);
        this.carga = carga;
    }

    public Integer getCarga() {
        return carga;
    }

    public void setCarga(Integer carga) {
        this.carga = carga;
    }

    @Override
    public String toString() {
        return "Lavadora= " + "Precio: " + precio + ", Color: " + color + ", Consumo Energetico: " + consumoEnergetico + ", Peso: " + peso + "\n"
                + "Carga: " + carga + "Kg.";
    }

}//class
