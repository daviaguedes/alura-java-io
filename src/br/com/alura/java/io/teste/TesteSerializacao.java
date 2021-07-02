package br.com.alura.java.io.teste;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class TesteSerializacao {

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		
		String nome = "Davi Almeida Guedes";
		ObjectOutputStream ous = new ObjectOutputStream(new FileOutputStream("objetoTeste.bin"));
		ous.writeObject(nome);
		ous.close();
		
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("objetoTeste.bin"));
		String leitura = (String) ois.readObject();
		System.out.println(leitura);
		ois.close();
		
		
	}

}
