package br.com.alura.java.io.teste;

import java.io.IOException;
import java.io.PrintStream;

public class TestePrintStream {

	public static void main(String[] args) throws IOException {
		
//		OutputStream fos = System.out; //new FileOutputStream("testeDeEscrita.txt");
//		Writer osw = new OutputStreamWriter(fos);
//		BufferedWriter bw = new BufferedWriter(osw);
		
//		FileWriter fw = new FileWriter("outroTesteDeEscrita.txt");
//		BufferedWriter bw = new BufferedWriter(fw);
		
		PrintStream ps = new PrintStream("testePrintStream.txt");
		ps.println("asdvJHGSVDhgasd");
		ps.println();
		ps.println();
		ps.println("Teste PrintStream");
		
//		bw.write("hduiadhgasuidasd");
//		bw.newLine();
//		bw.write("Outro teste de escrita");
//		
//		bw.close();
		
	}

}
