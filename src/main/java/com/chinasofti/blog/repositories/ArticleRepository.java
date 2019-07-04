package com.chinasofti.blog.repositories;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.chinasofti.blog.models.Articles;


@Repository
public interface ArticleRepository extends CrudRepository<Articles, String>{
	
}
