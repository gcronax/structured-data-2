import java.util.LinkedList;
import java.util.Queue;

public class colas_1 {
    public static void main(String[] args) {
        Queue<String> filabanco = new LinkedList<>();
        for (int i = 1; i <= 10 ; i++) {

            filabanco.add("cliente "+i);
        }
        System.out.println("se atendio al cliente "+filabanco.poll());
        System.out.println("se atendio al cliente "+filabanco.poll());
        System.out.println("se atendio al cliente "+filabanco.poll());
        System.out.println("se atendio al cliente "+filabanco.poll());
        System.out.println("estado de la cola actual "+filabanco);

    }
}
