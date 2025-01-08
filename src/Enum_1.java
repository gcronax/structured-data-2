public class Enum_1 {

    public class Acceso {
        enum Nivel {
            ADMINISTRADOR(1),
            MODERADOR(2),
            USUARIO_REGULAR(3),
            INVITADO(4);

            private int prioridad;

            Nivel(int prioridad) {
                this.prioridad = prioridad;
            }
            public int getPrioridad() {
                return prioridad;
            }
        }

    }
    public static void main(String[] args) {
        Acceso.Nivel miNivel = Acceso.Nivel.ADMINISTRADOR;
        System.out.println("Nivel: " + miNivel);
        System.out.println("Prioridad del nivel: " +
                miNivel.getPrioridad());
    }

}
