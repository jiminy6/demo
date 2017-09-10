package com.itheima;

import java.io.IOException;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

public class ClientDemo {
	public static void main(String[] args) throws IOException, IOException {
		Socket s = new Socket(InetAddress.getByName("luowenxin"),8888);
		OutputStream os=s.getOutputStream();
		String str="nihaoya";
		os.write(str.getBytes());
		os.close();
	}
}
