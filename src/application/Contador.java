package application;

import java.util.Scanner;

public class Contador {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int parametroUm = sc.nextInt();
		int parametroDois = sc.nextInt();

		try {
			contar(parametroUm, parametroDois);
		} catch (ParametrosInvalidosException exception) {
			System.out.println("O segundo parametro deve ser menor do que o primeiro!");
			exception.printStackTrace();
		}

		sc.close();

	}

	public static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {

		if (parametroUm > parametroDois) {

			throw new ParametrosInvalidosException();

		} else {
			int contagem = parametroDois - parametroUm;
			for (int i = 1; i <= contagem; i++) {
				System.out.println("Imprimindo o número " + i);
			}
		}
	}
}
