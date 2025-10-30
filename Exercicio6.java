import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] A = new int[4];
        int[] B = new int[7];
        int[] C = new int[A.length + B.length];

        // Leitura do vetor A
        System.out.println("Digite os 4 elementos do vetor A:");
        for (int i = 0; i < A.length; i++) {
            System.out.print("A[" + i + "]: ");
            A[i] = sc.nextInt();
        }

        // Leitura do vetor B
        System.out.println("\nDigite os 7 elementos do vetor B:");
        for (int i = 0; i < B.length; i++) {
            System.out.print("B[" + i + "]: ");
            B[i] = sc.nextInt();
        }

        // Construção do vetor C (junção de A e B)
        for (int i = 0; i < A.length; i++) {
            C[i] = A[i];
        }
        for (int i = 0; i < B.length; i++) {
            C[A.length + i] = B[i];
        }

        // Exibição do vetor C
        System.out.println("\nVetor C (junção de A e B):");
        for (int i = 0; i < C.length; i++) {
            System.out.print(C[i] + " ");
        }

        sc.close();
    }
}
