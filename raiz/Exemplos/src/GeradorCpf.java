import java.awt.JobAttributes;
import java.util.Random;

import javax.swing.JOptionPane;

public class GeradorCpf {

	public static int BuscaDig(int dig, int[] cpf) {
		int aux = 10 + dig;
		int soma = 0;

		for (int i = 0; i <= 8 + dig; i++) {
			int mult = cpf[i] * aux;
			soma = soma + mult;
			System.out.println("pos i " + i + " val " + cpf[i] + " mult " + aux
					+ "= " + mult + "vlr soma = " + soma);
			aux--;
		}

		int rest = soma % 11;
		System.out.println("resto = " + rest);

		if (rest < 2) {
			return 0;
		} else {
			return 11 - rest;

		}

	}

	public static void main(String[] args) {

		int[] cpf = new int[11];
		Random aleatorio = new Random();
		for (int i = 0; i < 8; i++) {
			cpf[i] = aleatorio.nextInt(10);
			
		}

		cpf[9] = BuscaDig(0, cpf);
		System.out.println(cpf[9]);
		cpf[10] = BuscaDig(1, cpf);
		System.out.println(cpf[10]);
		
		String txCpf = "";

		// mostrar cpf inteiro.
		for (int i = 0; i < cpf.length; i++) {
			System.out.print(cpf[i]);
			
			txCpf += cpf[i];

			if (i == 2 || i == 5) {
				System.out.print(".");
				txCpf += ".";

			}
			if (i == 8) {
				System.out.print("-");
				txCpf += "-";
			}
		}
		JOptionPane.showMessageDialog(null, txCpf);
	}

}
