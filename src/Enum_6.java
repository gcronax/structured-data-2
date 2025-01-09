public class Enum_6 {
    enum Pedidos{
        RECIBIDO,PREPARACION,LISTO,ENTREGADO;
    }

    public static Pedidos cambiarpedido(Pedidos p){

        if (p== Pedidos.RECIBIDO){
            p= Pedidos.PREPARACION;
            System.out.println("se cambia a preparacion");
        }

        return p;
    }

    public static void main(String[] args) {
        cambiarpedido(Pedidos.RECIBIDO);
    }
}
