package lab3_davidzavala_ronalzuniga;

import java.util.Date;

public class Empleado extends Persona{
    private Date horario;
    private int pr_vendidos;

    public Empleado() {
        super();
    }

    public Empleado(Date horario, int pr_vendidos) {
        this.horario = horario;
        this.pr_vendidos = pr_vendidos;
    }

    
    public Empleado(Date horario, int pr_vendidos, String nombre, int id, String user, String password, String mail) {
        super(nombre, id, user, password, mail);
        this.horario = horario;
        this.pr_vendidos = pr_vendidos;
    }

    public Date getHorario() {
        return horario;
    }

    public void setHorario(Date horario) {
        this.horario = horario;
    }

    public int getPr_vendidos() {
        return pr_vendidos;
    }

    public void setPr_vendidos(int pr_vendidos) {
        this.pr_vendidos = pr_vendidos;
    }

    @Override
    public String toString() {
        return "Empleado{" + "horario=" + horario + ", pr_vendidos=" + pr_vendidos + '}';
    }
    
    
}
