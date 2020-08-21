package principal;

public class PersonaGeneral extends Persona{
    private String ocupacion;
    private String horario;
    private int semanasContratado;
    private float sueldo;

    public PersonaGeneral() {
    }

    public PersonaGeneral(String ocupacion, String horario, int semanasContratado, float sueldo, int identificacion, String nombrePersona, int edad, String sexo, String estadoCivil, int altura, int peso) {
        super(identificacion, nombrePersona, edad, sexo, estadoCivil, altura, peso);
        this.ocupacion = ocupacion;
        this.horario = horario;
        this.semanasContratado = semanasContratado;
        this.sueldo = sueldo;
    }

    public String getOcupacion() {
        return ocupacion;
    }

    public void setOcupacion(String ocupacion) {
        this.ocupacion = ocupacion;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public int getSemanasContratado() {
        return semanasContratado;
    }

    public void setSemanasContratado(int semanasContratado) {
        this.semanasContratado = semanasContratado;
    }

    public float getSueldo() {
        return sueldo;
    }

    public void setSueldo(float sueldo) {
        this.sueldo = sueldo;
    }

    @Override
    public String toString() {
        return super.toString();//"\n\tPersona General\n" + "Ocupación=" + ocupacion + ", Horario=" + horario + ", Semanas que lleva contratado=" + semanasContratado + ", Sueldo=" + sueldo;
    }
    
}
