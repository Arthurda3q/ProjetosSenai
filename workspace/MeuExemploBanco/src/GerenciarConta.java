import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Random;

import javax.swing.JOptionPane;
import javax.swing.UIManager;

public class GerenciarConta {

	public Conta cadastrarConta() {

		GerenciarPessoa futuroCliente = new GerenciarPessoa();
		
		Conta conta01 = null;
		try {
			conta01 = new Conta (futuroCliente.CadastrarCliente());
			Random rand = new Random();
			
			conta01.numero = rand.nextInt(90000)+ 10000;
			
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return conta01;
	}

	public void usarConta(Conta conta01) {
		UIManager.put("Button.defaultButtonFollowsFocus", Boolean.TRUE);
		// para usar o 'enter' para entrar em um option

		JOptionPane.showMessageDialog(null,
				"Bem Vindo Sr. " + conta01.getCliente().getNome());

		Object[] opcoes = { "Depositar", "Sacar", "Saldo", "Extrato", "Dados" };

		int opcao = 0;
		while (opcao != -1) { // enqt for diferente de -1 vai ficar repetindo,
								// vai para qnd fechar no X.

			opcao = JOptionPane.showOptionDialog(null, "Escolha um op��o",
					"Opara��es Bancarias", JOptionPane.DEFAULT_OPTION,
					JOptionPane.INFORMATION_MESSAGE, null, opcoes, opcoes[2]);

			try {

				if (opcao == 0) { // deposito
					double valor = Double.parseDouble(JOptionPane
							.showInputDialog("Insira o valor a ser depositado")
							.replace(",", "."));// substitui�ao de , por . !
					conta01.depositar(valor);
				}
				if (opcao == 1) {// saque
					String txValor = JOptionPane
							.showInputDialog("Insira o valor para saque.");
					double valor = Double.parseDouble(txValor); // convesao pra
																// decimal
					boolean sucesso = conta01.sacar(valor);

					if (sucesso) {
						JOptionPane.showMessageDialog(null,
								"Saque realizado com sucesso.");
					} else {
						JOptionPane.showMessageDialog(null,
								"Saldo indisponivel.");
					}
				}
			} catch (NumberFormatException e) { // Corre��o de erro caso ponha
												// letra no lugar de numbers.
				JOptionPane.showMessageDialog(null, "Insira um n�mero.");
			} catch (NullPointerException e) {

			}
			if (opcao == 2) {
				JOptionPane.showMessageDialog(
						null,
						"Saldo: R$ "
								+ String.format("%,.2f", conta01.getSaldo()));
			}
			if (opcao == 3) {
				JOptionPane.showMessageDialog(null,
						"Extrato:" + conta01.getExtrato());
			}
			if (opcao == 4) {
				SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
				JOptionPane.showMessageDialog(
						null,
						"Dados do Cliente:\n" + "Nome: "
								+ conta01.getCliente().getNome()
								+ "\nData de Nascimento: "
								+ sdf.format(conta01.getCliente().getdNascimento())
								+ "\nCPF: " + conta01.getCliente().getCpf()
								+ "\nSexo: " + conta01.getCliente().getSexo()
								+ "\nTell: "
								+ conta01.getCliente().getTelefone());
			}
		}

	}
}
