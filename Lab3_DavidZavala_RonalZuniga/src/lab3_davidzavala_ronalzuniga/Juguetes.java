package lab3_davidzavala_ronalzuniga;

public class Juguetes extends Productos{
    
    private String desc;
    
    public Juguetes() {
        super();
    }

    public Juguetes(String desc, String nombre, String descripcion, double precio) {
        super(nombre, descripcion, precio);
        this.desc = desc;
    }

    public Juguetes(String desc) {
        this.desc = desc;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    @Override
    public String toString() {
        return "Juguetes{" + "desc=" + desc + '}';
    }  
    
    
}
