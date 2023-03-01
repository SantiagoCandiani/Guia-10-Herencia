package enums;

/**
 *
 * @author scand
 */
public enum Color {
    BLANCO("Blanco"), NEGRO("Negro"), ROJO("Rojo"), AZUL("Azul"), GRIS("Gris") ;

    private String valorColor;

    private Color() {
    }

    private Color(String valor) {
        this.valorColor = valor;
    }

    public String getValorColor() {
        return valorColor;
    }

}
