package br.com.alura.java.io.teste;

import java.io.File;
import java.util.Locale;
import java.util.Scanner;

public class TesteEscrita2 {

	public static void main(String[] args) throws Exception {

		
		Scanner scan = new Scanner(new File("contas.csv"));
		
		while(scan.hasNextLine()){
			String linha = scan.nextLine();
			//System.out.println(linha);
			
			Scanner linhaScan = new Scanner(linha);
			linhaScan.useLocale(Locale.US);
			linhaScan.useDelimiter(",");
			
			String tipo = linhaScan.next();
			int agencia = linhaScan.nextInt();
			int numero = linhaScan.nextInt();
			String titular = linhaScan.next();
			double saldo = linhaScan.nextDouble();
			
			System.out.format(new Locale("pt", "BR"),"%s: %04d-%08d, %s: %.2f\n" ,
								tipo, agencia, numero, titular, saldo );
			
			linhaScan.close();
		}
		scan.close();
		
		
	}

}
