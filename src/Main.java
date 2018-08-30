public class Main {

    public static void main(String[] args) {
	// write your code here

        Alerta alerta = new Alerta() {
            @Override
            public void recibirAlerta(String dato) {
                System.out.println(dato);
            }
        };

        Accion accion = new AccionOro(2.0);
        System.out.println("Valor al momento de comprar la accion: "+accion.getPrecio());
        accion.agregarLobito(alerta);
        accion.aumentarValor(2.0);
        accion.alertaSuba();
        System.out.println("-------------------------");
        accion.disminuirValor(2.0);
        accion.alertaBaja();

}
}
