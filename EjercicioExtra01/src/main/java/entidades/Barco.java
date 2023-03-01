/*
Un Barco se caracteriza por: su matrícula, su eslora en metros y año de fabricación.
Sin embargo, se pretende diferenciar la información de algunos tipos de barcos especiales:
• Número de mástiles para veleros.
• Potencia en CV para barcos a motor.
• Potencia en CV y número de camarotes para yates de lujo.
 */
package entidades;

/**
 * @author scandiani
 */
public abstract class Barco {

    protected Integer matricula;
    protected Integer metrosEslora;
    protected Integer anioFabricacion;

    public Barco() {
    }

    public Barco(Integer matricula, Integer metrosEslora, Integer anioFabricacion) {
        this.matricula = matricula;
        this.metrosEslora = metrosEslora;
        this.anioFabricacion = anioFabricacion;
    }

    public Integer getMatricula() {
        return matricula;
    }

    public void setMatricula(Integer matricula) {
        this.matricula = matricula;
    }

    public Integer getMetrosEslora() {
        return metrosEslora;
    }

    public void setMetrosEslora(Integer metrosEslora) {
        this.metrosEslora = metrosEslora;
    }

    public Integer getAnioFabricacion() {
        return anioFabricacion;
    }

    public void setAnioFabricacion(Integer anioFabricacion) {
        this.anioFabricacion = anioFabricacion;
    }
    
    public Integer calcularModulo(){
        return metrosEslora*10;
    }

    @Override
    public String toString() {
        return "Barco= " + "Matricula: " + matricula + ", Metros de Eslora: " + metrosEslora + ", Año de Fabricacion: " + anioFabricacion + '.';
    }

}//class
