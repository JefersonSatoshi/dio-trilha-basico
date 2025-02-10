package application;

import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Por gentileza, preencha os campos abaixo para criar sua conta!");
		System.out.print("Numero da conta: ");
		int numConta = sc.nextInt();
		sc.nextLine();
		
		System.out.print("Agência: ");
		String numAgencia = sc.nextLine();
		
		System.out.print("Nome Completo: ");
		String nomeCliente = sc.nextLine();
		
		System.out.print("Saldo: ");
		double saldoConta = sc.nextDouble();
		
		System.out.println();
		System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " 
		+ numAgencia + ", conta " + numConta + " e seu saldo " + saldoConta + " já está disponível para saque.");
		
		sc.close();
	}

}
