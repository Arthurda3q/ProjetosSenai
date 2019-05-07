
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

public class GerenciarBanco {

	public static void main(String[] args) {

		GerenciarConta gerenciar = new GerenciarConta();
		Object escolha = "";
		List<Conta> lsConta = new ArrayList<Conta>();

		do {

			Object[] opcBanco = { "Nova Conta", "Gerenciar Conta", "Concluir" };
			escolha = JOptionPane.showInputDialog(null, "Escolha uma op��o",
					"Op��es", JOptionPane.DEFAULT_OPTION, null, opcBanco,
					opcBanco[0]);

			if (escolha.equals("Nova Conta")) {
				lsConta.add(gerenciar.cadastrarConta());

			}

		} while (!escolha.equals("Concluir"));
		
		gravarArquivo(lsConta);

		// gerenciar.usarConta(cliente);
	}
	private static void  gravarArquivo(List<Conta> lsConta){
		try {
			FileWriter arquivo = new FileWriter("C:\\Users\\QUA209.003\\git\\ProjetosSenai\\workspace\\MeuExemploBanco\\src\\lsConta.txt");
			PrintWriter escrever = new PrintWriter(arquivo);
			
			for (Conta conta : lsConta) {
				escrever.println(conta.toString()+conta.getCliente().toString());
			}
			escrever.close();
			
		} catch (IOException e) {
			System.out.println("Arquivo n�o encontrado.");
		}
		
	}
}
