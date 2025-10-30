import java.util.Scanner;
public class Ex1numaleato
{
	public static void main(String[] args) {
		int[] numeros = new int [10];
		Scanner entrada = new Scanner(System.in);
		
		// loop para leitura dos 10 números
		for(int i =0; i < 10; i++) {
		    System.out.print("Digite um número " + (i+1) + ": ");
		    numeros [1] = entrada.nextInt();
	}
	     // loop para imprimir os 10 números
	     for(int i=0; i < 10; i++) {
	         System.out.print("número" + (i + 1 ) + " = " + numeros[1]);
}

    }
}