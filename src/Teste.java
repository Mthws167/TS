import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Teste {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		try {
			System.out.print("Digite a quantidade de números a serem ordenados: ");
			int quantidadeNumeros = input.nextInt();
			if (quantidadeNumeros > 0) {

				int[] numeros = new int[quantidadeNumeros];

				for (int i = 0; i < quantidadeNumeros; i++) {
					System.out.print("Digite o número #" + (i + 1) + ": ");
					try {
						numeros[i] = input.nextInt();
					} catch (InputMismatchException e) {
						System.out.println("\n Conteúdo inválido do arquivo.");
						return;
					}
					if (numeros[i] > 0 && numeros[i] < 65530) {
						continue;
					} else {
						System.out.print("\n Tamanho inválido do vetor.");
						return;
					}
				}

				if (numeros.length != quantidadeNumeros) {
					System.out.println("\n Número de elementos divergente do informado.");
					return;
				}

				System.out.print("\n Números desordenados:  \n");
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
				System.out.print("\n Quantidade inválida!");
				return;
			}
		} catch (InputMismatchException e) {
			System.out.println("\n Conteúdo inválido do arquivo.");
			return;
		}

	}
}
