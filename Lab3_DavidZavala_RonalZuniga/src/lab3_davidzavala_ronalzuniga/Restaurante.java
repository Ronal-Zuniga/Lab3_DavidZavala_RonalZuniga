package lab3_davidzavala_ronalzuniga;

import java.util.ArrayList;

public class Restaurante extends Local{
    private ArrayList<Comidas> comida = new ArrayList();
    private Comidas comidas;

    public Restaurante() {
        super();
    }

    public Restaurante(Comidas comidas) {
        this.comidas = comidas;
    }

    public ArrayList<Comidas> getComida() {
        return comida;
    }

    public void setComida(ArrayList<Comidas> comida) {
        this.comida = comida;
    }

    public Comidas getComidas() {
        return comidas;
    }

    public void setComidas(Comidas comidas) {
        this.comidas = comidas;
    }

    @Override
    public String toString() {
        return "Restaurante{" + "comida=" + comida + ", comidas=" + comidas + '}';
    }
    
    
    
}
