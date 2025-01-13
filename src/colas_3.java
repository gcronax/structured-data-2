import java.util.LinkedList;
import java.util.Queue;

public class colas_3 {
    public static void main(String[] args) {
        Queue<String> general = new LinkedList<>();
        Queue<String> urgente = new LinkedList<>();

        for (int i = 1; i <= 10; i++) {
            general.add("paciente normal "+i);
        }
        for (int i = 1; i <= 5; i++) {
            urgente.add("paciente urgente "+i);
        }

        while (!general.isEmpty()){
            if (!urgente.isEmpty()){
                System.out.println("se atiende "+urgente.poll());
            }
            if (urgente.isEmpty()){
                System.out.println("se atiende "+general.poll());
            }

        }


    }






}
