package entidades;

/**
 * @author scandiani
 */
public abstract class Electrodomestico {

    protected Float precio;
    protected String color;
    protected String consumoEnergetico;
    protected Float peso;

    public Electrodomestico() {
    }

    public Electrodomestico(Float precio, String color, String consumoEnergetico, Float peso) {
        this.precio = precio;
        this.color = color;
        this.consumoEnergetico = consumoEnergetico;
        this.peso = peso;
    }

    public Float getPrecio() {
        return precio;
    }

    public void setPrecio(Float precio) {
        this.precio = precio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getConsumoEnergetico() {
        return consumoEnergetico;
    }

    public void setConsumoEnergetico(String consumoEnergetico) {
        this.consumoEnergetico = consumoEnergetico;
    }

    public Float getPeso() {
        return peso;
    }

    public void setPeso(Float peso) {
        this.peso = peso;
    }

    @Override
    public String toString() {
        return "Electrodomestico= " + "Precio: " + precio + ", Color: " + color + ", Consumo Energetico: " + consumoEnergetico + ", Peso: " + peso + '.';
    }

}//class
