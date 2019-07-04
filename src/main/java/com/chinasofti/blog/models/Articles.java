package com.chinasofti.blog.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="articles")
public class Articles {
	
	@Id
	@Column(name="articleid")
	private String articleId;
	
	@Column(name="title")
	private String title;
	
	@Column(name="description")
	private String description;
	
	public Articles() {
	
	}

	public Articles(String articleId, String title, String description) {
		this.articleId = articleId;
		this.title = title;
		this.description = description;
	}

	public String getArticleId() {
		return articleId;
	}

	public void setArticleId(String articleId) {
		this.articleId = articleId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return "Articles [articleId=" + articleId + ", title=" + title + ", description=" + description + "]";
	}
	
	

	
	
}
