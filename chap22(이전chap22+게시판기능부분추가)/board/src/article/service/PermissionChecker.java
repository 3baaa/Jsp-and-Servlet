package article.service;

import article.model.Article;

public class PermissionChecker {
	public static boolean canModify(String userid,Article article) {
		return article.getWriter().getId().equals(userid);
	}
}
