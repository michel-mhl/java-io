package br.com.alura.java.io.teste;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

public class TesteCopiarArquivo {

	public static void main(String[] args) throws IOException {

		Socket s = new Socket();// seria uma entrada e saida de rede usando o Socket
		
		InputStream fis =System.in;// s.getInputStream();//new FileInputStream("lorem.txt");
		Reader isr = new InputStreamReader(fis);
		BufferedReader br = new BufferedReader(isr);

		OutputStream fos =  new FileOutputStream("lorem2.txt");  //s.getOutputStream();//System.out;//
		Writer osr = new OutputStreamWriter(fos);
		BufferedWriter bw = new BufferedWriter(osr);

		String linha = br.readLine();
		while (linha != null && !linha.isEmpty()) {
			bw.write(linha);//
			bw.newLine();// cria uma nova linha 
			bw.flush();// descarga ele finaliza o processo e envia a msg apos apertar o enter
			linha = br.readLine();
		}
		System.out.println(" Deu certo");
		br.close();
		bw.close();

	}

}
