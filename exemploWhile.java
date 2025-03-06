
package projeto_1;
import java.util.Scanner;
public class exemploWhile {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int   pratosSujos;
        int   continuar;
        do {
            System.out.print("Digite o número de pratos a lavar: ");
            pratosSujos = input.nextInt();

            while (pratosSujos > 0) {
                System.out.println("Lavando prato..." + pratosSujos);
                pratosSujos--;
            }
        
            System.out.print("Deseja lavar mais pratos? (1 - Sim, 0 - Não): ");
            continuar = input.nextInt();
        } while (continuar > 0);
        if(continuar == 0){
           System.err.println("Processo finalizado!");
        }
    }
}

