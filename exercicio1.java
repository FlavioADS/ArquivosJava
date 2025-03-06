import java.util.Scanner;
public class exercicio1 {
        public static void main(String[] args){
            Scanner input = new Scanner(System.in);
            
            float n1, n2, total;
            
            
            System.out.println("Digite o primeiro numero: ");
            n1 = input.nextFloat();
            
            System.out.println("Digite o segundo numero: ");
            n2 = input.nextFloat();
            
            total = (n1+n2);
            System.out.println("O valor da sua soma é: " + total);
                    
        }
    }


