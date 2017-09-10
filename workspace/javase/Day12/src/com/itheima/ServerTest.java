package com.itheima;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerTest {
	public static void main(String[] args) throws IOException {
		ServerSocket ss = new ServerSocket(8888);
		Socket s=ss.accept();
		InputStream is=s.getInputStream();
		byte[]bys=new byte[1024];
		int len=is.read();
		String str=new String(bys,0,len);
		String str1=str.toUpperCase();
		OutputStream os=s.getOutputStream();//
		os.write(str1.getBytes());//
		InetAddress adress=s.getInetAddress();
		System.out.println("Client"+adress.getHostAddress());
		System.out.println(new String (bys,0,len));
		s.close();
		
	}
}
