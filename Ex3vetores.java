import java.util.Scanner;

public class Ex3vetores {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] nomes = new String[5];

        System.out.println("Digite 5 nomes de pessoas:");

        // leitura dos nomes
        for (int i = 0; i < nomes.length; i++) {
            System.out.print("Nome " + (i + 1) + ": ");
            nomes[i] = scanner.nextLine();
        }
        System.out.println("\nNomes do último para o primeiro:");
        for (int i = nomes.length - 1; i >= 0; i--) {
            System.out.println(nomes[i]);
        }
        System.out.println("\nPrimeiro nome armazenado: " + nomes[0]);
        System.out.println("Último nome armazenado: " + nomes[nomes.length - 1]);

        scanner.close();
    }
}