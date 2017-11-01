package Variables;

import java.io.Serializable;
import java.util.List;

/**
 * Created by Juan Piero on 10/10/2017.
 */
@SuppressWarnings("serial")
public class Restaurant implements Serializable {
    private int Id;
    private int imagen;
    private String nombre;
    private String Ubicacion;
    private List<Plato> lCarta;

    public Restaurant() {
    }

    public Restaurant(int id, int imagen, String nombre, String ubicacion, List<Plato> lCarta) {
        Id = id;
        this.imagen = imagen;
        this.nombre = nombre;
        Ubicacion = ubicacion;
        this.lCarta = lCarta;
    }

    public Restaurant(int id) {
        Id = id;
    }

    public Restaurant(int id, int imagen, String nombre, String ubicacion) {
        Id = id;
        this.imagen = imagen;
        this.nombre = nombre;
        Ubicacion = ubicacion;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
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

    public String getUbicacion() {
        return Ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        Ubicacion = ubicacion;
    }

    public List<Plato> getlCarta() {
        return lCarta;
    }

    public void setlCarta(List<Plato> lCarta) {
        this.lCarta = lCarta;
    }
}

