package com.sbs.example.easytextboard.session;

public class Session {  //로그인 여부를 기억하는 Container 보조 공간?
	public int loginedMemberId;
	
	public boolean isLogined() {
		return loginedMemberId != 0;
	}
}