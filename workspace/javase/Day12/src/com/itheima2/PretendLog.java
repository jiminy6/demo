package com.itheima2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class PretendLog {
	public static void main(String[] args) throws IOException {
		Socket s = new Socket();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("输入你的用户名");
		String username=br.readLine();
		System.out.println("输入你的密码");
		String password=br.readLine();
		PrintWriter out = new PrintWriter(s.getOutputStream());
		out.println(username);
		out.println(password);
		// BufferedReader ServerBr = new BufferedReader(new InputStreamReader(s.getInputStream()));
		s.close();
	}
}
