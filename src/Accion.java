import java.util.ArrayList;
import java.util.List;

public abstract class Accion {
    //ATRIBUTOS
    private Double precio;
    private List<Alerta> lobitos = new ArrayList<>();

    public Accion(Double precio) {
        this.precio = precio;
    }

    //METODOS
    public abstract void alertaSuba();
    public abstract void alertaBaja();
    public abstract void   aumentarValor(Double valor);
    public abstract void disminuirValor(Double valor);

    public void agregarLobito (Alerta lobito){
        lobitos.add(lobito);
    }
    public void eliminarLobito (Alerta lobito){
        lobitos.remove(lobito);
    }
    protected List<Alerta> getLobitos(){
        return lobitos;
    }

    protected void setPrecio(Double precio) {
        this.precio = precio;
    }

    public Double getPrecio() {
        return precio;
    }
}
