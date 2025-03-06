import java.util.Scanner;

public class calculo_media{
public static void main(String[] args) {
Scanner input = new Scanner(System.in);

System.out.println("Aluno:");
String nome = input.next();
System.out.println("Ola, " + nome + ". Vamos calcular sua media");
System.out.println("--------------------------------------------");

System.out.println("Nota 1:");
float n1 = input.nextFloat();

System.out.println("Nota 2:");
float n2 = input.nextFloat();

System.out.println("Nota 3:");
float n3 = input.nextFloat();

System.out.println("Faltas: ");
byte faltas = input.nextByte();

float media = (n1 + n2 + n3) / 3;
System.out.println("Média: " + media);

if (media < 6 && faltas > 18) {
    System.out.println("Reprovado!");
} else if (media >= 6 && faltas <= 18) {
    System.out.println("Aprovado!");
} else if (media >= 6 && faltas > 18) {
    System.out.println("Reprovado por falta");
} else {
    System.out.println("Recuperação");
    System.out.println("Nota:");
    float notaRec = input.nextFloat();
    float novaMedia = (media + notaRec) / 2;
    if (novaMedia >= 6) {
        System.out.println("Aprovado!");
        System.out.println("Média: " + novaMedia);
    } else {
        System.out.println("Reprovado");
    }
}
}

}