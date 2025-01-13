import java.util.Stack;

public class pila_2 {
    public static void main(String[] args) {


        Stack<String> des = new Stack<>();
        Stack<String> re = new Stack<>();

        des.push("1");
        des.push("2");

        re.push("2");
        des.pop();

        des.push(re.peek());
        re.pop();

    }
}
