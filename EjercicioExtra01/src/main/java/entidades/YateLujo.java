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
public class YateLujo extends BarcoMotor {

    protected Integer nroCamarotes;

    public YateLujo(Integer nroCamarotes, Integer potencia, Integer matricula, Integer metrosEslora, Integer anioFabricacion) {
        super(potencia, matricula, metrosEslora, anioFabricacion);
        this.nroCamarotes = nroCamarotes;
    }

    public Integer getNroCamarotes() {
        return nroCamarotes;
    }

    public void setNroCamarotes(Integer nroCamarotes) {
        this.nroCamarotes = nroCamarotes;
    }

    @Override
    public Integer calcularModulo() {
        return super.calcularModulo() + nroCamarotes + super.potencia;
    }

    @Override
    public String toString() {
        return "YateLujo= " + "Nro de Camarotes: " + nroCamarotes + '.';
    }

}//class
