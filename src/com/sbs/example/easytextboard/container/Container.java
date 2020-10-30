package com.sbs.example.easytextboard.container;

import com.sbs.example.easytextboard.session.Session;

public class Container {   //프로그램이 종료될때까지 정보를 기억하는? 공간
	public static Session session;

	static {
		session = new Session();
	}
}