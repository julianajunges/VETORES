import java.util.Scanner;
public class ex2vetores
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int [] numeros = new int [10];
		System.out.println("Digite 10 valores inteiros:");
		for (int i = 0; i < numeros.length; i++) {
        System.out.print("Número " + (i + 1) + ": ");
        numeros[i] = sc.nextInt();
        }
        // Imprimir elementos pares
        System.out.println("\nNúmeros pares:");
        for (int i = 0; i < numeros.length; i++) {
        if (numeros[i] % 2 == 0) {
        System.out.print(numeros[i] + " ");
	}
}
        // Imprimir elementos ímpares
        System.out.println("\n\nNúmeros ímpares:");
        for (int i = 0; i < numeros.length; i++) {
        if (numeros[i] % 2 != 0) {
        System.out.print(numeros[i] + " ");
            }
        }

     
    }
}