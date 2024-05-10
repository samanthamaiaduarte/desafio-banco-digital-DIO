package application;

import entities.Banco;
import entities.Cliente;
import entities.Conta;
import entities.ContaCorrente;
import entities.ContaPoupanca;

public class Main {

	public static void main(String[] args) {
		Banco banco = new Banco("Banco DIO");
		
		Cliente mariaGreen = new Cliente("Maria Green");
		Cliente alexBrown = new Cliente("Alex Brown");
		
		Conta cc = new ContaCorrente(mariaGreen);
		banco.adicionarNovaConta(cc);
		
		Conta cp = new ContaPoupanca(alexBrown);
		banco.adicionarNovaConta(cp);
		
		System.out.println("Deposito de $500:");
		cc.depositar(500.0);
		cc.imprimirExtrato();
		
		System.out.println();
		System.out.println("Transferência de $150:");
		cc.transferir(cp, 150.0);
		cc.imprimirExtrato();
		cp.imprimirExtrato();

		System.out.println();
		System.out.println("Contas do banco: " + banco.getNome());
		System.out.println(banco.getContas());
	}

}
