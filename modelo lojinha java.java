import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        double soma = 0;

        System.out.println("Ola por favor informe o numero de produtos que deseja comprar:");
        int produtos = leitor.nextInt();
        leitor.nextLine();

        String nome[] = new String[produtos];
        double preco[] = new double[produtos];


        for (int i = 0; i < nome.length; i++) {
            System.out.println("Digite o nome do produto[" + i + "]");
            nome[i] = leitor.nextLine();
            System.out.println("Digite o preço do produto[" + i + "]");
            preco[i] = leitor.nextDouble();
            leitor.nextLine();
        }
        for (double precos : preco) {
            soma += precos;
        }

        for (int i = 0; i < nome.length; i++) {
            System.out.printf("Produto[%d] %s %.2f\n", i + 1, nome[i], preco[i]);
        }
        System.out.printf("A soma total dos preços é: %.2f\n", soma);

        leitor.close();
    }
}
