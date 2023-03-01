package entidades;

/**
 * @author scandiani
 */
public abstract class Alojamiento {

    protected String nombreAlojamiento;
    protected String direccionAlojamiento;
    protected String localidadAlojamiento;
    protected String nombreGerente;

    public Alojamiento() {
    }

    public Alojamiento(String nombreAlojamiento, String direccionAlojamiento, String localidadAlojamiento, String nombreGerente) {
        this.nombreAlojamiento = nombreAlojamiento;
        this.direccionAlojamiento = direccionAlojamiento;
        this.localidadAlojamiento = localidadAlojamiento;
        this.nombreGerente = nombreGerente;
    }

    public String getNombreAlojamiento() {
        return nombreAlojamiento;
    }

    public void setNombreAlojamiento(String nombreAlojamiento) {
        this.nombreAlojamiento = nombreAlojamiento;
    }

    @Override
    public String toString() {
        return "Alojamiento " + nombreAlojamiento + "= Direccion: " + direccionAlojamiento + ", Localidad: " + localidadAlojamiento + ", Gerente: " + nombreGerente + '.';
    }

}//class
