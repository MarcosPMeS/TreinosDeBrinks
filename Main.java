package application;

import java.util.Scanner;

import entities.Bb;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Bb bb;
		
		System.out.println("Qual o numero da sua conta");
		int numConta = sc.nextInt();
		
		System.out.println("Digite seu nome: ");
		sc.nextLine();
		String name = sc.nextLine();
		
		System.out.println("Digite sua senha");
		int senha = sc.nextInt();
	
		
		
		System.out.println();
		System.out.println("Login");
		System.out.println();
		
		System.out.println("Digite seu numero da conta");
		int response2 = sc.nextInt();
		
		System.out.println("Digite sua senha");
		int response3 = sc.nextInt();
		
		
		if(response2 == numConta && response3 == senha) {
			
			System.out.println("voce quer fazer um deposito inicial ? (y/n)");
			char response = sc.next().charAt(0);
			
			if(response == 'y') {
				System.out.println("Qual o valor do deposito inicial");
				double contaBanco = sc.nextDouble();
				bb = new Bb(numConta, name, contaBanco);
			}else {
				bb = new Bb(numConta, name);
			}
			
			System.out.println("Conta do banco: ");
			System.out.println(bb);
			System.out.println();
			
			while (response != 'e') {
			System.out.println();
			System.out.println("Deseja um fazer um deposito ou um saque ou sair? digite (e) para sair (d/s/e)");
			response = sc.next().charAt(0);
			
			
			if(response == 'd' ) {
				System.out.println("Qual o valor do deposito");
				double deposito = sc.nextDouble();
				bb.depositMoney(deposito);
			}else if(response == 's') {
				System.out.println("Qual o valor de saque");
				double saque = sc.nextDouble();
				bb.saqueMoney(saque);
			}else {
				System.out.println();
			}
			
			System.out.println("Conta do banco: ");
			System.out.println(bb);
			
			}
		}else {
			System.out.println("Usuario ou senha invalida, tente novamente mais tarde");
		}
		sc.close();
	}

}
