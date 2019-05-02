import java.util.Scanner;

public class JavaES {
	public static void main(String[] args) {
		System.out.println("Digite seu nome: ");
		
		Scanner scanner = new Scanner(System.in);
		
		String pessoa = scanner.nextLine();
		
		System.out.println("Boa noite " +pessoa);
		System.out.println("Digite sua idade: ");
		int idade = scanner.nextInt();
		System.out.println("Você tem: "+idade);
		
	}

}
