package entidades;

/**
 * @author scandiani
 */
public abstract class ExtraHotelero extends Alojamiento {

    private Boolean esPrivado;
    private Float metrosOcupa;

    public ExtraHotelero() {
    }

    public ExtraHotelero(Boolean esPrivado, Float metrosOcupa, String nombreAlojamiento, String direccionAlojamiento, String localidadAlojamiento, String nombreGerente) {
        super(nombreAlojamiento, direccionAlojamiento, localidadAlojamiento, nombreGerente);
        this.esPrivado = esPrivado;
        this.metrosOcupa = metrosOcupa;
    }

    @Override
    public String toString() {
        return "Alojamiento Extra Hotelero " + nombreAlojamiento + "= Es Privado: " + esPrivado + ", Superficie: " + metrosOcupa + "m2.";
    }

}//class
