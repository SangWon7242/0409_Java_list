package com.sbs.java.ssg.container;

import com.sbs.java.ssg.dao.ArticleDao;
import com.sbs.java.ssg.dao.MemberDao;

public class container {
	public static ArticleDao articleDao;
	
	public static MemberDao memberDao;
	
	static {
		articleDao = new ArticleDao();
		memberDao = new MemberDao();
	}
}
