package br.com.alura.java.io.teste;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class TesteSerializacaoCliente {

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {

		Cliente cliente = new Cliente();
		cliente.setNome("Davi");
		cliente.setProfissao("Dev");
		cliente.setCpf("234113131");
		
		ObjectOutputStream ous = new ObjectOutputStream(new FileOutputStream("cliente.bin"));
		ous.writeObject(cliente);
		ous.close();
		
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("objetoTeste.bin"));
		String leitura = (String) ois.readObject();
		System.out.println(leitura);
		ois.close();
		
		
	}

}
