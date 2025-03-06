import java.util.Scanner;

public class Opcoesdecompra {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Digite o codigo do item: ");
            int codigo = scanner.nextInt();
            switch (codigo) {
                case 1 -> {
                    System.out.println("Alimento nao perecivel");
                    calcularValorAlimentoNaoPerecivel(scanner);
                }
                case 2, 3, 4 -> {
                    System.out.println("Alimento perecivel");
                    calcularValorAlimentoPerecivel(scanner);
                }
                case 5, 6 -> {
                    System.out.println("Vestuario");
                    calcularValorVestuario(scanner);
                }
                case 7 -> {
                    System.out.println("Higiene Pessoal");
                    calcularValorHigienePessoal(scanner);
                }
                case 8, 9, 10, 11, 12, 13, 14, 15 -> {
                    System.out.println("Limpeza e utensilios domesticos");
                    calcularValorLimpeza(scanner);
                }
                default -> System.out.println("Codigo invalido");
            }
            // Fechar o scanner
        }
    }

    private static void calcularValorAlimentoNaoPerecivel(Scanner scanner) {
        System.out.print("------------------------------\n");
        System.out.print("Digite a quantidade desejada de alimentos nao pereciveis: ");
        try {
            int quantidade = scanner.nextInt();
            double total;

            switch (quantidade) {
                case 1 -> total = quantidade * 1.70;
                case 2 -> total = quantidade * 2.30;
                case 3 -> total = quantidade * 2.60;
                case 4 -> total = quantidade * 2.40;
                case 5 -> total = quantidade * 2.50;
                case 6 -> total = quantidade * 1.00;
                default -> {
                    System.out.println("Quantidade inválida.");
                    return;
                }
            }

            System.out.printf("Valor a pagar: R$ %.2f\n", total);
        } catch (java.util.InputMismatchException e) {
            System.out.println("Quantidade inválida. Digite um número inteiro.");
            scanner.next(); // Limpar o buffer do scanner
        }
    }

    private static void calcularValorAlimentoPerecivel(Scanner scanner) {
        System.out.print("------------------------------\n");
        System.out.println("Escolha o alimento perecivel:");
        System.out.println("1 - Maçã (R$ 2.00)");
        System.out.println("2 - Banana (R$ 1.50)");
        System.out.print("Digite o código do alimento: ");
        try {
            int codigoAlimento = scanner.nextInt();
            System.out.print("Digite a quantidade desejada: ");
            int quantidade = scanner.nextInt();
            double preco;

            switch (codigoAlimento) {
                case 1 -> preco = 2.00;
                case 2 -> preco = 1.50;
                default -> {
                    System.out.println("Código de alimento inválido.");
                    return;
                }
            }

            double total = quantidade * preco;
            System.out.printf("Valor a pagar: R$ %.2f\n", total);
        } catch (java.util.InputMismatchException e) {
            System.out.println("Entrada inválida. Digite um número inteiro.");
            scanner.next();
        }
    }

    private static void calcularValorVestuario(Scanner scanner) {
        System.out.print("------------------------------\n");
        System.out.print("Digite a quantidade desejada de itens de vestuario: ");
        try {
            int quantidade = scanner.nextInt();
            double total = quantidade * 25.00; // Preço de exemplo para vestuário
            System.out.printf("Valor a pagar: R$ %.2f\n", total);
        } catch (java.util.InputMismatchException e) {
            System.out.println("Entrada inválida. Digite um número inteiro.");
            scanner.next();
        }
    }

    private static void calcularValorHigienePessoal(Scanner scanner) {
        System.out.print("------------------------------\n");
        System.out.print("Digite a quantidade desejada de itens de higiene pessoal: ");
        try {
            int quantidade = scanner.nextInt();
            double total = quantidade * 10.00; // Preço de exemplo para higiene pessoal
            System.out.printf("Valor a pagar: R$ %.2f\n", total);
        } catch (java.util.InputMismatchException e) {
            System.out.println("Entrada inválida. Digite um número inteiro.");
            scanner.next();
        }
    }

    private static void calcularValorLimpeza(Scanner scanner) {
        System.out.print("------------------------------\n");
        System.out.print("Digite a quantidade desejada de itens de limpeza: ");
        try {
            int quantidade = scanner.nextInt();
            double total = quantidade * 7.50; // Preço de exemplo para limpeza
            System.out.printf("Valor a pagar: R$ %.2f\n", total);
        } catch (java.util.InputMismatchException e) {
            System.out.println("Entrada inválida. Digite um número inteiro.");
            scanner.next();
        }
    }
}


    

