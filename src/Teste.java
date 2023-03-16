import java.util.Arrays;
import java.util.Scanner;

public class Teste {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Digite a quantidade de números a serem ordenados: ");
		int quantidadeNumeros = input.nextInt();
		if (quantidadeNumeros > 0) {

			int[] numeros = new int[quantidadeNumeros];

			for (int i = 0; i < quantidadeNumeros; i++) {
				System.out.print("Digite o número #" + (i + 1) + ": ");
				numeros[i] = input.nextInt();
				if (numeros[i] > 0 && numeros[i] < 65530) {
					continue;
				} else {
					System.out.print("Tamanho inválido do vetor!");
					return;
				}
			}

			System.out.print("Números desordenados:  \n");
			for (int i = 0; i < quantidadeNumeros; i++) {
				if (i == quantidadeNumeros - 1) {
					System.out.print(numeros[i] + ".");
				} else {
					System.out.print(numeros[i] + ", ");
				}
			}

			System.out.print("\n\n");
			Arrays.sort(numeros);
			System.out.print("Números ordenados:  \n");
			for (int i = 0; i < quantidadeNumeros; i++) {
				if (i == quantidadeNumeros - 1) {
					System.out.print(numeros[i] + ".");
				} else {
					System.out.print(numeros[i] + ", ");
				}
			}

		} else {
			System.out.print("Número de elementos divergente do informado!");
			return;
		}

	}
}
