package com.itheima;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Demo3 {
	public static void main(String[] args) throws IOException {
		ServerSocket ss = new ServerSocket(10086);
		Socket s=ss.accept();
		InputStream is=s.getInputStream();
		byte[]bys=new byte[1024];
		int len;
		while((len=is.read())!=-1){
			System.out.println(new String(bys,0,len));
		}
		s.close();
		ss.close();
		
		
	}
}
