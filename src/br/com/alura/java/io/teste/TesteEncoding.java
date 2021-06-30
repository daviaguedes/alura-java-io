package br.com.alura.java.io.teste;

import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

public class TesteEncoding {

	public static void main(String[] args) throws UnsupportedEncodingException {

		
		String s = "ç";
		System.out.println(s.codePointAt(0));
		
		Charset charset = Charset.defaultCharset();
		System.out.println(charset.displayName());
		
		byte[] bytes = s.getBytes("windows-1252");
		System.out.print(bytes.length + " " + " windows-1252 ");
		
		String novoS = new String(bytes, "windows-1252");
		System.out.println(novoS);
		
		bytes = s.getBytes("UTF-16");
		System.out.print(bytes.length + " " + " UTF-16 " );
		novoS = new String(bytes, "UTF-16");
		System.out.println(novoS);
		
		bytes = s.getBytes(StandardCharsets.US_ASCII);
		System.out.print(bytes.length + " " + " US-ASCII " );
		novoS = new String(bytes, "US-ASCII");
		System.out.println(novoS);
		
	}

}
