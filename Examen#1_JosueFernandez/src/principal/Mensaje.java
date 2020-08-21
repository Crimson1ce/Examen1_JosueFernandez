package principal;

public class Mensaje {
    
    private Persona emisor;
    private Persona receptor;
    private String mensaje;

    public Persona getEmisor() {
        return emisor;
    }

    public void setEmisor(Persona emisor) {
        this.emisor = emisor;
    }

    public Persona getReceptor() {
        return receptor;
    }

    public void setReceptor(Persona receptor) {
        this.receptor = receptor;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    @Override
    public String toString() {
        return mensaje;//"Mensaje{" + "emisor=" + emisor + ", receptor=" + receptor + ", mensaje=" + mensaje + '}';
    }
    
}
