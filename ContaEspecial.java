package Projeto;

public class ContaEspecial extends Conta{
	private double limite;

	public ContaEspecial(String nome, String cpf, int numero,
			double valor_na_conta, double limite) {
		super(nome, cpf, numero, valor_na_conta);
		this.limite = limite;
	}


}
	
