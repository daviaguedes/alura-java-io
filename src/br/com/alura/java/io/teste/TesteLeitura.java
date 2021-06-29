package br.com.alura.java.io.teste;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class TesteLeitura {

	public static void main(String[] args) throws IOException {
		
		InputStream fis = new FileInputStream("lorem.txt");
		Reader isr = new InputStreamReader(fis);
		BufferedReader br = new BufferedReader(isr);
		
		String leitura = br.readLine();
		
		while(leitura != null && !leitura.isEmpty()) {
			System.out.println(leitura);
			leitura = br.readLine();
		}
		
		br.close();
		
	}

}
