public class Enum_6 {
    enum Pedidos{
        RECIBIDO,PREPARACION,LISTO,ENTREGADO;





    }

    public static Pedidos cambiarpedido(Pedidos p){

        switch (p){
            case RECIBIDO -> {
                p= Pedidos.PREPARACION;
                System.out.println("se cambia a PREPARACION");
            }
            case PREPARACION -> {
                p= Pedidos.LISTO;
                System.out.println("se cambia a LISTO");
            }
            case LISTO -> {
                p= Pedidos.ENTREGADO;
                System.out.println("se cambia a ENTREGADO");
            }

        }

        return p;
    }

    public static void main(String[] args) {
        Pedidos p= Pedidos.RECIBIDO;
        p=cambiarpedido(p);
        p=cambiarpedido(p);
        System.out.println(p);


    }
}
