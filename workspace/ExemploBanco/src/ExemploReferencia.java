import javax.swing.JOptionPane;


public class ExemploReferencia {

	public static void main(String[] args) {
		
		Conta c1 = new Conta(new Cliente("Arthur",0));
		c1.depositar(100);
		
		 Conta c2 = c1;
		 c2.depositar(100);
		 
		c2 = new Conta(new Cliente("Souza",0));
		c2.depositar(50);
		
		JOptionPane.showMessageDialog(null, c1);
		JOptionPane.showMessageDialog(null, c1.getSaldo());
		
		JOptionPane.showMessageDialog(null, c2);
		JOptionPane.showMessageDialog(null, c2.getSaldo());

	}

}
