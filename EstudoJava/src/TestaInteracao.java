
public class TestaInteracao {
	public static void main(String[] args) {
		Conta contaCristian = new Conta();
		Conta contaDaniela = new Conta();
		
		contaCristian.setAgencia(001);
		contaCristian.setConta(001);
		
		contaDaniela.setAgencia(002);
		contaDaniela.setConta(002);

		contaCristian.adicionaSaldo(1000);
		contaCristian.adicionaSaldo(500);

		contaCristian.retiraSaldo(0);

		contaCristian.transfereSaldo(500, contaDaniela);
		
		contaDaniela.adicionaSaldo(0);
	}
}