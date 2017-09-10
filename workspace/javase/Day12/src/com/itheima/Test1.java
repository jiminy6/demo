package com.itheima;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

public class Test1 {
	public static void main(String[] args) throws IOException {
		DatagramSocket dc = new DatagramSocket();
		String s="hello,im coming";
		byte[]bys=s.getBytes();
		int length=bys.length;
		InetAddress adress=InetAddress.getByName("luowenxin");
		int port =9999;
		DatagramPacket dp = new DatagramPacket(bys, bys.length, port);
		dc.send(dp);
		dc.close();
		
		
	}
}
