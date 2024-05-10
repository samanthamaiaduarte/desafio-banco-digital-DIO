package entities;

public class ContaCorrente extends Conta {

	private Double limite;

	public ContaCorrente(Cliente titular) {
		super(titular);
		this.limite = 0.0;
	}
	
	public Double getLimite() {
		return limite;
	}	

	@Override
	public void sacar(Double valor) {
		if(saldo + limite >= valor)
			saldo -= valor;
	}

	@Override
	public void imprimirExtrato() {
		System.out.println("Extrato Conta Corrente");
		super.imprimirInfoConta();
		System.out.printf("Limite aprovado: %.2f%n", this.limite);
	}
	
	public void concederLimite(Double novoLimite) {
		this.limite = novoLimite;
	}
	
}
