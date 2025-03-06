
package projeto_1;
import java.util.Scanner;
public class acumulativo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x, soma = 0;
        for (int i = 1; i <= 5; i++){
            System.out.println("Digite o valor " + i);
            x = input.nextInt();
            soma = soma + x;
        }
        System.out.println("Total: " + soma);
    }
}
