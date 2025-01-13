import java.util.LinkedList;
import java.util.Queue;

public class colas_4 {
    public static void main(String[] args) {
        Queue<String> cafe = new LinkedList<>();
        for (int i = 1; i <= 6 ; i++) {

            cafe.add("cafe "+i);
        }
        System.out.println(cafe);
        System.out.println("se hace "+cafe.poll());
        System.out.println("se hace "+cafe.poll());
        System.out.println("se hace "+cafe.poll());
        System.out.println("se hace "+cafe.poll());
        System.out.println("se hace "+cafe.poll());

        System.out.println("estado de los cafes que faltan "+cafe);

    }
}
