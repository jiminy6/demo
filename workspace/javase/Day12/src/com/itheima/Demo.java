package com.itheima;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.SocketException;

public class Demo {
	public static void main(String[] args) throws IOException {
		DatagramSocket d = new DatagramSocket();
		byte[]bys="im coming".getBytes();
		DatagramPacket dp = new DatagramPacket(bys, bys.length);
		d.receive(dp);
		InetAddress address=dp.getAddress();
		
	}
}
