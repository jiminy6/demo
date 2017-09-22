package com.transfer;

public class Web {
public static void main(String[] args) {
	String outname="jack";
	String inname="rose";
	int money=100;
	Service service = new Service();
	service.transfer(outname,inname,money);
	
}
}
