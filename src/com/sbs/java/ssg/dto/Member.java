package com.sbs.java.ssg.dto;

public class Member extends Dto {
	public int id;
	public String regDate;
	public String loginId;
	public String loginPw;
	public String name;
	
	
	public Member(int id, String regDate, String loginId, String loginPw, String name) {
		this.id = id;
		this.regDate = regDate;
		this.loginId = loginId;
		this.loginPw = loginPw;
		this.name = name;
	}
	
	
}