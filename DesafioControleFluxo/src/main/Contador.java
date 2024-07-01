package main;

import java.util.Scanner;

import exceptions.ParametrosInvalidosException;

public class Contador {
	public static void main(String[] args) {
		mensagemInicial();
		int[] nums = new int[2];
		boolean numerosInvalidos = true;
		
		try {
			nums= scanNumeros();
			numerosInvalidos = false;
		} catch (ParametrosInvalidosException e) {
			e.printStackTrace();
			return;
		}			
		
		System.out.println("=================\nContando...");
		for(int i = nums[0]; i <= nums[1]; ++i) {
			System.out.println(i);
		}
	}
	
	static int[] scanNumeros() throws ParametrosInvalidosException {
		Scanner  sc = new Scanner(System.in);
		
		System.out.printf("primeiro número: ");
		int n1 = sc.nextInt();
		System.out.println("segundo número: ");
		int n2 = sc.nextInt();
		
		sc.close();
		
		if(n1 >= n2)
			throw new ParametrosInvalidosException("O primeiro deve ser menor que o segundo");
		
		return new int[]{n1, n2};
	}
	
	static void mensagemInicial() {
		System.out.println("Esse é o projeto contador");
		System.out.println("Digite dois números inteiros, o primeiro deve ser menor que o segundo");
	}
}
