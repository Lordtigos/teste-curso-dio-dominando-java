package com.dio;

import com.dio.br.model.ModeloG�s;

public class PrimeiroPrograma {

	public static void main(String[] args) {
		ModeloG�s modelog�s = new ModeloG�s();
		Livros livros = new Livros();
		
		System.out.println(modelog�s);
		System.out.println(livros);
		
		/*int a = 2;
		int b = 3;
		System.out.println("Hello World! " + (a+b));*/
	}
}


class Livros {
	private String nome;
	private String npag;
}