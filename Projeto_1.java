
package projeto_1;
import java.util.Scanner;
public class Projeto_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Aluno:");
        String nome = input.next();
        
        System.out.println("Nota 1 :");
        float n1 = input.nextFloat();
        
        System.out.println("Nota 2 :");
        float n2 = input.nextFloat();
        
        System.out.println("Nota 3 :");
        float n3 = input.nextFloat();
        
        System.out.println("Faltas");
        byte faltas = input.nextByte();
        
        float media = (n1+n2+n3)/3;
        System.out.println("média" + media);
        
        if (media < 6 && faltas > 18){
            System.out.println("Reprovado!");
        }else if (media >= 6 && faltas < 18){
            System.out.println("Aprovado!");
        }else if (media >= 6 && faltas > 18){
            System.out.println("Reprovado por faltas!");
        }else {
            System.out.println("Reprovado!");
            System.out.println("nota da recuperação");
            float notaRec = input.nextFloat();
            float novaMedia = (notaRec + media)/2;
            if (novaMedia >= 6){
            System.out.println("Aprovado!");
            System.out.println("Média" + novaMedia);
        }else{
                System.out.println("Reprovado!");
                System.out.println("média"+ novaMedia);
                }
        }
    }
    
}
