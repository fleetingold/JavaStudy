package com.designpattern.j2ee.interceptingfilter;

public class AuthenticationFilter implements Filter {
	@Override
	public void execute(String request) {
		// TODO Auto-generated method stub
		System.out.println("Authenticating request: " + request);
	}
}
