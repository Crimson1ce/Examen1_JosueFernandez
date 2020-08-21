package principal;

import java.util.ArrayList;

public class Persona {
    
    //Atributos
    private int identificacion;
    private String nombrePersona;
    private int edad;
    private String sexo;
    private String estadoCivil;
    private int altura;
    private int peso;
    private ArrayList<Mensaje> mensajesEnviados = new ArrayList();
    private ArrayList<Mensaje> mensajesRecibidos = new ArrayList();

    //Constructores
    public Persona() {
    }

    public Persona(int identificacion, String nombrePersona, int edad) {
        this.identificacion = identificacion;
        this.nombrePersona = nombrePersona;
        this.edad = edad;
    }

    public Persona(int identificacion, String nombrePersona, int edad, String sexo, String estadoCivil, int altura, int peso) {
        this.identificacion = identificacion;
        this.nombrePersona = nombrePersona;
        this.edad = edad;
        this.sexo = sexo;
        this.estadoCivil = estadoCivil;
        this.altura = altura;
        this.peso = peso;
    }
    
    //Getters y setters
    public int getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(int identificacion) {
        this.identificacion = identificacion;
    }

    public String getNombrePersona() {
        return nombrePersona;
    }

    public void setNombrePersona(String nombrePersona) {
        this.nombrePersona = nombrePersona;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public ArrayList<Mensaje> getMensajesEnviados() {
        return mensajesEnviados;
    }

    public void setMensajesEnviados(ArrayList<Mensaje> mensajesEnviados) {
        this.mensajesEnviados = mensajesEnviados;
    }

    public ArrayList<Mensaje> getMensajesRecibidos() {
        return mensajesRecibidos;
    }

    public void setMensajesRecibidos(ArrayList<Mensaje> mensajesRecibidos) {
        this.mensajesRecibidos = mensajesRecibidos;
    }

    @Override
    public String toString() {
        return nombrePersona;//"Persona\n" + "Identificacion=" + identificacion + ", Nombre persona=" + nombrePersona + ", Edad=" + edad + ", Sexo=" + sexo + ", Estado civil=" + estadoCivil + ", Altura=" + altura + ", Peso=" + peso;
    }

}
