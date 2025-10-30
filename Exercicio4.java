import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] A = new int[5];
        int[] B = new int[5];

        // Ler os elementos do vetor A
        System.out.println("Digite 5 números inteiros para o vetor A:");
        for (int i = 0; i < A.length; i++) {
            System.out.print("A[" + i + "]: ");
            A[i] = sc.nextInt();
        }

        // Calcular o vetor B (multiplicando cada elemento de A por 3)
        for (int i = 0; i < A.length; i++) {
            B[i] = A[i] * 3;
        }

        // Mostrar os elementos de B
        System.out.println("\nVetor B (A * 3):");
        for (int i = 0; i < B.length; i++) {
            System.out.println("B[" + i + "] = " + B[i]);
        }

        sc.close();
    }
}
