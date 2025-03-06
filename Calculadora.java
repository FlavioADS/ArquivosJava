import java.text.DecimalFormat;
import java.util.Scanner;
public class Calculadora { 

    public static int menu(){
        Scanner input = new Scanner(System.in);
        int op;
    do{
            System.out.println("*-* Menu *-*");
            System.out.println("--------------");
            System.out.println("1-Adicao");
            System.out.println("2-Subtracao ");
            System.out.println("3-Multiplicacao");
            System.out.println("4-Divisao");
            System.out.println("5-porcentagem");
            System.out.println("6-potencia");
            System.out.println("Opcao: ");
            op = input.nextInt();
            if(op < 1 || op > 6){
            System.out.println("-----------------------------------------");
            System.out.println("operacao invalida.");
            System.out.println("Por favor, digite um numero de 1 a 5");
            System.out.println("-----------------------------------------");
        }
            }while(op < 1 || op > 6);
        return op;
        }
        public static float entradaDados(){
            Scanner input = new Scanner(System.in);
            System.out.println("*-* Entrada de Dados *-*");
            System.out.println("--------------------------");
            System.out.println("Numero: ");
            return input.nextFloat();
        }
        public static float  porcentagem(float n1, float n2){
            System.out.println("porcentagem");
            System.out.println("------------");
            return (n1*n2) / 100;
        }  

        public static float adicao(float n1, float n2){
            System.out.println("*-* Adição *-*");
            System.out.println("--------------------");
            return n1+n2;
        }  
        public static float subtracao(float n1, float n2){
            System.out.println("*-* Subtração *-*");
            System.out.println("--------------------");
            return n1-n2; 
        }   
        public static float multiplicacao(float n1, float n2){
            System.out.println("*-* Multiplicação *-*");
            System.out.println("--------------------");
        return n1*n2; 
        }
        public static float divisao(float n1, float n2){
            System.out.println("*-* Divisão *-*");
            System.out.println("--------------------");
            return n1/n2;
        }
        public static double potencia(double base, double exp){
            System.out.println("*-* Potencia *-*");
            System.out.println("--------------------");
            return Math.pow(base, exp);
        }
        public static void imprimirpotencia(double result){
            System.out.println("*-* imprimirpotencia *-*");
            System.out.println("----------------------");
            DecimalFormat df = new DecimalFormat("#,###.00");
            String numeroFormatado = df.format(result);
            System.out.println("A potencia dos dois numeros e de: " + numeroFormatado);
        }
        public static void imprimir(float result){
            System.out.println("*-* imprimir *-*");
            System.out.println("----------------------");
            System.out.println("Resultado: " + result);
        }
        public static void imprimirporcentagem(float result){
            System.out.println("*-* imprimirporcentagem *-*");
            System.out.println("----------------------------");
            System.out.println("Resultado: " + result + "%");
        }
        public static float controlador(int op, float n1, float n2){
            System.out.println("*-* Controlador *-*");
            System.out.println("-------------------------");
        return switch (op) {
            case 1 -> adicao(n1,n2);
            case 2 -> subtracao(n1,n2);
            case 3 -> multiplicacao(n1,n2);
            case 4 -> divisao(n1,n2);
            default -> 0;
        };
        }
        public static float controladorporcentagem(float n1, float n2){
            System.out.println("*-* Controladorporcentagem *-*");
            System.out.println("-------------------------------");
            return porcentagem(n1, n2);
        }  
        public static double controladorpotencia( double base, double exp){
            System.out.println("*-* Controladorpotencia *-*");
            System.out.println("-------------------------------");
            return potencia(base, exp);
        }  
        public static int continuar(){
            Scanner input = new Scanner(System.in);
            System.out.println("---Continuar---");
            System.out.println("------------------");
            System.out.println("Deseja continuar? (1-Sim  e 2-Nao)");
            return input.nextInt();
        }

        public static void main(String[] args) throws InterruptedException {

            int continuar;
            do {
                System.out.println("--MAIN--");
                int op = menu();
                double resultado;
    
                if (op == 5 || op == 1 || op == 2 || op == 3 || op == 4) {
                    float n1 = entradaDados();
                    float n2 = entradaDados();
                    if (op == 5) {
                        resultado = controladorporcentagem(n1, n2);
                        imprimirporcentagem((float) resultado);
                    } else {
                        resultado = controlador(op, n1, n2);
                        imprimir((float) resultado);
                    }
                } else if (op == 6) {
                    System.out.println("*-* Entrada de Dados potencia *-*");
                    System.out.println("--------------------------");
                    System.out.println("base: ");
                    double base = new Scanner(System.in).nextDouble();
                    System.out.println("expoente: ");
                    double exp = new Scanner(System.in).nextDouble();
                    resultado = controladorpotencia(base, exp);
                    imprimirpotencia(resultado);
                }
    
                continuar = continuar();
            } while (continuar == 1);
            System.out.println("Encerrando calculadora...");
            Thread.sleep(5000);
        }
    }