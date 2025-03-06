import java.util.Scanner;
public class calculoMediaConceitos {
public static void main(String[]args) throws InterruptedException {
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

float media = (n1 + n2 + n3) / 3;

char conceito;

if (media >= 9 && media < 10) {
conceito = 'A';
} else if (media >= 8 && media < 9){
conceito ='B';
} else if (media >= 7 && media < 8){
conceito = 'C';
} else if (media >= 6 && media < 7){
conceito ='D';
} else {
conceito ='E';
}

            switch(conceito){
        case 'A' -> System.out.println("Exelente");
        case 'B' -> System.out.println("Otimo");
        case 'C' -> System.out.println("muito bom");
        case 'D' -> System.out.println("Bom!");
        case 'E' -> System.out.println("Não foi dessa vez");
        default -> System.out.println("conceito invalido");      
    }Thread.sleep(5000);
}
}