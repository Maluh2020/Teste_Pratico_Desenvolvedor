package entities;

import java.util.ArrayList;
import java.util.List;

public class Cadastro_pf {
	
	private String nome;
	private String cpf;
	private String email;
	private String senha;
	
	protected List<Cadastro_pf> list = new ArrayList<>();
	
	public Cadastro_pf(String nome, String cpf, String email, String senha) {
		this.nome = nome;
		this.cpf = cpf;
		this.email = email;
		this.senha = senha;
	}
	//Construtor
	public Cadastro_pf() {
		
	}


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


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getSenha() {
		return senha;
	}


	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	public List<Cadastro_pf> getList(){
		return list;
	}
	
	public void adicionarList(Cadastro_pf cadastro){
		list.add(cadastro);
	}
	
	public void removerList(Cadastro_pf cadastro){
		list.remove(cadastro);
	}
	
	@Override
	public boolean equals(Object objeto){
		if(this == objeto){
			return true;
		}
		
		if(objeto == null){
			return false;
		}
		
		if (getClass() != objeto.getClass())
			return false;
		Cadastro_pf other = (Cadastro_pf) objeto;
		
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
			
			return false;
		if (senha == null) {
			if (other.senha != null)
				return false;
		} else if (!senha.equals(other.senha))
			return false;
		return true;
	}

}
