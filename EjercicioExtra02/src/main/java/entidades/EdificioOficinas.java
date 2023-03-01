package entidades;

/**
 * @author scandiani
 */
public final class EdificioOficinas extends Edificio {

    private Integer cantOficinas;
    private Integer cantPersonas;
    private Integer cantPisos;

    public EdificioOficinas() {
    }

    public EdificioOficinas(Integer cantOficinas, Integer cantPersonas, Integer cantPisos) {
        this.cantOficinas = cantOficinas;
        this.cantPersonas = cantPersonas;
        this.cantPisos = cantPisos;
    }

    public EdificioOficinas(Integer cantOficinas, Integer cantPersonas, Integer cantPisos, Integer alto, Integer ancho, Integer largo) {
        super(alto, ancho, largo);
        this.cantOficinas = cantOficinas;
        this.cantPersonas = cantPersonas;
        this.cantPisos = cantPisos;
    }

    public Integer getCantOficinas() {
        return cantOficinas;
    }

    public void setCantOficinas(Integer cantOficinas) {
        this.cantOficinas = cantOficinas;
    }

    public Integer getCantPersonas() {
        return cantPersonas;
    }

    public void setCantPersonas(Integer cantPersonas) {
        this.cantPersonas = cantPersonas;
    }

    public Integer getCantPisos() {
        return cantPisos;
    }

    public void setCantPisos(Integer cantPisos) {
        this.cantPisos = cantPisos;
    }

    public void cantPersonas() {
        System.out.println("En cada piso pueden trabajar: " + (cantOficinas * cantPersonas) + " personas.");
        System.out.println("");
        System.out.println("En todo el edificio pueden trabajar: " + (cantOficinas * cantPersonas * cantPisos + " personas."));
    }

    @Override
    public int calcularSuperficie() {
        return alto * ancho * cantPisos;
    }

    @Override
    public int calcularVolumen() {
        return calcularSuperficie() * alto * cantPisos;
    }

    @Override
    public String toString() {
        return "EdificioOficinas{" + "cantOficinas=" + cantOficinas + ", cantPersonas=" + cantPersonas + ", cantPisos=" + cantPisos + '}';
    }

}//class
