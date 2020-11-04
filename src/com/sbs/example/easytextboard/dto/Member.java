package com.sbs.example.easytextboard.dto;

public class Member {
	public int id;
	public String loginId;
	public String loginPw;
	public String name;

	@Override
	public String toString() {
		return "Member [id=" + id + ", loginId=" + loginId + ", loginPw=" + loginPw + ", name=" + name + "]";
	}

}