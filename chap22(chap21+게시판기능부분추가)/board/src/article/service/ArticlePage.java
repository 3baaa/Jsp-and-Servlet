package article.service;

import java.util.List;

import article.model.Article;

public class ArticlePage {
	private int total;
	private int currentPage;
	private List<Article> content;
	private int totalPages;
	private int startPage;
	private int endPage;
	public ArticlePage(int total, int currentPage,int size, List<Article> content, int totalPages, int startPage, int endPage) {
		this.total = total;
		this.currentPage = currentPage;
		this.content = content;
		if(total == 0) {
			this.totalPages = 0;
			this.startPage = 0;
			this.endPage = 0;
		}else {
			totalPages = total / size;
			if(total % size > 0) {
				totalPages++;
			}
			int modVal = currentPage % 5;
			startPage = currentPage / 5*5 + 1;
			if(modVal==0) startPage -= 5;
			
			endPage = startPage + 4;
			if(endPage > totalPages) endPage = totalPages;
		}
	}
	public int getTotal() {
		return total;
	}
	
	public boolean hasNoArticles() {
		return total == 0;
	}
	
	public boolean hasArticles() {
		return total > 0;
	}
	
	public int getCurrentPage() {
		return currentPage;
	}
	public List<Article> getContent() {
		return content;
	}
	public int getTotalPages() {
		return totalPages;
	}
	public int getStartPage() {
		return startPage;
	}
	public int getEndPage() {
		return endPage;
	}
	
	
	
}
