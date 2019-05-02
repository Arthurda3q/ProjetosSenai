import javax.swing.JOptionPane;

public class Ativ3 {

	public static void main(String[] args) {

		int array[] = new int[6];
		for (int i = 0; i < array.length; i++) {

			String nome = JOptionPane.showInputDialog("Digite o nome do Aluno");
			int idade = Integer.parseInt(JOptionPane
					.showInputDialog("Digite a idade do Aluno"));
			Object[] lista = { "Masculino", "Feminino" , "Outro"};

			Object sexo = JOptionPane.showInputDialog(null,
					"Escolha o sexo do aluno", "Menu",
					JOptionPane.QUESTION_MESSAGE, null, lista, lista[0]);

			JOptionPane.showMessageDialog(null,"Nome: "+nome +"\n"+"Idade: "+ idade + "\n" +"Sexo: "+ sexo);
		}

	}

}
