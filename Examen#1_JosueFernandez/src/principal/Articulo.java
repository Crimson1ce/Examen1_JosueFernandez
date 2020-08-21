package principal;

import java.awt.Color;

public abstract class Articulo {
    private String titulo;
    private Color color;
    private String descripcionArticulo;
    private String editorial;
    private int tamaño;
    private float puntuacion;
    private Persona personaRegistro;

    public Articulo() {
    }

    public Articulo(String titulo, Color color, String descripcionArticulo, String editorial, int tamaño, float puntuacion, Persona personaRegistro) {
        this.titulo = titulo;
        this.color = color;
        this.descripcionArticulo = descripcionArticulo;
        this.editorial = editorial;
        this.tamaño = tamaño;
        this.puntuacion = puntuacion;
        this.personaRegistro = personaRegistro;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public String getDescripcionArticulo() {
        return descripcionArticulo;
    }

    public void setDescripcionArticulo(String descripcionArticulo) {
        this.descripcionArticulo = descripcionArticulo;
    }

    public int getTamaño() {
        return tamaño;
    }

    public void setTamaño(int tamaño) {
        this.tamaño = tamaño;
    }

    public float getPuntuacion() {
        return puntuacion;
    }

    public void setPuntuacion(float puntuacion) {
        this.puntuacion = puntuacion;
    }

    public Persona getPersonaRegistro() {
        return personaRegistro;
    }

    public void setPersonaRegistro(Persona personaRegistro) {
        this.personaRegistro = personaRegistro;
    }

    @Override
    public String toString() {
        return "Articulo\n" + "Título=" + titulo + ", Color=" + color + ", Descripción=" + descripcionArticulo + ", Editorial=" + editorial + ", Tamaño=" + tamaño + ", Puntuación=" + puntuacion + ", Persona que lo registró=" + personaRegistro;
    }

}
