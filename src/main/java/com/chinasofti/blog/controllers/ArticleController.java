package com.chinasofti.blog.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.chinasofti.blog.models.Articles;
import com.chinasofti.blog.services.ArticleService;


@RestController
@RequestMapping("/api")
@CrossOrigin
public class ArticleController {

	private ArticleService articleService;

	@Autowired
	public ArticleController(ArticleService articleService) {
		this.articleService = articleService;
	}
	
	@RequestMapping(value="/articles", method=RequestMethod.GET)
	public List<Articles> doListArticles() {
		List<Articles> articleList = this.articleService.findAll();
		return articleList;
	}
	
	@RequestMapping(value="/articles/{id}", method=RequestMethod.GET)
	public Articles doGetArticleById(@PathVariable("articleid") String articleId) {
		Articles article = this.articleService.findById(articleId);
		return article;
	}
}
