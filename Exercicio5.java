import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int tamanho = 5; // pode mudar se quiser outro tamanho
        int[] A = new int[tamanho];
        int[] B = new int[tamanho];
        int[] C = new int[tamanho];

        // Ler vetor A
        System.out.println("Digite os elementos do vetor A:");
        for (int i = 0; i < tamanho; i++) {
            System.out.print("A[" + i + "]: ");
            A[i] = sc.nextInt();
        }

        // Ler vetor B
        System.out.println("\nDigite os elementos do vetor B:");
        for (int i = 0; i < tamanho; i++) {
            System.out.print("B[" + i + "]: ");
            B[i] = sc.nextInt();
        }

        // Construir vetor C (A - B)
        for (int i = 0; i < tamanho; i++) {
            C[i] = A[i] - B[i];
        }

        // Mostrar vetor C
        System.out.println("\nVetor C (A - B):");
        for (int i = 0; i < tamanho; i++) {
            System.out.println("C[" + i + "] = " + C[i]);
        }


    }
}
