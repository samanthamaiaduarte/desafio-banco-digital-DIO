package entities;

public class ContaPoupanca extends Conta {

	public ContaPoupanca(Cliente titular) {
		super(titular);
	}
	
	@Override
	public void sacar(Double valor) {
		if(saldo > valor)
			saldo -= valor;
	}
	
	@Override
	public void imprimirExtrato() {
		System.out.println("Extrato Conta Poupança");
		super.imprimirInfoConta();
	}


}
