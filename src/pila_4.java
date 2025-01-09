import java.util.Stack;

public class pila_4 {
    public static void main(String[] args) {
        Stack<Integer> platos = new Stack<>();
        for (int i = 0; i < 4; i++) {
            platos.push(i);

        }

        platos.pop();
        System.out.println(platos);

    }
}
