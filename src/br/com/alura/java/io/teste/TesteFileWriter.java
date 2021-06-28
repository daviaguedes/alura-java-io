package br.com.alura.java.io.teste;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;

public class TesteFileWriter {

	public static void main(String[] args) throws IOException {
		
//		OutputStream fos = System.out; //new FileOutputStream("testeDeEscrita.txt");
//		Writer osw = new OutputStreamWriter(fos);
//		BufferedWriter bw = new BufferedWriter(osw);
		
		BufferedWriter bw = new BufferedWriter(new FileWriter("outroTesteDeEscrita.txt"));
		bw.write("hduiadhgasuidasd");
		bw.newLine();
		bw.write("Outro teste de escrita");
		
		bw.close();
		
	}

}
