import java.util.Scanner;
import java.util.Stack;

public class pila_5 {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);

        Stack<Integer> prendas = new Stack<>();

        int aux=0;
        do {
            System.out.println("dime que quieres hacer 1 para añadir prendas y 2 para quitar");
            aux= scan.nextInt();
            if (aux==1){
                System.out.println("dime cuantos platos quieres meter");
                aux= scan.nextInt();
                for (int i = 0; i < aux; i++) {
                    prendas.push(i);
                }
            }
            if (aux==2){
                System.out.println("dime cuantas prendas quieres quitar");
                aux= scan.nextInt();
                for (int i = 0; i < aux; i++) {
                    prendas.pop();
                }

            }
            System.out.println(prendas);


        }while (aux!=-1);



    }
}
