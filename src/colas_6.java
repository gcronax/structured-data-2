import java.util.LinkedList;
import java.util.Queue;

public class colas_6 {
    public static void main(String[] args) {
        Queue<String> colaautobus = new LinkedList<>();
        for (int i = 1; i <= 6 ; i++) {

            colaautobus.add("pasajero "+i);
        }
        System.out.println(colaautobus);
        System.out.println("entra al autobus el "+colaautobus.poll());
        System.out.println("entra al autobus el "+colaautobus.poll());
        System.out.println("entra al autobus el "+colaautobus.poll());
        System.out.println("entra al autobus el "+colaautobus.poll());

        System.out.println("estado de las personas que faltan "+colaautobus);

    }
}
