import java.util.Random;

import javax.swing.JOptionPane;

public class GerarValidarCpf {

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

	public static void gerarCpf() {

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

	public static boolean validarCpf(String txCpf) {
		try {

			// replace para remover '.' e o '-' da mascara do CPF.
			txCpf = txCpf.replace(".", "").replace("-", "");

			// tratamento tds digitos iguais.
			int qtIguais = 0;
			for (int i = 0; i < 10; i++) {
				for (int j = 0; j < 11; j++) {
					if (i == Integer.parseInt(txCpf.substring(j, j + 1))) {
						qtIguais++;
					}
				}
				if (qtIguais == 11) {
					return false;
				} else {
					qtIguais = 0;
				}

			}

			int cpf[] = new int[11];
			for (int i = 0; i < 11; i++) {
				cpf[i] = Integer.parseInt(txCpf.substring(i, i + 1));
			}
			int dig0 = BuscaDig(0, cpf);
			int dig1 = BuscaDig(1, cpf);

			if (dig0 == cpf[9] && dig1 == cpf[10]) {
				return true;
			} else {
				return false;

			}

		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Erro na validação");
			return false;
		}
	}

	public static void main(String[] args) {

		Object[] opcoes = { "Gerar", "Validar" };
		int opcao = JOptionPane.showOptionDialog(null, "O que você deseja?",
				"Opções", JOptionPane.DEFAULT_OPTION,
				JOptionPane.QUESTION_MESSAGE, null, opcoes, opcoes[0]);

		switch (opcao) {
		case 0:
			gerarCpf();
			break;
		case 1:
			String texto = "";
			if ((validarCpf(JOptionPane.showInputDialog("Digite o cpf")))) {
				texto = "Cpf válido";
			} else {
				texto = "Cpf Inválido";
			}
			JOptionPane.showMessageDialog(null, texto);
			break;
		default:
			break;
		}

	}
}
