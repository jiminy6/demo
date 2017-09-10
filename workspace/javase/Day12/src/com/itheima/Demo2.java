package com.itheima;

import java.io.IOException;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

public class Demo2 {
	public static void main(String[] args) throws IOException, IOException {
		Socket s = new Socket(InetAddress.getByName("luo"),10086);
		 OutputStream os=s.getOutputStream();
		 String str="hello";
		 os.write(str.getBytes());
		 os.close();
		 s.close();
		 
		
	}
}
