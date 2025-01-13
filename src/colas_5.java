import java.util.LinkedList;
import java.util.Queue;

public class colas_5 {
    public static void main(String[] args) {
        Queue<String> llamadascola = new LinkedList<>();
        for (int i = 1; i <= 6 ; i++) {

            llamadascola.add("llamada "+i);
        }
        System.out.println(llamadascola);
        System.out.println("se hace "+llamadascola.poll());
        System.out.println("se hace "+llamadascola.poll());
        System.out.println("se hace "+llamadascola.poll());
        System.out.println("se hace "+llamadascola.poll());
        System.out.println("se hace "+llamadascola.poll());

        System.out.println("estado de las llamadas que faltan "+llamadascola);

    }
}
