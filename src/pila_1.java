import java.util.Stack;

public class pila_1 {
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        System.out.println("Agregando elementos a la pila:");
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        System.out.println(s);
        System.out.println("se da hacia atras");
        s.pop();
        System.out.println(s);

    }

}
