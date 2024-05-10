package entities;

import java.util.ArrayList;
import java.util.List;

public class Banco {
	private String nome;
	private List<Conta> contas;
	
	public Banco(String nome) {
		this.nome = nome;
		this.contas = new ArrayList<>();
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public List<Conta> getContas() {
		return this.contas;
	}
	
	public void adicionarNovaConta(Conta conta) {
		contas.add(conta);
	}
	
}
