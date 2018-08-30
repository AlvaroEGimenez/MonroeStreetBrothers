public class AccionOro extends Accion {

    public AccionOro(Double precio) {
        super(precio);
    }

    @Override
    public void alertaSuba() {
        for (Alerta alerta : getLobitos()){
            alerta.recibirAlerta("La accion del Oro Subio, el nuevo valor del es: $"+getPrecio());
        }
    }

    @Override
    public void alertaBaja() {
        for(Alerta alerta : getLobitos()){
            alerta.recibirAlerta("La accion del Oro Bajo, el nuevo valor es: $"+getPrecio());
        }
    }

    @Override
    public void  aumentarValor(Double valor) {
        Double nuevoValorAumento = getPrecio()* valor;
        setPrecio(nuevoValorAumento);
    }

    @Override
    public void disminuirValor(Double valor) {
        Double nuevoValorDisminucion = getPrecio() /valor;
         setPrecio(nuevoValorDisminucion);
    }
}
