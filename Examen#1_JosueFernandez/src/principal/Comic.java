package principal;

import java.awt.Color;

public class Comic extends Articulo{
    private int numeroVolumen;
    private String descripcionComic;
    private int estadoCalidad;

    public Comic() {
    }

    public Comic(int numeroVolumen, String descripcionComic, int estadoCalidad, String titulo, Color color, String descripcionArticulo, String editorial, int tamaño, float puntuacion, Persona personaRegistro) {
        super(titulo, color, descripcionArticulo, editorial, tamaño, puntuacion, personaRegistro);
        this.numeroVolumen = numeroVolumen;
        this.descripcionComic = descripcionComic;
        this.estadoCalidad = estadoCalidad;
    }

    public int getEstadoCalidad() {
        return estadoCalidad;
    }

    public void setEstadoCalidad(int estadoCalidad) {
        this.estadoCalidad = estadoCalidad;
    }

    public int getNumeroVolumen() {
        return numeroVolumen;
    }

    public void setNumeroVolumen(int numeroVolumen) {
        this.numeroVolumen = numeroVolumen;
    }

    public String getDescripcionComic() {
        return descripcionComic;
    }

    public void setDescripcionComic(String descripcionComic) {
        this.descripcionComic = descripcionComic;
    }

    @Override
    public String toString() {
        return "Comic\n" + "Número de volumen=" + numeroVolumen + ", Descripción=" + descripcionComic + ", Estado de calidad=" + estadoCalidad;
    }
    
}
