import java.util.Stack;

public class pila_3 {
    public static void main(String[] args) {
        Stack<Integer> anidada = new Stack<>();
        for (int i = 0; i < 10; i++) {
            anidada.push(i);
        }
        System.out.println(anidada);
        int count=0;
        for (int j:anidada){
            count+=j;

        }
        System.out.println(count);
    }
}
