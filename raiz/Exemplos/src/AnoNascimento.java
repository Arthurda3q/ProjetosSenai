import java.util.Scanner;

public class AnoNascimento {
	public static void main(String[] args) {

		try {

			String[] lista = new String[3];
			lista[0] = "cmd";
			lista[1] = "/c";
			lista[2] = "cls";

			new ProcessBuilder(lista).inheritIO().start().waitFor();
			System.out.println("Digite seu nome: ");

			Scanner scanner = new Scanner(System.in);

			String pessoa = scanner.nextLine();
			new ProcessBuilder(lista).inheritIO().start().waitFor();

			System.out.println("Boa noite " + pessoa);
			System.out.println("Digite sua idade: ");
			int idade = scanner.nextInt();
			scanner.nextLine();
			new ProcessBuilder(lista).inheritIO().start().waitFor();

			System.out.println("J� fez anivers�rio ? Sim 1, N�o 0");
			int aniversario = scanner.nextInt();
			scanner.nextLine();
			new ProcessBuilder(lista).inheritIO().start().waitFor();

			if (aniversario == 0 || aniversario == 1) {
				int ano = 0;
				if (aniversario == 0) {
					ano = 2019 - idade - 1;
				} else {
					ano = 2019 - idade;

				}

				System.out.println("Eu sei que voc� nasceu em " + ano);

				if (1994 < ano) {
					System.out.println("O Brasil j� era Tetra.");
				} else {

					if (1994 == ano) {
						System.out.println("Voc� deu sorte pro Brasil.");
					} else {
						System.out.println("O Brasil ainda n�o era Tetra.");
					}
				}

			} else {
				System.out
						.println("N�o � possivel computar o valor informado.");
			}

			scanner.nextLine();
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Erro ao preencher um array.");

		} catch (Exception e) {
			System.out.println("ERRO na entrada de dados.");

		}

	}

}
