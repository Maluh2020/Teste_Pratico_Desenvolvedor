package entities;

import java.util.Scanner;

public class Menu extends Cadastro_pf{
	
	public void cadastro() {
		Scanner input = new Scanner(System.in);
		
		System.out.println();
		System.out.println("Cadastrar");
		System.out.println();
		System.out.println();
		
		
		System.out.print("Nome: ");
		setNome(input.nextLine());
		System.out.print("CPF: ");
		setCpf(input.nextLine());
		System.out.print("Email: ");
		setEmail(input.nextLine());
		System.out.print("Senha: ");
		setSenha(input.nextLine());
		System.out.println();
		
		System.out.println("Seu cadastro foi realizado com sucesso!!");
		System.out.println("Voltar para o menu principal");
		
		menuInicial();
		
	}
	
	public void login(String email, String senha) {
		Scanner input = new Scanner(System.in);
		
		System.out.println();
		System.out.println("Logar");
		System.out.println();
		
		System.out.print("Email: ");
		email = input.nextLine();
		System.out.print("Senha: ");
		senha = input.nextLine();
		
		if (email.equals(getEmail()) == true && senha.equals(getSenha()) == true) {
			System.out.println("Login realizado com sucesso!");
			System.out.println();

			System.out.println("Seja bem vindo à Oliveira Trade!!!");
			System.out.println("Nome: "+ getNome());
			System.out.println("Email: "+ getEmail());
			System.out.println("cpf: "+ getCpf());
			System.out.println();
			System.out.println("Voltar para o menu principal");
			menuInicial();
			
		} else { 
			System.out.println("Login invalido! Tente novamente");
			this.login(null, null);

		}
	}
	
	public void menuInicial() {
		Scanner input = new Scanner(System.in);

		System.out.println();
		System.out.println(" Seja bem vindo à Oliveira Trade!!! ");
		System.out.println();

		System.out.println("(1) - Cadastro ");
		System.out.println("(2) - Login ");
		System.out.print("Digite uma opção: ");
		int op = input.nextInt();

		if (op == 1) {
			cadastro();
		} else if (op == 2) {
			login(null, null);
		} else {
			System.out.println("Opção invalida! tente novamente...");
			menuInicial();
		}
	
		
	}
	
	
}
	
