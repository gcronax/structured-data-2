public class Enum_2 {
    public class Acceso {
        enum Prioridad {
            ALTA(1),
            MEDIA(2),
            BAJA(3);

            private int prioridad;

            Prioridad(int prioridad) {
                this.prioridad = prioridad;
            }
            public int getPrioridad() {
                return prioridad;
            }
        }

    }
    public static void main(String[] args) {
        Enum_2.Acceso.Prioridad miNivel = Acceso.Prioridad.MEDIA;
        System.out.println("Nivel: " + miNivel);
        System.out.println("Prioridad del nivel: " +
                miNivel.getPrioridad());
    }
}
