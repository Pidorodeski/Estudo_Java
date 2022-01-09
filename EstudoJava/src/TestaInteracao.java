
public class TestaInteracao {
	public static void main(String[] args) {
		Conta contaCristian = new Conta();
		Conta contaDaniela = new Conta();

		Cliente cristian = new Cliente();
		Cliente daniela = new Cliente();

		Endereco enderecoCristian = new Endereco();
		Endereco enderecoDaniela = new Endereco();

		enderecoCristian.setEstado("Parana");
		enderecoCristian.setCidade("Cascavel");
		enderecoCristian.setCep("85806-025");
		enderecoCristian.setNumero(420);

		enderecoDaniela.setEstado("Bahia");
		enderecoDaniela.setCidade("Salvador");
		enderecoDaniela.setCep("80806-025");
		enderecoDaniela.setNumero(123);

		cristian.endereco = enderecoCristian;
		// daniela.endereco = enderecoDaniela;
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
		contaCristian.adicionaSaldo(200);

		contaDaniela.mostraConta();
		contaCristian.mostraConta();
	}
}
