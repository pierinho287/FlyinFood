package Variables;

import java.io.Serializable;
import java.util.List;

/**
 * Created by Juan Piero on 10/10/2017.
 */
@SuppressWarnings("serial")
public class Plato implements Serializable {
    private int Id;
    private int imagen;
    private String nombre;
    private double Rate;
    private double Costo;
    private List<String> Ingredientes;

    public Plato() {
    }

    public Plato(int imagen, String nombre, double Rate) {
        this.imagen = imagen;
        this.nombre = nombre;
        this.Rate = Rate;
    }

    public Plato(int id) {
        Id = id;
    }

    public Plato(int id, int imagen, String nombre, double rate, double costo) {
        Id = id;
        this.imagen = imagen;
        this.nombre = nombre;
        Rate = rate;
        Costo = costo;
    }

    public Plato(int id, int imagen, String nombre, double rate, double costo, List<String> ingredientes) {
        this.Id = id;
        this.imagen = imagen;
        this.nombre = nombre;
        this.Rate = rate;
        this.Costo = costo;
        this.Ingredientes = ingredientes;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public double getCosto() {
        return Costo;
    }

    public void setCosto(double costo) {
        Costo = costo;
    }

    public List<String> getIngredientes() {
        return Ingredientes;
    }

    public void setIngredientes(List<String> ingredientes) {
        Ingredientes = ingredientes;
    }

    public int getImagen() {
        return imagen;
    }

    public void setImagen(int imagen) {
        this.imagen = imagen;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getRate() {
        return Rate;
    }

    public void setRate(double rate) {
        Rate = rate;
    }
}

