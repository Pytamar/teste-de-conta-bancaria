package entidade;

public class Conta {
	
	private int Numero;
	private String Conta;
	private double valor;
	
	
	public Conta(int numero, String conta) {
		this.Numero = numero;
		this.Conta = conta;
	}
	
	public Conta(int numero, String conta, double depositoInicial) {
		this.Numero = numero;
		this.Conta = conta;
		Deposito(depositoInicial);
	}

	public int getNumero() {
		return Numero;
	}

	public String getConta() {
		return Conta;
	}

	public void setConta(String conta) {
		Conta = conta;
	}

	public double getValor() {
		return valor;
	}
	
	public void Deposito(double deposito) {
		valor+= deposito;
	}
	public void Saque (double saque) {
		valor-= saque + 5.0; //5.0 é a taxa que há no saque
	}
	
	public String toString() {
		return "Conta " + Numero + ", titular " + Conta + ", extrato: R$: " + String.format("%.2f", valor);
	}
}
 