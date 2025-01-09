public class Enum_3 {
    public class Pedidos {
        enum EstadoPedido {
            PENDIENTE(1),
            PROCESANDO(2),
            ENVIADO(3),
            ENTREGADO(4);

            private int prioridad;
            EstadoPedido(int prioridad) {
                this.prioridad = prioridad;
            }
            public int getPrioridad() {
                return prioridad;
            }

            public void EstadoPedido(){
                this.prioridad= 1;
            }

        }
        public static Pedidos.EstadoPedido cambiarpedido(Pedidos.EstadoPedido p){

            if (p== Pedidos.EstadoPedido.PENDIENTE){
                p= EstadoPedido.PROCESANDO;
                System.out.println("se cambia a procesando");
            }

            return p;
        }


    }
    public static void main(String[] args) {

        Pedidos.EstadoPedido p = Pedidos.EstadoPedido.PENDIENTE;
        if (p== Pedidos.EstadoPedido.PENDIENTE){
            System.out.println("pendiente");

        }

        p=Pedidos.EstadoPedido.ENTREGADO;
        System.out.println("Nivel: " + p);
        System.out.println("Prioridad del nivel: " +
                p.getPrioridad());
    }
}
