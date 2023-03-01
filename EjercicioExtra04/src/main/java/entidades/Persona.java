package entidades;

/**
 * @author scandiani
 */
public abstract class Persona {

    protected String nombre;
    protected String apellido;
    protected Integer documento;
    protected String estadoCivil;

    public Persona() {
    }

    public Persona(String nombre, String apellido, Integer documento, String estadoCivil) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.documento = documento;
        this.estadoCivil = estadoCivil;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Integer getDocumento() {
        return documento;
    }

    public void setDocumento(Integer documento) {
        this.documento = documento;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    //Metodos
    public void cambiarEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + ", Apellido: " + apellido + ", Documento: " + documento + ", Estado Civil: " + estadoCivil + ".\n";
    }

}//class
