package lab3_davidzavala_ronalzuniga;

public class Kiosco extends Tienda{
    private Tienda tienda;

    public Kiosco(Tienda tienda) {
        this.tienda = tienda;
    }
    

    public Tienda getTienda() {
        return tienda;
    }

    public void setTienda(Tienda tienda) {
        this.tienda = tienda;
    }
    
}
