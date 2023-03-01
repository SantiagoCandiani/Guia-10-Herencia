package entidades;

/**
 * @author scandiani
 */
public final class Camping extends ExtraHotelero {

    private Integer maxCarpas;
    private Integer cantBanios;
    private Boolean tieneRestaurante;

    public Camping() {
    }

    public Camping(Integer maxCarpas, Integer cantBanios, Boolean tieneRestaurante, Boolean privado, Float metrosOcupa, String nombre, String direccion, String localidad, String gerente) {
        super(privado, metrosOcupa, nombre, direccion, localidad, gerente);
        this.maxCarpas = maxCarpas;
        this.cantBanios = cantBanios;
        this.tieneRestaurante = tieneRestaurante;
    }
    
    //El unico SET y GET que me hace falta
    public Boolean getTieneRestaurante() {
        return tieneRestaurante;
    }

    public void setTieneRestaurante(Boolean tieneRestaurante) {
        this.tieneRestaurante = tieneRestaurante;
    }
    
    @Override
    public String toString() {
        return "Camping " + nombreAlojamiento + "= Maxima Cant. de Carpas: " + maxCarpas + ", Cant. de Baños: " + cantBanios + ", Restaurante: " + tieneRestaurante + '.';
    }

}//class
