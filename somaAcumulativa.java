
package projeto_1;
import java.util.Scanner;
public class somaAcumulativa {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite um numero: ");

        int soma = 0;

        for (int i = 1; i <= 10; i++) {
            int numero = input.nextInt();
            soma += numero;
            System.out.println("Digite o º" + i + "valor");
           }
        System.out.println("A soma dos valores é " + soma);
    }
}