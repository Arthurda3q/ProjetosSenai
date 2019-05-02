import java.util.*;

import javax.swing.JOptionPane;

public class Ativ2 {

	public static void main(String[] args) {

		int[] array = new int[10];
		int maior = 0;
		int menor = 0;
		int numero = 0;

		for (int i = 0; i < array.length; i++) {
			numero = Integer.parseInt(JOptionPane
					.showInputDialog("Digite um numero"));
			if (numero >5){
				maior += numero;
				
			}
			if (numero <=5){
				menor += numero;
				
			}
		}
		JOptionPane.showMessageDialog(null, "Numero Menor: "+menor +"\n"+"Numero Maior: "+ maior);
	}

}
