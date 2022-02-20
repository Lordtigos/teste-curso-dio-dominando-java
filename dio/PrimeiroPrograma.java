package com.dio;

import com.dio.br.model.ModeloGás;

public class PrimeiroPrograma {

	public static void main(String[] args) {
		ModeloGás modelogás = new ModeloGás();
		Livros livros = new Livros();
		
		System.out.println(modelogás);
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