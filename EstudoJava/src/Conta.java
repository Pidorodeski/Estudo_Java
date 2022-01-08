
public class Conta {
	private int agencia;
	private int conta;
	private double saldo;
	private String titular;

	public int getAgencia() {
		return agencia;
	}

	public int getConta() {
		return conta;
	}
	
	public boolean adicionaSaldo(double valor) {
		if(valor > 0) {
			this.saldo += valor;
			return true;
		}else {
			return false;
		}
				
	}
	
	public boolean retiraSaldo(double valor) {
		if(valor > 0 && this.saldo >= valor) {
			double valorOld = this.saldo;
			this.saldo -= valor;
			return true;
		} else {
			return false;
		}
	}
	
	public boolean transfereSaldo( double valor, Conta deposita) {
		
		
		return true;
		
	}
}
