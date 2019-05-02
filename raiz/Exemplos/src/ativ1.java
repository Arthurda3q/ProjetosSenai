import javax.swing.JOptionPane;


public class ativ1 {

	public static void main(String[] args) {
		
		int n1 = Integer.parseInt(JOptionPane.showInputDialog ("Digite o valor de N1"));
		int n2 = Integer.parseInt(JOptionPane.showInputDialog ("Digite o valor de N2"));
		String tudo = "";
		
		for (int i = n1; i < n2; i++) {
			tudo += Integer.toString(i);
			tudo += "";
			
			
			
		}
		JOptionPane.showMessageDialog(null, tudo);

	}

}
