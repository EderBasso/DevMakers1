package com.letscode;

public class Main {

    public static void main(String[] args) {
	Pessoa pessoa1 = new Pessoa();

    pessoa1.idade = 30;
    pessoa1.vivo = true;

    pessoa1.setNome("Eder");
    System.out.println(pessoa1.getNome());
    }
}
