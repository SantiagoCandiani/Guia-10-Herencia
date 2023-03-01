package entidades;

/**
 * @author scandiani
 */
public abstract class Edificio {

    protected Integer alto;
    protected Integer ancho;
    protected Integer largo;

    public Edificio() {
    }

    public Edificio(Integer alto, Integer ancho, Integer largo) {
        this.alto = alto;
        this.ancho = ancho;
        this.largo = largo;
    }

    public Integer getAlto() {
        return alto;
    }

    public void setAlto(Integer alto) {
        this.alto = alto;
    }

    public Integer getAncho() {
        return ancho;
    }

    public void setAncho(Integer ancho) {
        this.ancho = ancho;
    }

    public Integer getLargo() {
        return largo;
    }

    public void setLargo(Integer largo) {
        this.largo = largo;
    }

    public abstract int calcularSuperficie();
    public abstract int calcularVolumen();

    @Override
    public String toString() {
        return "Edificio{" + "alto=" + alto + ", ancho=" + ancho + ", largo=" + largo + '}';
    }

}//class
