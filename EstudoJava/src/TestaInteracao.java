
public class TestaInteracao {
	public static void main(String[] args) {
		Conta contaCristian = new Conta();
		Conta contaDaniela = new Conta();
		Cliente cristian = new Cliente();
		Cliente daniela = new Cliente();

		cristian.setNome("Cristian Rocha Pidorodeski");
		cristian.setCpf("001.001.001-01");
		cristian.setProfissao("Programador");

		daniela.setNome("Daniela Ferreira de Oliveira");
		daniela.setCpf("002.002.002-04");
		daniela.setProfissao("Programadora");

		contaCristian.titular = cristian;
		contaDaniela.titular = daniela;

		contaCristian.setAgencia(001);
		contaCristian.setConta(001);

		contaDaniela.setAgencia(002);
		contaDaniela.setConta(002);

		contaCristian.adicionaSaldo(1000);
		contaCristian.adicionaSaldo(500);

		contaCristian.retiraSaldo(0);

		contaCristian.transfereSaldo(500, contaDaniela);

		contaDaniela.adicionaSaldo(0);
		
		contaCristian.mostraConta();
		contaDaniela.mostraConta();
		
		contaDaniela.adicionaSaldo(50000);
		
		contaDaniela.mostraConta();
	}
}
