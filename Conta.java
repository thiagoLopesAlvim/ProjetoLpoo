package Projeto;

public class Conta implements Transacao{
	private String nome,cpf;
	private int numero;
	private double valor_na_conta;
	
	public Conta(String nome, String cpf, int numero, double valor_na_conta) {
		super();
		this.nome = nome;
		this.cpf = cpf;
		this.numero = numero;
		this.valor_na_conta = valor_na_conta;
	}
	
	
	public void deposito(double valor){
		this.valor_na_conta += valor;
	};
	public boolean saque(double valor){
		if(valor > this.valor_na_conta){
			return false;
		}else{
			this.valor_na_conta = this.valor_na_conta - valor;
			return true;
		}
	};
	public  double saldo(){
		return this.valor_na_conta;
	};
	public boolean transferencia(double valor, Conta outraconta){
		if(valor > this.valor_na_conta){
			return false;
		}else{
			this.valor_na_conta = this.valor_na_conta - valor;
			outraconta.setValor_na_conta(outraconta.getValor_na_conta() + valor);
			return true;
		}
		
	};
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public double getValor_na_conta() {
		return valor_na_conta;
	}
	public void setValor_na_conta(double valor_na_conta) {
		this.valor_na_conta = valor_na_conta;
	}

	
	
}
