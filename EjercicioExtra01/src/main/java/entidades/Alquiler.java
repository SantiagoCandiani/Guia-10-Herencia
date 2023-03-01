/*
En un puerto se alquilan amarres para barcos de distinto tipo. Para cada Alquiler se guarda: el
nombre, documento del cliente, la fecha de alquiler, fecha de devolución, la posición del
amarre y el barco que lo ocupará.
 */
package entidades;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 * @author scandiani
 */
public class Alquiler {

    private String nombreCliente;
    private Integer documentoCliente;
    private LocalDate fechaAlquiler;
    private LocalDate fechaDevolucion;
    private String posicionAmarre;
    private Barco barco;

    public Alquiler() {
    }

    public Alquiler(String nombreCliente, Integer documentoCliente, LocalDate fechaAlquiler, LocalDate fechaDevolucion, String posicionAmarre, Barco barco) {
        this.nombreCliente = nombreCliente;
        this.documentoCliente = documentoCliente;
        this.fechaAlquiler = fechaAlquiler;
        this.fechaDevolucion = fechaDevolucion;
        this.posicionAmarre = posicionAmarre;
        this.barco = barco;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public Integer getDocumentoCliente() {
        return documentoCliente;
    }

    public void setDocumentoCliente(Integer documentoCliente) {
        this.documentoCliente = documentoCliente;
    }

    public LocalDate getFechaAlquiler() {
        return fechaAlquiler;
    }

    public void setFechaAlquiler(LocalDate fechaAlquiler) {
        this.fechaAlquiler = fechaAlquiler;
    }

    public LocalDate getFechaDevolucion() {
        return fechaDevolucion;
    }

    public void setFechaDevolucion(LocalDate fechaDevolucion) {
        this.fechaDevolucion = fechaDevolucion;
    }

    public String getPosicionAmarre() {
        return posicionAmarre;
    }

    public void setPosicionAmarre(String posicionAmarre) {
        this.posicionAmarre = posicionAmarre;
    }

    public Barco getBarco() {
        return barco;
    }

    public void setBarco(Barco barco) {
        this.barco = barco;
    }

    @Override
    public String toString() {
        return "Alquiler= " + "Nombre del Cliente: " + nombreCliente + ", Documento del Cliente: " + documentoCliente + ".\n"
                + "- Fecha de Alquiler: " + fechaAlquiler.format(DateTimeFormatter.ofPattern("dd MMM YYYY")) + ".\n"
                + "- Fecha de Devolucion: " + fechaDevolucion.format(DateTimeFormatter.ofPattern("dd MMM YYYY")) + ".\n"
                + "- Posicion de Amarre: " + posicionAmarre + ".\n"
                + "- Tipo de Barco: " + barco;
    }

}//class
