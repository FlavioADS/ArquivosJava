
package projeto_1;
import java.util.Scanner;
public class swicthCase {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.println("1 - Quero namorar com vc");
    System.out.println("2 - Não sei se estou pronta");
    System.out.println("3 - Não vai rolar");   
    System.out.println("4 - Vou te iludir");
    System.out.println("5 - te amo");
    
    System.out.println("\nDigite uma das opções abaixo");
    int respostaCorreta = input.nextInt();
    
    switch(respostaCorreta){
        case 1 -> System.out.println("Resposta correta");
        case 2 -> System.out.println("vai se fuder entao");
        case 3 -> System.out.println("entao rola para o inferno");
        case 4 -> System.out.println("tenta a sorte");
        case 5 -> System.out.println("te amo!");
        default -> System.out.println("Opção invalida");
    }
   }
}