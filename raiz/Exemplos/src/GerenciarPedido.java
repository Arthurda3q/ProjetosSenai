import javax.swing.JOptionPane;

public class GerenciarPedido {

	public static void main(String[] args) {

		String nome = JOptionPane.showInputDialog("Digite o nome de usuario");
		
		if (nome.equals("java")){
		
		Object[] lista = { "100 - Cachorro quente", "101 - Bauru simples",
				"102 - Bauru com ovo", "103 - Hamburguer",
				"104 - Chees Burguer", "105 - Refrigerante" };

		int addProduto = 1;
		double valorfinal = 0;
		String dspedido = "";
		while (addProduto == 1) {

			Object itemEscolhido = JOptionPane.showInputDialog(null,
					"Escolha um item", "Menu", JOptionPane.QUESTION_MESSAGE,
					null, lista, lista[0]);

			if (itemEscolhido != null) {
				// try
				try {

					System.out.println(itemEscolhido);
					String cod = itemEscolhido.toString().substring(0, 3);
					String txQt = JOptionPane
							.showInputDialog("Digite a quantidade");

					int qt = Integer.parseInt(txQt);
					double preco = 0;

					switch (cod) {
					case "100":
						preco = 1.2;
						break;
					case "101":
						preco = 1.3;
						break;
					case "102":
						preco = 1.5;
						break;
					case "103":
						preco = 1.2;
						break;
					case "104":
						preco = 1.3;
						break;
					case "105":
						preco = 1;
						break;

					default:
						break;
					}
					double total = preco * qt;
					valorfinal += total;
					dspedido += "\n " + itemEscolhido.toString() + " x" + qt
							+ " = " + String.format("%,.2f", total);
					JOptionPane.showMessageDialog(null, "Valor do item: R$ "
							+ String.format("%,.2f", total));

				} catch (NumberFormatException e) {
					JOptionPane.showMessageDialog(null,
							"Numero não identificado.", "Erro",
							JOptionPane.ERROR_MESSAGE);

				}
			}

			Object[] lsOpcao = { "Não", "Sim" };
			addProduto = JOptionPane.showOptionDialog(null,
					"Deseja registrar outro produto", "Continuar",
					JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE,
					null, lsOpcao, lsOpcao[1]);
		}
		JOptionPane.showMessageDialog(null,
				"Valor Total: R$ " + String.format("%,.2f", valorfinal)
						+ dspedido);
		
		}else{
			JOptionPane.showMessageDialog(null, "Usuario incorreto");
			
		}
		
	}
}
