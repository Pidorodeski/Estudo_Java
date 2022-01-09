
public class Conta {
	private int agencia;
	private int conta;
	private double saldo;
	Cliente titular;

	public int getAgencia() {
		return agencia;
	}

	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}

	public int getConta() {
		return conta;
	}

	public void setConta(int conta) {
		this.conta = conta;
	}

	public double getSaldo() {
		return saldo;
	}

	public boolean adicionaSaldo(double valor) {
		if (valor > 0) {
			double saldoOld = this.saldo;
			this.saldo += valor;
			System.out.println("Adicionaro o valor R$ " + valor + " para o saldo R$ " + saldoOld + ".");
			System.out.println("Novo saldo para a conta " + this.conta + " é de R$ " + this.saldo + ".");
			System.out.println();
			return true;
		} else {
			System.out.println("Não possivel adicionar o saldo pois o valor " + valor + " não atende aos critérios.");
			System.out.println("O saldo da conta " + this.conta + " ainda é de R$ " + this.saldo + ".");
			System.out.println();
			return false;
		}
	}

	public boolean retiraSaldo(double valor) {
		if (valor > 0 && this.saldo >= valor) {
			double saldoOld = this.saldo;
			this.saldo -= valor;
			System.out.println("Realizado o saque de R$ " + valor + " para o saldo de R$ " + saldoOld + ".");
			System.out.println("Novo saldo para a conta " + this.conta + " é de R$ " + this.saldo + ".");
			return true;
		} else {
			System.out.println("Sque não realizado, verifique o valor do saque ou o saldo em conta e tente novamente.");
			System.out.println("O saldo da conta " + this.conta + " ainda é de R$ " + this.saldo + ".");
			System.out.println();
			return false;
		}
	}

	public boolean transfereSaldo(double valor, Conta deposita) {
		System.out.println("Transferência realizada com sucesso:");
		this.retiraSaldo(valor);
		deposita.adicionaSaldo(valor);
		return true;
	}

	public void mostraConta() {
		System.out.println("Nome usuario: " + this.titular.getNome());
		System.out.println("CPF: " + this.titular.getCpf());
		System.out.println("Profissao: " + this.titular.getProfissao());
		System.out.println("Agencia: " + this.agencia + ". Conta: " + this.conta + ".");
		System.out.println("Saldo em conta: " + this.saldo);
		System.out.println();
	}

}
