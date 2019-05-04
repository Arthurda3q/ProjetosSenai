import java.util.Random;

import javax.swing.JOptionPane;

public class BuscaPalavra {

	public static void main(String[] args) {

		int qt = Integer.parseInt(JOptionPane
				.showInputDialog("Digite o tamanho do caça palavra."));
		

		Random random = new Random();
		int[][] matz = new int[qt][qt];

		String palavra = JOptionPane.showInputDialog("Digite a palavra").toUpperCase();
		int il = random.nextInt(qt); // Indice da linha
		int ic = random.nextInt(qt - palavra.length()); // Indice da coluna

		for (int i = 0; i < palavra.length(); i++) {
			matz[il][ic + i] = (int) palavra.charAt(i);
		}

		for (int l = 0; l < 10; l++) { // linha
			for (int c = 0; c < qt; c++) {// coluna
				if (matz[l][c] == 0) {
					matz[l][c] = 65 + random.nextInt(23); // '65 +' é pra
															// começar a contar
															// a partir dele.
				}
				System.out.print((char) matz[l][c] + " ");
			}
			System.out.println();
		}

	}
}
