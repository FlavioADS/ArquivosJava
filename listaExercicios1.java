
package projeto_1;
import java.util.Scanner;
public class listaExercicios1 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        
        System.out.println("Escreva uma mensagem");
            String mensagem = input.nextLine();
        
        for(int i = 1; i <= 100; i++){
            System.out.println(i + "- você escreveu: " + mensagem);     
        }
        
    }
}
