import java.text.SimpleDateFormat;

import javax.swing.JOptionPane;
import javax.swing.UIManager;

public class GerenciarConta {
	
	

	public void usarConta(Cliente cliente) {
		UIManager.put("Button.defaultButtonFollowsFocus", Boolean.TRUE); // para
																			// usar
																			// o
																			// 'enter'
																			// para
																			// entrar
																			// em
																			// um
																			// option

		Conta contao01 = new Conta(cliente);
		contao01.numero = 301;
		JOptionPane.showMessageDialog(null,
				"Bem Vindo Sr. " + cliente.getNome());

		Object[] opcoes = { "Depositar", "Sacar", "Saldo", "Extrato", "Dados" };

		int opcao = 0;
		while (opcao != -1) { // enqt for diferente de -1 vai ficar repetindo,
								// vai para qnd fechar no X.

			opcao = JOptionPane.showOptionDialog(null, "Escolha um opção",
					"Oparações Bancarias", JOptionPane.DEFAULT_OPTION,
					JOptionPane.INFORMATION_MESSAGE, null, opcoes, opcoes[2]);

			try {

				if (opcao == 0) { // deposito
					double valor = Double.parseDouble(JOptionPane
							.showInputDialog("Insira o valor a ser depositado")
							.replace(",", "."));// substituiçao de , por . !
					contao01.depositar(valor);
				}
				if (opcao == 1) {// saque
					String txValor = JOptionPane
							.showInputDialog("Insira o valor para saque.");
					double valor = Double.parseDouble(txValor); // convesao pra
																// decimal
					boolean sucesso = contao01.sacar(valor);

					if (sucesso) {
						JOptionPane.showMessageDialog(null,
								"Saque realizado com sucesso.");
					} else {
						JOptionPane.showMessageDialog(null,
								"Saldo indisponivel.");
					}
				}
			} catch (NumberFormatException e) { // Correção de erro caso ponha
												// letra no lugar de numbers.
				JOptionPane.showMessageDialog(null, "Insira um número.");
			} catch (NullPointerException e) {

			}
			if (opcao == 2) {
				JOptionPane.showMessageDialog(
						null,
						"Saldo: R$ "
								+ String.format("%,.2f", contao01.getSaldo()));
			}
			if (opcao == 3) {
				JOptionPane.showMessageDialog(null,
						"Extrato:" + contao01.getExtrato());
			}
			if (opcao == 4) {
				SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
				JOptionPane.showMessageDialog(null, "Dados do Cliente:\n"
						+ "Nome: " + contao01.getCliente().getNome()
						+ "\nData de Nascimento: "
						+sdf.format (cliente.getdNascimento()) + "\nCPF: "
						+ contao01.getCliente().getCpf() + "\nSexo: "
						+ contao01.getCliente().getSexo() + "\nTell: "
						+ contao01.getCliente().getTelefone());
			}
		}

	}
}
