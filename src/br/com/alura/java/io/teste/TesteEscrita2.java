package br.com.alura.java.io.teste;

import java.io.File;
import java.util.Scanner;

public class TesteEscrita2 {

	public static void main(String[] args) throws Exception {

		
		Scanner scan = new Scanner(new File("contas.csv"));
		
		while(scan.hasNextLine()){
			String linha = scan.nextLine();
			System.out.println(linha);
		}
		scan.close();
		
		
	}

}
