package com.chinasofti.blog.repositories;
import org.springframework.data.repository.CrudRepository;

import com.chinasofti.blog.models.Articles;

public interface ArticleRepository extends CrudRepository<Articles, String>{

}
