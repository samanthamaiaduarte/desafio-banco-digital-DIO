package entities;

public abstract class Conta implements IConta {
	
	private static final int AGENCIA_PADRAO = 1;
	private static int SEQUENCIAL = 1;
	
	protected Integer agencia;
	protected Integer numero;
	protected Double saldo;
	
	protected Cliente titular;
	
	public Conta(Cliente titular) {
		this.agencia = AGENCIA_PADRAO;
		this.numero = SEQUENCIAL++;
		this.saldo = 0.0;
		
		this.titular = titular;
	}	

	public Integer getAgencia() {
		return agencia;
	}
	
	public Integer getNumero() {
		return numero;
	}
	
	public Double getSaldo() {
		return saldo;
	}
	
	@Override
	public void depositar(Double valor) {
		saldo += valor;
	}

	@Override
	public void transferir(Conta contaDestino, Double valor) {
		this.sacar(valor);
		contaDestino.depositar(valor);		
	}
	
	protected void imprimirInfoConta() {
		System.out.println("Agência: " + this.agencia);
		System.out.println("Conta número: " + this.numero);
		System.out.println("Titular: " + this.titular.getNome());
		System.out.printf("Saldo: %.2f%n", this.saldo);
	}

	@Override
	public String toString() {
		return "Conta [agencia=" + agencia + ", numero=" + numero + "]";
	}
	
}
