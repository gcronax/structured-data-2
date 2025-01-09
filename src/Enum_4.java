public class Enum_4 {
    enum dias{
        LUNES,MARTES,MIERCOLES,JUEVES,VIERNES,SABADO,DOMINGO;

        public String getdia(dias d){
            switch (d) {
                case LUNES:
                    System.out.println("Laboral");
                    break;
                case SABADO:
                    System.out.println("Festivo");
                    break;
            }
            return "";
        }
    }

    public static void main(String[] args) {
        dias d=dias.LUNES;
        d.getdia(d);
    }

}
