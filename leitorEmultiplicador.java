
package projeto_1;
import java.util.Scanner;
public class leitorEmultiplicador {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
     
        String nome;
        float N;
      
        System.out.println("Digite seu nome: ");
        nome = input.nextLine();
        
        System.out.println("Digite o numero de vezes que quer repetir o seu nome: ");
        N = input.nextFloat();
        
        for(int i = 1; i <= N; i++){
            System.out.println(nome);
        }
        
 }
}
   

