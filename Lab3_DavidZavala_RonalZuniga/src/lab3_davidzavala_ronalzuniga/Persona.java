package lab3_davidzavala_ronalzuniga;

public class Persona {
    private String nombre;
    private int id;
    private String user;
    private String password;
    private String mail;

    public Persona() {
    }

    public Persona(String nombre, int id, String user, String password, String mail) {
        this.nombre = nombre;
        this.id = id;
        this.user = user;
        this.password = password;
        this.mail = mail;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", id=" + id + ", user=" + user + ", password=" + password + ", mail=" + mail + '}';
    }
    
}
