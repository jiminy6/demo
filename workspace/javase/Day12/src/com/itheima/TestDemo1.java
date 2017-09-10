package com.itheima;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

public class TestDemo1 {
	public static void main(String[] args) throws IOException {
		DatagramSocket ds = new DatagramSocket();
		String s="hello world";
		byte[]bys=s.getBytes();
		int port =9999;
		InetAddress address=InetAddress.getByName("luowenxin");
	//	DatagramPacket dp = new DatagramPacket(bys, 0, bys.length);
		DatagramPacket dp = new DatagramPacket(bys, bys.length, address, port);
		ds.send(dp);
		ds.close();
		
		
		
		
	}
}
