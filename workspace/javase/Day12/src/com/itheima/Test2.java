package com.itheima;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.SocketException;

public class Test2 {
	public static void main(String[] args) throws IOException {
		DatagramSocket ds = new DatagramSocket(9999);
		byte[]bys=new byte[1024];
		DatagramPacket dp = new DatagramPacket(bys, bys.length);
		ds.receive(dp);
		InetAddress adress=dp.getAddress();
		byte[]data=dp.getData();
		int lenth=dp.getLength();
		System.out.println("sender"+adress.getHostAddress());
		System.out.println(new String(bys,0,bys.length));
		ds.close();
		
	}
}
