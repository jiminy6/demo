package com.itheima2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class SeverDmeo {
	public static void main(String[] args) throws IOException {
		ServerSocket ss = new ServerSocket(8888);
		Socket s = ss.accept();
		BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
		String username = br.readLine();
		String password = br.readLine();
		boolean flag=false;
		if(username.equals("admin")&&password.equals(password)){
			flag=true;
		}
		PrintWriter out = new PrintWriter(s.getOutputStream(),true);
		if(flag){
			out.println("登陆成功");
		}
		else{
			out.print("登陆失败");
		}
		BufferedReader SeverBr = new BufferedReader(new InputStreamReader(s.getInputStream()));
		String result=SeverBr.readLine();
		s.close();

	}
}
