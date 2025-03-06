
package projeto_1;
import java.util.Scanner;
public class somador {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
         
        float numeros;
        float multiplicação = 0;
        
        for(float i = 1; i <= 3; i++){
            System.out.println("Digite o º" + i + "Valor");
            numeros = input.nextFloat(); 
            Math.pow(numeros, 3);
        }
        System.out.println("A multiplicação dos numeros é de: " + multiplicação);
    }
}
