package entidades;

/**
 * @author scandiani
 */
public class Profesor extends Empleado {

    private String departamento;

    public Profesor() {
    }

    public Profesor(String departamento, String anioIncorporacion, Integer nroDespacho, String nombre, String apellido, Integer documento, String estadoCivil) {
        super(anioIncorporacion, nroDespacho, nombre, apellido, documento, estadoCivil);
        this.departamento = departamento;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    //metodos
    public void cambiarDepartamento(String departamento) {
        this.departamento = departamento;
    }

    @Override
    public String toString() {
        return "Profesor= " + super.toString() + "Departamento: " + departamento + '.';
    }

}//class
