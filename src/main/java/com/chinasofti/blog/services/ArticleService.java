package com.chinasofti.blog.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chinasofti.blog.models.Articles;
import com.chinasofti.blog.repositories.ArticleRepository;

@Service
public class ArticleService {
	
	private ArticleRepository articleRepository;
	
	@Autowired
	public ArticleService(ArticleRepository articleRepository) {
		this.articleRepository = articleRepository;
	}

	public List<Articles> findAll(){
		List<Articles> articleList = (List<Articles>) this.articleRepository.findAll();
		return articleList;
	}
		
	public Articles findById(String articleId) {
		return this.articleRepository.findById(articleId).orElse(null);
	}	
}
