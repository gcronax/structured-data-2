import java.util.Scanner;
import java.util.Stack;

public class pila_4 {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);

        Stack<Integer> platos = new Stack<>();

        int aux=0;
        do {
            System.out.println("dime que quieres hacer 1 para añadir platos y 2 para quitar");
            aux= scan.nextInt();
            if (aux==1){
                System.out.println("dime cuantos platos quieres meter");
                aux= scan.nextInt();
                for (int i = 0; i < aux; i++) {
                    platos.push(i);
                }
            }
            if (aux==2){
                System.out.println("dime cuantos platos quieres quitar");
                aux= scan.nextInt();
                for (int i = 0; i < aux; i++) {
                    platos.pop();
                }

            }
            System.out.println(platos);


        }while (aux!=-1);



    }
}
