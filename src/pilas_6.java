import java.util.Scanner;
import java.util.Stack;

public class pilas_6 {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        Stack<Integer> bin = new Stack<>();
        int aux;
        aux= scan.nextInt();
        while (aux>1){
            bin.push(aux%2);
            aux=aux/2;
        }
        bin.push(aux);

        while (!bin.isEmpty()){
            System.out.print(bin.peek());
            bin.pop();
        }


    }
}
