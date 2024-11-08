import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Qual o tamanho do vetor? ");
        int tamanho = scanner.nextInt();

        int[] vetor = new int[tamanho];

        System.out.println("Insira os valores do vetor...");

        for (int i = 0; i < tamanho; i++) {
            System.out.print((i+1) + "ª posição, valor: ");
            vetor[i]= scanner.nextInt();
        }

        int maiorNumero = maior_vetor.multiplicador(vetor);
        System.out.println("O maior numero digitado dentro do vetor é: ");
        System.out.print(maiorNumero);
    }
}