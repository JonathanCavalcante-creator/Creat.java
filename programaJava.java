package calculadoraCreator;

import java.util.Scanner;

import tela.calculadoraCreat;

public class programaJava {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Digite um número: ");
		double resultado = sc.nextDouble();

		calculadoraCreat cal = new calculadoraCreat(resultado);

		System.out.println("(+) Somar, (-) Subtrair, (X) Multiplicar, (/) Dividir, (*) para sair");
		String op = sc.next().toUpperCase();

		while (op.equals("+") || op.equals("-") || op.equals("X") || op.equals("/")) {
			cal.setOp(op);
			System.out.println("Digite um valor: ");
			double entrada = sc.nextDouble();
			cal.setEntrada(entrada);
			cal.operação();
			System.out.println("Resultado: " + cal.getResultado());
			System.out.println("(+) Somar, (-) Subtrair, (X) Multiplicar, (/) Dividir, (*) para sair");
			op = sc.next().toUpperCase();

		}

		if (op.equals("*")) {
			System.out.println("Finish!");
		} else {
			System.out.println("Comando inválido!");
		}

	}
}
