import java.util.LinkedList;
import java.util.Queue;

public class colas_2 {
    public static void main(String[] args) {
        Queue<String> filaimpresion = new LinkedList<>();
        for (int i = 1; i <= 10 ; i++) {

            filaimpresion.add("impresion "+i);
        }
        System.out.println("se imprime "+filaimpresion.poll());
        System.out.println("se imprime "+filaimpresion.poll());
        System.out.println("se imprime "+filaimpresion.poll());
        System.out.println("se imprime "+filaimpresion.poll());
        System.out.println("se imprime "+filaimpresion.poll());
        System.out.println("se imprime "+filaimpresion.poll());
        System.out.println("se imprime "+filaimpresion.poll());
        System.out.println("estado de la cola de impresion actual "+filaimpresion);

    }
}
