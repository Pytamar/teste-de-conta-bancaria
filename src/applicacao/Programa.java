package applicacao;

import java.util.Scanner;

import entidade.Conta;

public class Programa {
	
	public static void main(String[] args) {
		
		Conta conta;
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Entre com o numero da conta: ");
		int numero = teclado.nextInt();
		
		System.out.print("Entre com o nome do pertecente da conta: ");
		teclado.nextLine();
		String nome = teclado.nextLine();
		
		System.out.println("Tem deposito inicial (S/N)? ");
		char resposta = teclado.next().charAt(0);
		
		if(resposta == 'S') {
			System.out.print("Entre com o deposito inicial ");
			double depositoInicial = teclado.nextDouble();
			conta = new Conta(numero, nome, depositoInicial);
		}
		else {
			conta = new Conta(numero, nome);
		}
		
		System.out.println( );
		System.out.print("Informações da conta: ");
		System.out.print(conta);
		
		System.out.println( );
		System.out.print("Entre com um valor de deposito: ");
		double depositoValor = teclado.nextDouble();
		conta.Deposito(depositoValor);
		System.out.println( );
		System.out.print("Conta atualizada: ");
		System.out.println(conta);
		System.out.println( );
		
		System.out.print("Entre com um valor de saque: ");
		double saqueValor = teclado.nextDouble();
		conta.Saque(saqueValor);
		System.out.println( );
		System.out.print("Conta atualizada:");
		System.out.println(conta);
		
		
		teclado.close();
	}

}
