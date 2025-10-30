import java.util.Random;

public class Exercicio3 {
    public static void main(String[] args) {
        int[] numeros = new int[10];
        Random random = new Random();

        // Sorteia 10 números entre 1 e 10
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = random.nextInt(10) + 1; // gera de 1 a 10
        }

        // Exibe os números sorteados
        System.out.println("Números sorteados:");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i] + " ");
        }

        // Encontra o menor número
        int menor = numeros[0];
        for (int i = 1; i < numeros.length; i++) {
            if (numeros[i] < menor) {
                menor = numeros[i];
            }
        }

        // Exibe o menor número
        System.out.println("\n\nO menor número é: " + menor);
    }
}
